package com.ithuplion.jedis;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class JedisTest {
	@Test
	public void testJedisSingle(){
		//1.设置ip地址和端口
		Jedis jedis=new Jedis("39.108.155.66",6379);
		//设置数据
		jedis.set("name", "ithuplion");
		//获得数据
		String name = jedis.get("name");
		System.out.println(name);
		//释放资源
		jedis.close();
	}
}
