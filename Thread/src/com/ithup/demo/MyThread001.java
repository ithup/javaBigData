package com.ithup.demo;
/**
 * 通过Runnable继承实现多线程
 * @author acer
 *
 */
public class MyThread001 implements Runnable{
	private String name;		//线程的名称
	public MyThread001(String name){
		this.name = name;
	}
	public void run(){		//覆写run方法
		for(int i=0;i<100;i++){
			System.out.println(name+"运行，i="+i);
		}
	}
}
