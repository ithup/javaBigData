package com.ithuplion.dbcp;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.junit.Test;

/**
 * DBCP���ӳص�ʹ��
 * @author acer
 *
 */
public class DBCPConnection {
	@Test
	public void test01(){
		/**
		 * �ֶ���ʽ
		 */
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		BasicDataSource dataSource=new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/test");
		dataSource.setUsername("root");
		dataSource.setPassword("tiger");
		try {
			//������Դ��������
			conn=dataSource.getConnection();
			//��дsql
			String sql="select * from user_info";
			//Ԥ����sql
			ps=conn.prepareStatement(sql);
			//ִ��sql
			rs=ps.executeQuery();
			//��������
			while(rs.next()){
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String loginname = rs.getString("loginname");
				String password = rs.getString("password");
				System.out.println(id+username+loginname+password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test02(){
		/**
		 * �����ļ���ʽ
		 */
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Properties properties=new Properties();
		try {
			properties.load(new FileInputStream("src/dbcpconfig.properties"));
			DataSource dataSource = BasicDataSourceFactory.createDataSource(properties);
			//�������
			conn = dataSource.getConnection();
			//��дsql
			String sql="select * from user_info";
			//Ԥ����sql
			ps = conn.prepareStatement(sql);
			//ִ��sql
			rs= ps.executeQuery();
			//��������
			while(rs.next()){
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String loginname = rs.getString("loginname");
				String password = rs.getString("password");
				System.out.println(id+username+loginname+password);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}