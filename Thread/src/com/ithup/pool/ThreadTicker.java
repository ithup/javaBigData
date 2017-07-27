package com.ithup.pool;
/**
 * 模拟多线程实现购买火车票：
 * 	
 * @author acer
 *
 */
public class ThreadTicker {
	public static void main(String[] args) {
		Ticker t=new Ticker();
		Thread t1=new Thread(t,"张三");
		Thread t2=new Thread(t,"李四");
		Thread t3=new Thread(t,"王伟");
		Thread t4=new Thread(t,"马总");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
