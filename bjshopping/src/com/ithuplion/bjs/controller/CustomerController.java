package com.ithuplion.bjs.controller;

import java.util.List;

import com.ithuplion.bjs.domain.Customer;
import com.ithuplion.bjs.service.CustomerService;

public class CustomerController {
	private CustomerService customerService=new CustomerService();
	/*
	 * ��ʾ�ͻ���Ϣ��
	 *  	��������ͼ���ã�����ҵ��㷽��
	 */
	public List<Customer> showAllCustomers() throws Exception {
			return customerService.showAllCustomers();
	}
	/*
	 * ��ӿͻ���Ϣ��
	 * 		��ӿͻ�����Ϣ����ͼ��װ��Customer�����ٵ���ҵ��㷽������ҵ��㴫��Customer����
	 */
	public int addCustomer(Customer customer) throws Exception {
		return customerService.addCustomer(customer);
	}
	/*
	 * �޸Ŀͻ���Ϣ��
	 * 		����ͼ����ã�
	 */
	public Customer findCustomerByCustNo(int custNo) throws Exception {
		return customerService.findCustomerByCustNo(custNo);
	}
	/*
	 * �޸Ŀͻ���������Ϣ��
	 * 		����ͼ�����,������ͼ�㴫�ݵĻ�Ա�źͻ�Ա�����޸Ŀͻ���Ϣ������ҵ���
	 */
	public void editCustomerBirth(int custNo, String custBirth) throws Exception {
		customerService.editCustomerBirth(custNo,custBirth);
	}
	/**
	 * �޸Ŀͻ��Ļ��֣�
	 * 			������ͼ�㴫�ݵĻ�Ա�źͻ�Ա���֣�����ͼ����ã�����ҵ��㣬
	 * @param custNo
	 * @param custSocre
	 * @throws Exception 
	 */
	public void editCustomerScore(int custNo, int custScore) throws Exception {
		customerService.editCustomerScore(custNo,custScore);
	}
	/**
	 * ��ѯ��߻�Ա���ֵ���Ϣ
	 * @return
	 * @throws Exception 
	 */
	public Customer selectMaxCustomerScore() throws Exception {
		return customerService.selectMaxCustomerScore();
	}
	/**
	 * ���Ʋ㣺
	 * 		������ͼ���û���������ڲ�ѯ��Ա��Ϣ
	 * 		����ͼ����ã�����ҵ���
	 * @param custBirth
	 * @return
	 * @throws Exception 
	 */
	public List<Customer> findCustomerByCustbirth(String custBirth) throws Exception {
		//����ҵ��ķ�����
		return customerService.findCustomerByCustbirth(custBirth);
	}
}
