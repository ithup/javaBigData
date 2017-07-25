package com.ithuplion.bjs.service;

import java.sql.SQLException;
import java.util.List;

import com.ithuplion.bjs.dao.CustomerDao;
import com.ithuplion.bjs.domain.Customer;

public class CustomerService {
	private CustomerDao customerDao=new CustomerDao();
	/*
	 * ��ʾ�ͻ���Ϣ����ѯ�û���Ϣ
	 * �ɿ��Ʋ���ã�����dao��
	 */
	public List<Customer> showAllCustomers() throws Exception {
			return customerDao.showAllCustomers();
	}
	/*
	 * ҵ��㣺��ӿͻ���Ϣ
	 * 		�ɿ��Ʋ���ã�����dao��
	 */
	public int addCustomer(Customer customer) throws Exception {
		return customerDao.insertCustomer(customer);
	}
	/*
	 * �޸Ŀͻ���Ϣ
	 */
	public Customer findCustomerByCustNo(int custNo) throws Exception {
		return customerDao.selectCustomerByCustNO(custNo);
	}
	/**
	 * ҵ��㣺
	 * 		�޸Ŀͻ�������Ϣ���ɿ��Ʋ���ã�����dao��
	 * @param custNo
	 * @param custBirth
	 * @throws Exception 
	 */
	public void editCustomerBirth(int custNo, String custBirth) throws Exception {
		customerDao.updateCustomerBirth(custNo,custBirth);
	}
	/**
	 * ҵ��㣺
	 * 		�޸Ŀͻ�������Ϣ���ɿ��Ʋ���ã��������ݲ�
	 * @param custNo
	 * @param custScore
	 * @throws Exception 
	 */
	public void editCustomerScore(int custNo, int custScore) throws Exception {
		customerDao.updateCustomerScore(custNo,custScore);
	}
	/**
	 * ҵ��㣺
	 * 		��ѯ�ͻ�����߻�Ա��Ϣ
	 * @return
	 * @throws Exception 
	 */
	public Customer selectMaxCustomerScore() throws Exception {
		return customerDao.selectMaxCustomerScore();
	}
	/**
	 * ҵ��㣺
	 * 		���ݿ��Ʋ㴫�ݵ����ڲ�ѯ��Ա��Ϣ
	 * 		�ɿ��Ʋ���ã��������ݲ�
	 * @param custBirth
	 * @return
	 * @throws SQException 
	 */
	public List<Customer> findCustomerByCustbirth(String custBirth) throws Exception {
		return customerDao.selectCustomerByCustbirth(custBirth);
	}
	
}
