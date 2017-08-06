package com.ithup.tool;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * jedis连接工具类
 * 
 * @author acer
 *
 */
public class JedisPoolUtils {
	// 连接池对象
	private static JedisPool pool = null;
	// 当类被加载时，静态代码块里的程序只执行一次
	static {
		InputStream inputStream = JedisPoolUtils.class.getClassLoader()
				.getResourceAsStream("redis.properties");
		Properties prop = new Properties();
		try {
			prop.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 创建连接池子的配置对象
		JedisPoolConfig poolConfig = new JedisPoolConfig();
		poolConfig.setMaxIdle(Integer.parseInt(prop.getProperty("redis.maxIdle").toString())); // 最大闲置个数
		poolConfig.setMinIdle(Integer.parseInt(prop.getProperty("redis.minIdle").toString())); // 最小闲置个数
		poolConfig.setMaxTotal(Integer.parseInt(prop.getProperty("redis.maxTotal").toString())); // 最大连接数
		// 创建一个redis 连接池
		pool = new JedisPool(poolConfig, prop.getProperty("redis.url").toString(), Integer.parseInt(prop.getProperty("redis.port").toString()));
	}

	/**
	 * 获得jedis连接资源的方法
	 * 
	 * @return
	 */
	public static Jedis getJedis() {
		// 返回连接资源对象
		return pool.getResource();
	}
}
