package com.framestudy.springjpa.custommag.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.framestudy.springjpa.beans.CustomerBean;

public interface ICustomerService {
	
	
	
	/**
	 * 按照条件完成分页查询
	 * @param customer
	 * @param page
	 * @return
	 * @throws Exception
	 */
	public Page<CustomerBean> findCustomersByParamsToPager(CustomerBean customer,Pageable page)throws Exception;
	
	
	/**
	 * 批量的新增
	 * @param customers
	 * @return
	 */
	public List<CustomerBean> saveCustomerBeans(List<CustomerBean> customers);
	/**
	 * 批量的删除
	 * @param customers
	 */
	public void deleteCustomerBeans(List<CustomerBean> customers);
	
	/**
	 * 新增客户
	 * @param customer
	 */
	public CustomerBean saveCustomerBean(CustomerBean customer);
	
	/**
	 * 修改客户
	 * @param customer
	 */
	public CustomerBean updateCustomerBean(CustomerBean customer);
	
	/**
	 * 删除客户
	 * @param customer
	 */
	public void deleteCustomerBean(CustomerBean customer);
	/**
	 * 根据ID查询客户
	 * @param id
	 * @return
	 */
	public CustomerBean getCustomerBean(Long id);
	/**
	 * 根据ID查询客户
	 * @param id
	 * @return
	 */
	public CustomerBean loadCustomerBean(Long id);
	/**
	 * 根据客户名和电话号码，完成对客户进行查询
	 * @param customerName
	 * @param customerTelphone
	 * @return
	 */
	public List<?> findCustomersByCustomerNameAndCustomerTelphone(String customerName,String customerTelphone);
	/**
	 * 根据多参数查询客户
	 * @param customers
	 * @return
	 */
	public List<?> findCustomersByParams(String customerName,String telphone); 
	
	/**
	 * 根据多参数，分页查询客户
	 * @param params
	 * @param pager
	 * @return
	 */
	public Page<CustomerBean> findCustomersByParamsToPager(String customerName,String telphone,Pageable page)throws Exception;
	
	
}
