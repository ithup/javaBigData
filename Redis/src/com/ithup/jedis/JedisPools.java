package com.ithup.jedis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.junit.Test;

import com.ithup.tool.JedisPoolUtils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * 通过jedis的pool池获取连接对象
 * @author acer
 *
 */
public class JedisPools {
	@Test
	public void jedisPools(){
		//创建连接池子的配置对象
		JedisPoolConfig poolConfig = new JedisPoolConfig();
		poolConfig.setMaxIdle(30);		//最大闲置个数
		poolConfig.setMinIdle(10);		//最小闲置个数
		poolConfig.setMaxTotal(50);		//最大连接数
		//创建一个redis 连接池
		JedisPool jedisPool = new JedisPool(poolConfig, "127.0.0.1", 6379);
		//从连接池中获得连接资源
		Jedis jedis = jedisPool.getResource();
		//操作数据库
		//存数据
		jedis.set("sex", "男");
		//获取数据
		System.out.println(jedis.get("sex"));
		//释放资源
		jedis.close();
	}
	@Test
	public void jedisPool(){
		Jedis jedis = JedisPoolUtils.getJedis();
		jedis.set("age", "22");
		System.out.println(jedis.get("age"));
		jedis.close();
	}
}
