package com.ithup.tool;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * jedis���ӹ�����
 * 
 * @author acer
 *
 */
public class JedisPoolUtils {
	// ���ӳض���
	private static JedisPool pool = null;
	// ���౻����ʱ����̬�������ĳ���ִֻ��һ��
	static {
		InputStream inputStream = JedisPoolUtils.class.getClassLoader()
				.getResourceAsStream("redis.properties");
		Properties prop = new Properties();
		try {
			prop.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// �������ӳ��ӵ����ö���
		JedisPoolConfig poolConfig = new JedisPoolConfig();
		poolConfig.setMaxIdle(Integer.parseInt(prop.getProperty("redis.maxIdle").toString())); // ������ø���
		poolConfig.setMinIdle(Integer.parseInt(prop.getProperty("redis.minIdle").toString())); // ��С���ø���
		poolConfig.setMaxTotal(Integer.parseInt(prop.getProperty("redis.maxTotal").toString())); // ���������
		// ����һ��redis ���ӳ�
		pool = new JedisPool(poolConfig, prop.getProperty("redis.url").toString(), Integer.parseInt(prop.getProperty("redis.port").toString()));
	}

	/**
	 * ���jedis������Դ�ķ���
	 * 
	 * @return
	 */
	public static Jedis getJedis() {
		// ����������Դ����
		return pool.getResource();
	}
}
