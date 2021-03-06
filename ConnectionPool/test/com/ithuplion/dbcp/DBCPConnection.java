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
 * DBCP连接池的使用
 * @author acer
 *
 */
public class DBCPConnection {
	@Test
	public void test01(){
		/**
		 * 手动方式
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
			//从数据源里获得连接
			conn=dataSource.getConnection();
			//编写sql
			String sql="select * from user_info";
			//预编译sql
			ps=conn.prepareStatement(sql);
			//执行sql
			rs=ps.executeQuery();
			//遍历数据
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
		 * 配置文件方式
		 */
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Properties properties=new Properties();
		try {
			properties.load(new FileInputStream("src/dbcpconfig.properties"));
			DataSource dataSource = BasicDataSourceFactory.createDataSource(properties);
			//获得连接
			conn = dataSource.getConnection();
			//编写sql
			String sql="select * from user_info";
			//预编译sql
			ps = conn.prepareStatement(sql);
			//执行sql
			rs= ps.executeQuery();
			//遍历数据
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
