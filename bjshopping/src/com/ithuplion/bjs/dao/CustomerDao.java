package com.ithuplion.bjs.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.ithuplion.bjs.domain.Customer;
import com.ithuplion.bjs.tools.JDBCUtils;

public class CustomerDao {
	private QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
	public List<Customer> showAllCustomers() throws Exception {
		String sql="select * from customer";
		return qr.query(sql, new BeanListHandler<>(Customer.class));
	}
	public int insertCustomer(Customer customer) throws Exception {
		String sql="insert into customer values(?,?,?)";
		Object[] params={customer.getCustNo(),customer.getCustBirth(),customer.getCustScore()};
		return qr.update(sql, params);
	}
	public Customer selectCustomerByCustNO(int custNo) throws Exception {
		String sql="select * from customer where custNo=?";
		return qr.query(sql, new BeanHandler<>(Customer.class),custNo);
	}
	/**
	 * ���ݲ㣺
	 * 		�޸Ŀͻ�������Ϣ����ҵ������
	 * @param custNo
	 * @param custBirth
	 * @throws Exception 
	 */
	public void updateCustomerBirth(int custNo, String custBirth) throws Exception {
		String sql="update customer set custBirth=? where custNo=?";
		Object[] params={custBirth,custNo};
		qr.update(sql, params);
	}
	/**
	 * ���ݲ㣺
	 * 		���ݻ�Ա���޸Ŀͻ�������Ϣ����ҵ������
	 * @param custNo
	 * @param custScore
	 * @throws Exception 
	 */
	public void updateCustomerScore(int custNo, int custScore) throws Exception {
		String sql="update customer set custScore=? where custNo=?";
		Object[] params={custScore,custNo};
		qr.update(sql, params);
	}
	/**
	 *���ݲ㣺
	 *		��ѯ�ͻ�����߻���
	 * @return
	 * @throws Exception 
	 */
	public Customer selectMaxCustomerScore() throws Exception {
		String sql="SELECT custNo,custBirth,MAX(custScore) AS custScore FROM customer";
		return qr.query(sql, new BeanHandler<>(Customer.class));
	}
	/**
	 * ���ݲ㣺
	 * 		����ҵ���߼��㴫�ݵĻ�Ա���ڲ�ѯ��Ա��Ϣ
	 * 		��ҵ���߼�����ã��������ݿ�
	 * @param custBirth
	 * @return
	 * @throws SQLException 
	 */
	public List<Customer> selectCustomerByCustbirth(String custBirth) throws Exception {
		String sql="SELECT * FROM customer WHERE custBirth=?";
		return qr.query(sql, new BeanListHandler<Customer>(Customer.class),custBirth);
	}

}
