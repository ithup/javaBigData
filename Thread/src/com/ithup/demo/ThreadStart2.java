package com.ithup.demo;
/**
 * 线程的启动，调用start方法
 * @author acer
 *
 */
public class ThreadStart2 {
	public static void main(String[] args) {
		//实例化对象
		MyThread001 m0 = new MyThread001("线程A");
		MyThread001 m1 = new MyThread001("线程B");
		new Thread(m0).start();
		new Thread(m1).start();
	}
}
