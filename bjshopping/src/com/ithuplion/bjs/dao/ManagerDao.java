package com.ithuplion.bjs.dao;


import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.ithuplion.bjs.domain.Manager;
import com.ithuplion.bjs.tools.JDBCUtils;

public class ManagerDao {
	private QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
	public Manager login(String username, String password) throws Exception {
		String sql="select * from manager where username=? and password=?";
		Object[] params={username,password};
		return qr.query(sql, new BeanHandler<>(Manager.class),params);
	}
	/**
	 * ���ݲ㣺
	 * 		����ҵ���߼��㴫�ݵ�������Ϣ�޸Ĺ���Ա���룬��ҵ���߼������
	 * @param username
	 * @param newUserName
	 * @param newPassword
	 * @return
	 * @throws Exception 
	 */
	public int editManagerPassword(String username, String newUserName, String newPassword) throws Exception {
		String sql="UPDATE manager SET username=?,PASSWORD=? WHERE username=?";
		Object[] params={newUserName,newPassword,username};
		return qr.update(sql, params);
	}
}
