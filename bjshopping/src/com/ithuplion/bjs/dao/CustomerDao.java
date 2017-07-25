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
	 * 数据层：
	 * 		修改客户生日信息，由业务层调用
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
	 * 数据层：
	 * 		根据会员号修改客户积分信息，由业务层调用
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
	 *数据层：
	 *		查询客户的最高积分
	 * @return
	 * @throws Exception 
	 */
	public Customer selectMaxCustomerScore() throws Exception {
		String sql="SELECT custNo,custBirth,MAX(custScore) AS custScore FROM customer";
		return qr.query(sql, new BeanHandler<>(Customer.class));
	}
	/**
	 * 数据层：
	 * 		根据业务逻辑层传递的会员日期查询会员信息
	 * 		由业务逻辑层调用，访问数据库
	 * @param custBirth
	 * @return
	 * @throws SQLException 
	 */
	public List<Customer> selectCustomerByCustbirth(String custBirth) throws Exception {
		String sql="SELECT * FROM customer WHERE custBirth=?";
		return qr.query(sql, new BeanListHandler<Customer>(Customer.class),custBirth);
	}

}
