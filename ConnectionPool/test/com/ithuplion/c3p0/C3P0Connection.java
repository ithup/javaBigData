package com.ithuplion.c3p0;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Connection {
	//ʹ��Ĭ������
	//private static ComboPooledDataSource dataSource=new ComboPooledDataSource();
	//ʹ����������
	private static ComboPooledDataSource dataSource=new ComboPooledDataSource("mysql_c3p0");
	/**
	 * �������Դ(���ӳ�)
	 * @return
	 */
	public static DataSource getDataSource(){
		return dataSource;
	}
	/**
	 * �������
	 * @return
	 */
	public static Connection getConnection(){
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
