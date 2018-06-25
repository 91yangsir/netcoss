package com.project.cost.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.CostBean;
import com.yangsir.project.beans.Pager;
import com.yangsir.project.costmag.handleservice.ICostHandleService;
import com.yangsir.project.costmag.queryservice.ICostQueryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class CostTest {

	
	@Resource
	private ICostHandleService costHandleServiceImpl;
	@Resource
	private ICostQueryService costQueryServiceImpl;
	
	/**
	 * 增加资费
	 * @throws ParseException
	 */
	@Test
	public void savaCostBean() throws ParseException {
		CostBean cost = new CostBean();
		cost.setCostName("纪念月活动");
		cost.setCostType(1);
		cost.setCostExplain("资费只要700元");
		cost.setCostBase(33);
		cost.setCostUnit(11);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(new Date());
		Date date2 = sdf.parse(date);
		cost.setCostStart(date2);
		cost.setCostTime(1);
		CostBean bean = costHandleServiceImpl.saveCostBean(cost);
		System.out.println(bean);
	}
	
	/**
	 * 查询资费对象
	 */
	@Test
	public void getCostBeanById() {
		CostBean bean = costQueryServiceImpl.getCostBeanById(25l);
		System.out.println(bean);
	}
	
	/**
	 * 修改资费类型
	 */
	@Test
	public void updateCostBean() {
		CostBean cost = costQueryServiceImpl.getCostBeanById(1l);
		System.out.println(cost);
		cost.setId(1l);
		cost.setCostName("超级大王卡");
		costHandleServiceImpl.updateCostBean(cost);
	}
	
	/**
	 * 删除资费
	 */
	@Test
	public void deleteCostBean() {
		CostBean cost = costQueryServiceImpl.getCostBeanById(11l);
		costHandleServiceImpl.deleteCostBean(cost);
	}
	/**
	 * 分页显示所有的对象
	 */
	@Test
	public void findAllPagerCostBean() {
		Pager pager = new Pager(2,3);
		System.out.println(costQueryServiceImpl.findAllCostBean(pager));
	}
	/**
	 * 查询使用此资费对象下所有的业务账号个数
	 */
	@Test
	public void getCostBeanByBusinessBeanNums() {
		int num = costQueryServiceImpl.getCostBeanByBusinessBeanNums(23l);
		System.out.println(num);
	}
		
	/**
	 * 查询所有的资费对象	
	 */
	@Test
	public void findAllCostBean() {
		List<CostBean> list = costQueryServiceImpl.getFindAllCostBean();
		System.out.println(list);
	}
	
}
