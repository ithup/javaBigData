package com.ithup.demo;
/**
 * 线程的启动，调用start方法
 * @author acer
 *
 */
class MyThreadDemo extends Thread{
	private String name;		//线程的名称
	public MyThreadDemo(String name){
		this.name = name;
	}
	public void run(){		//覆写run方法
		for(int i=0;i<10;i++){
			System.out.println(name+"运行，i="+i);
		}
	}
}
public class ThreadStart {
	public static void main(String[] args) {
		//实例化对象
		MyThreadDemo mtd0 = new MyThreadDemo("线程A");
		MyThreadDemo mtd1 = new MyThreadDemo("线程B");
//		mtd0.run();
//		mtd1.run();
		mtd0.start();
		mtd1.start();
	}
}
