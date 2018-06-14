package com.yangsir.project.test;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangsir.project.beans.CostBean;
import com.yangsir.project.costmag.handleservice.ICostHandleService;
import com.yangsir.project.costmag.queryservice.ICostQueryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class CostTest {

	
	@Resource
	private ICostHandleService costHandleServiceImpl;
	@Resource
	private ICostQueryService costQueryServiceImpl;
	
	@Test
	public void savaCostBean() {
		CostBean cost = new CostBean();
		cost.setCostName("全球通");
		cost.setCostType(1);
		cost.setCostExplain("wefnwerwafasdf");
		cost.setCostBase(58);
		cost.setCostUnit(90);
		cost.setCostStart(new Date());
		cost.setCostTime(1);
		CostBean bean = costHandleServiceImpl.saveCostBean(cost);
		System.out.println(bean);
	}
	
	@Test
	public void getCostBeanById() {
		CostBean bean = costQueryServiceImpl.getCostBeanById(1l);
		System.out.println(bean);
	}
	
	@Test
	public void updateCostBean() {
		CostBean cost = costQueryServiceImpl.getCostBeanById(1l);
		System.out.println(cost);
		cost.setId(1l);
		cost.setCostName("超级大王卡");
		costHandleServiceImpl.updateCostBean(cost);
	}
	@Test
	public void deleteCostBean() {
		CostBean cost = costQueryServiceImpl.getCostBeanById(3l);
		costHandleServiceImpl.deleteCostBean(cost);
	}
}
