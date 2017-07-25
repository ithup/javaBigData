package com.ithuplion.bjs.controller;

import java.util.List;

import com.ithuplion.bjs.domain.Customer;
import com.ithuplion.bjs.service.CustomerService;

public class CustomerController {
	private CustomerService customerService=new CustomerService();
	/*
	 * 显示客户信息：
	 *  	方法由视图调用，调用业务层方法
	 */
	public List<Customer> showAllCustomers() throws Exception {
			return customerService.showAllCustomers();
	}
	/*
	 * 添加客户信息：
	 * 		添加客户的信息由视图封装成Customer对象，再调用业务层方法再向业务层传递Customer对象
	 */
	public int addCustomer(Customer customer) throws Exception {
		return customerService.addCustomer(customer);
	}
	/*
	 * 修改客户信息：
	 * 		由视图层调用，
	 */
	public Customer findCustomerByCustNo(int custNo) throws Exception {
		return customerService.findCustomerByCustNo(custNo);
	}
	/*
	 * 修改客户的生日信息：
	 * 		由视图层调用,根据视图层传递的会员号和会员生日修改客户信息，调用业务层
	 */
	public void editCustomerBirth(int custNo, String custBirth) throws Exception {
		customerService.editCustomerBirth(custNo,custBirth);
	}
	/**
	 * 修改客户的积分：
	 * 			根据视图层传递的会员号和会员积分，由视图层调用，调用业务层，
	 * @param custNo
	 * @param custSocre
	 * @throws Exception 
	 */
	public void editCustomerScore(int custNo, int custScore) throws Exception {
		customerService.editCustomerScore(custNo,custScore);
	}
	/**
	 * 查询最高会员积分的信息
	 * @return
	 * @throws Exception 
	 */
	public Customer selectMaxCustomerScore() throws Exception {
		return customerService.selectMaxCustomerScore();
	}
	/**
	 * 控制层：
	 * 		根据视图层用户输入的日期查询会员信息
	 * 		由视图层调用，调用业务层
	 * @param custBirth
	 * @return
	 * @throws Exception 
	 */
	public List<Customer> findCustomerByCustbirth(String custBirth) throws Exception {
		//调用业务的方法：
		return customerService.findCustomerByCustbirth(custBirth);
	}
}
