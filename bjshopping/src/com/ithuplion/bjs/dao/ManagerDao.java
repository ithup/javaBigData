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
	 * 数据层：
	 * 		根据业务逻辑层传递的数据信息修改管理员密码，由业务逻辑层调用
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
