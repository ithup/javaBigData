package com.ithup.jedis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.junit.Test;

import com.ithup.tool.JedisPoolUtils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * ͨ��jedis��pool�ػ�ȡ���Ӷ���
 * @author acer
 *
 */
public class JedisPools {
	@Test
	public void jedisPools(){
		//�������ӳ��ӵ����ö���
		JedisPoolConfig poolConfig = new JedisPoolConfig();
		poolConfig.setMaxIdle(30);		//������ø���
		poolConfig.setMinIdle(10);		//��С���ø���
		poolConfig.setMaxTotal(50);		//���������
		//����һ��redis ���ӳ�
		JedisPool jedisPool = new JedisPool(poolConfig, "127.0.0.1", 6379);
		//�����ӳ��л��������Դ
		Jedis jedis = jedisPool.getResource();
		//�������ݿ�
		//������
		jedis.set("sex", "��");
		//��ȡ����
		System.out.println(jedis.get("sex"));
		//�ͷ���Դ
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
