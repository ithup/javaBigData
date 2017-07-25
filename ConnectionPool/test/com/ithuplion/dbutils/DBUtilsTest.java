package com.ithuplion.dbutils;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.ithuplion.pojo.User;
import com.ithuplion.tools.C3P0Utils;

public class DBUtilsTest {
	@Test
	public void test01() throws Exception{
		QueryRunner qr=new QueryRunner(C3P0Utils.getDataSource());
		String sql="select * from user_info";
		List<User> list = qr.query(sql, new BeanListHandler<>(User.class));
		for (User user : list) {
			System.out.println(user);
		}
	}
}
