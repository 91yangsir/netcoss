package com.framestudy.springjpa.custommag.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.framestudy.springjpa.beans.CustomerBean;
import com.framestudy.springjpa.utils.DateUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestCustomerServiceImpl {

	@Resource
	private ICustomerService customerServiceImpl;

	@Test
	public void findCustomersByParamsToPager() {

		CustomerBean customer = new CustomerBean();
		customer.setCustomerName("库");
		customer.setTelphone("135");
		// customer.setGender(1);

		try {
			Date startTime = DateUtils.string2Date("2018-05-30", "yyyy-MM-dd");
			Date endTime = DateUtils.string2Date("2018-06-05", "yyyy-MM-dd");
			customer.setStartTime(startTime);
			customer.setEndTime(endTime);

		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// 按照出生日期进行排序
		Pageable pageRequest = new PageRequest(0, 10, Direction.DESC, "birthday");

		Page<CustomerBean> page = null;
		try {
			page = customerServiceImpl.findCustomersByParamsToPager(customer, pageRequest);

			System.out.println(page.getNumber());// 当前页码 == page
			System.out.println(page.getNumberOfElements());// 元素的个数
			System.out.println(page.getSize());// 每页需要显示的数据 == rows
			System.out.println(page.getTotalElements());// 满足条件的总元素的个数
			System.out.println(page.getTotalPages());// 总页数
			System.out.println(page.getContent());// 具体的分页数据
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void testSaveCustomerBeans() {
		List<CustomerBean> customers = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			CustomerBean customer01 = new CustomerBean();
			customer01.setCustomerName("库日天" + i);
			customer01.setGender(1);
			customer01.setLoginName("krt");
			customer01.setTelphone("13532434512");
			customers.add(customer01);
		}

		customerServiceImpl.saveCustomerBeans(customers);

	}

	@Test
	public void testDeleteCustomerBeans() {
		String customerName = "小";
		String telphone = "133";
		List<?> datas = customerServiceImpl.findCustomersByParams(customerName, telphone);
		System.out.println(datas);

		customerServiceImpl.deleteCustomerBeans((List<CustomerBean>) datas);

	}

	@Test
	public void testFindCustomersByParamsToPager() {
		String customerName = "小";
		String telphone = "133";
		// jpa中第一页为0
		Pageable pageRequest = new PageRequest(0, 10, Direction.DESC, "birthday");

		try {
			Page<CustomerBean> page = customerServiceImpl.findCustomersByParamsToPager(customerName, telphone,
					pageRequest);
			System.out.println(page.getNumber());// 当前页码 == page
			System.out.println(page.getNumberOfElements());// 元素的个数
			System.out.println(page.getSize());// 每页需要显示的数据 == rows
			System.out.println(page.getTotalElements());// 满足条件的总元素的个数
			System.out.println(page.getTotalPages());// 总页数
			System.out.println(page.getContent());// 具体的分页数据

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testFindCustomersByMap() {
		String customerName = "小";
		String telphone = "133";
		Map params = new HashMap<>();
		params.put("customerName", customerName);
		params.put("telphone", telphone);
		// List<?> datas = customerServiceImpl.findCustomersByMap(params);
		// System.out.println(datas);
	}

	@Test
	public void testFindCustomersByParams() {
		String customerName = "小";
		String telphone = "133";
		List<?> datas = customerServiceImpl.findCustomersByParams(customerName, telphone);
		System.out.println(datas);
	}

	@Test
	public void testFindCustomersByCustomerNameAndCustomerTelphone() {

		String customerName = "小";
		String telphone = "133";

		List<?> datas = customerServiceImpl.findCustomersByCustomerNameAndCustomerTelphone(customerName, telphone);
		System.out.println(datas);
	}

	@Test
	public void testDeleteCustomerBean() {
		CustomerBean customer = customerServiceImpl.getCustomerBean(240l);
		System.out.println(customer);
		customerServiceImpl.deleteCustomerBean(customer);
	}

	@Test
	public void testUpdateCustomerBean() {
		CustomerBean customer = customerServiceImpl.getCustomerBean(241l);
		System.out.println(customer);
		Date birthday;
		try {
			birthday = DateUtils.string2Date(DateUtils.date2String(new Date(), "yyyy-MM-dd"), "yyyy-MM-dd");
			customer.setBirthday(birthday);
			customerServiceImpl.updateCustomerBean(customer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// getOne()会抛出no session的问题，解决方案：
	// 在web.xml中，配置OpenEntityManagerInViewFilter
	@Test
	public void testGetCustomerBean() {
		CustomerBean customer = customerServiceImpl.getCustomerBean(241l);
		System.out.println(customer);

	}

	@Test
	public void testSaveCustomerBean() {
		CustomerBean customer = new CustomerBean();
		customer.setCustomerName("库日天");
		customer.setGender(1);
		customer.setLoginName("krt");
		customer.setTelphone("13532434512");
		customerServiceImpl.saveCustomerBean(customer);
	}

}
