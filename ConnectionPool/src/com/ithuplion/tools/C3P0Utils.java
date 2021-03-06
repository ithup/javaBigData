package com.ithuplion.tools;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * c3p0连接池
 * @author acer
 *
 */
public class C3P0Utils {
	//使用默认配置
		//private static ComboPooledDataSource dataSource=new ComboPooledDataSource();
		//使用命名配置
		private static ComboPooledDataSource dataSource=new ComboPooledDataSource("mysql_c3p0");
		/**
		 * 获得数据源(连接池)
		 * @return
		 */
		public static DataSource getDataSource(){
			return dataSource;
		}
		/**
		 * 获得连接
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