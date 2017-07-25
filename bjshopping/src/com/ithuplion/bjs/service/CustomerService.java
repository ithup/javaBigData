package com.ithuplion.bjs.service;

import java.sql.SQLException;
import java.util.List;

import com.ithuplion.bjs.dao.CustomerDao;
import com.ithuplion.bjs.domain.Customer;

public class CustomerService {
	private CustomerDao customerDao=new CustomerDao();
	/*
	 * 显示客户信息：查询用户信息
	 * 由控制层调用，调用dao层
	 */
	public List<Customer> showAllCustomers() throws Exception {
			return customerDao.showAllCustomers();
	}
	/*
	 * 业务层：添加客户信息
	 * 		由控制层调用，调用dao层
	 */
	public int addCustomer(Customer customer) throws Exception {
		return customerDao.insertCustomer(customer);
	}
	/*
	 * 修改客户信息
	 */
	public Customer findCustomerByCustNo(int custNo) throws Exception {
		return customerDao.selectCustomerByCustNO(custNo);
	}
	/**
	 * 业务层：
	 * 		修改客户生日信息：由控制层调用，调用dao层
	 * @param custNo
	 * @param custBirth
	 * @throws Exception 
	 */
	public void editCustomerBirth(int custNo, String custBirth) throws Exception {
		customerDao.updateCustomerBirth(custNo,custBirth);
	}
	/**
	 * 业务层：
	 * 		修改客户积分信息，由控制层调用，调用数据层
	 * @param custNo
	 * @param custScore
	 * @throws Exception 
	 */
	public void editCustomerScore(int custNo, int custScore) throws Exception {
		customerDao.updateCustomerScore(custNo,custScore);
	}
	/**
	 * 业务层：
	 * 		查询客户的最高会员信息
	 * @return
	 * @throws Exception 
	 */
	public Customer selectMaxCustomerScore() throws Exception {
		return customerDao.selectMaxCustomerScore();
	}
	/**
	 * 业务层：
	 * 		根据控制层传递的日期查询会员信息
	 * 		由控制层调用，调用数据层
	 * @param custBirth
	 * @return
	 * @throws SQException 
	 */
	public List<Customer> findCustomerByCustbirth(String custBirth) throws Exception {
		return customerDao.selectCustomerByCustbirth(custBirth);
	}
	
}
