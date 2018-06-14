package com.framestudy.springjpa.custommag.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.framestudy.springjpa.beans.CustomerBean;
import com.framestudy.springjpa.custommag.dao.CustomerRepository;
import com.framestudy.springjpa.custommag.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Resource
	private CustomerRepository customerRepository;
	
	@Override
	public CustomerBean saveCustomerBean(CustomerBean customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
		return customer;
	}
	
	@Override
	public CustomerBean updateCustomerBean(CustomerBean customer) {
		// TODO Auto-generated method stub
		customerRepository.saveAndFlush(customer);
		return customer;
	}

	@Override
	public void deleteCustomerBean(CustomerBean customer) {
		// TODO Auto-generated method stub
		customerRepository.delete(customer);
	}

	@Override
	public CustomerBean getCustomerBean(Long id) {
		// TODO Auto-generated method stub
		return customerRepository.findOne(id);//相当于hibernate get()
	}

	@Override
	public CustomerBean loadCustomerBean(Long id) {
		// TODO Auto-generated method stub
		return customerRepository.getOne(id);//相当于hibernate load()
	}

	@Override
	public List<?> findCustomersByCustomerNameAndCustomerTelphone(String customerName, String customerTelphone) {
		// TODO Auto-generated method stub
		return customerRepository.findByCustomerNameStartingWithAndTelphoneContainingOrderByBirthdayDesc(customerName, customerTelphone);
	}
	
	@Override
	public List<?> findCustomersByParams(String customerName,String telphone){
		// TODO Auto-generated method stub
		return customerRepository.findCustomersByParams(customerName, telphone);
	}

	@Override
	public Page<CustomerBean> findCustomersByParamsToPager(String customerName, String telphone, Pageable page)
			throws Exception {
		// TODO Auto-generated method stub
//		return customerRepository.findCustomersByParamsToPager(customerName, telphone, page);
		return customerRepository.findByCustomerNameStartingWithAndTelphoneContainingOrderByBirthdayDesc(customerName, telphone, page);
	}

	@Override
	public List<CustomerBean> saveCustomerBeans(List<CustomerBean> customers) {
		// TODO Auto-generated method stub
		return customerRepository.save(customers);
	}

	@Override
	public void deleteCustomerBeans(List<CustomerBean> customers) {
		// TODO Auto-generated method stub
		customerRepository.deleteInBatch(customers);
	}

	@Override
	public Page<CustomerBean> findCustomersByParamsToPager(CustomerBean customer, Pageable page) throws Exception {
		// TODO Auto-generated method stub
		return customerRepository.findAll(new Specification<CustomerBean>() {
			/**
			 * 下面的方法，主要用于拼接 JPQL语句中，where 条件部分的内容
			 */
			@Override
			public Predicate toPredicate(Root<CustomerBean> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				// TODO Auto-generated method stub
				List<Predicate> predicates = new ArrayList<Predicate>();// 添加查询条件
				
				if(StringUtils.hasLength(customer.getCustomerName())) {
					predicates.add(cb.like(root.get("customerName"), customer.getCustomerName() + "%"));
				}
				if(StringUtils.hasLength(customer.getTelphone())) {
					predicates.add(cb.like(root.get("telphone"), customer.getTelphone() + "%"));
				}
				
				if(customer.getGender() != null) {
					predicates.add(cb.equal(root.get("gender"), customer.getGender()));
				}
				
				predicates.add(cb.between(root.get("birthday"), customer.getStartTime(), customer.getEndTime()));
				
				Predicate[] arrayPredicates = new Predicate[predicates.size()];
				return cb.and(predicates.toArray(arrayPredicates));
			}
		}, page);
	}
	

//	@Override
//	public Pager findCustomersByMapToPager(Map params, Pager pager) throws Exception {
//		// TODO Auto-generated method stub
////		return customerRepository.findCustomersByMapToPager(params, pager);
//		return null;
//	}

}
