package com.framestudy.springjpa.custommag.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import com.framestudy.springjpa.beans.CustomerBean;

public interface CustomerRepository extends JpaRepository<CustomerBean, Long>,JpaSpecificationExecutor<CustomerBean>{
	
	
	/**
	 * 根据客户名和电话号码，完成对客户进行查询
	 * @param customerName
	 * @param customerTelphone
	 * @return
	 */
	public List<?> findByCustomerNameStartingWithAndTelphoneContainingOrderByBirthdayDesc(String customerName,String customerTelphone);
	
	/**
	 * 根据多参数查询客户
	 * @param customers
	 * @return
	 */
	@Query(value="from CustomerBean as c where c.customerName like CONCAT(?1,'%') and c.telphone like CONCAT(?2,'%') order by c.birthday desc")
	public List<?> findCustomersByParams(String customerName,String telphone); 
	
	@Query(value="from CustomerBean as c where c.customerName like CONCAT(?1,'%') and c.telphone like CONCAT(?2,'%') order by c.birthday desc")
	public Page<CustomerBean> findCustomersByParamsToPager(String customerName, String telphone, Pageable page);

	public Page<CustomerBean> findByCustomerNameStartingWithAndTelphoneContainingOrderByBirthdayDesc(String customerName, String telphone, Pageable page);
}
