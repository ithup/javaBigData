package com.ithup.demo;
/**
 * 使用线程的内匿名内部类方式，可以方便的实现每个线程执行不同的线程任务操作
 * @author acer
 *
 */
public class ThreadStart3 {
	public static void main(String[] args) {
		//方式1：创建线程对象时，直接重写Thread类中的run方法
		new Thread(){
			@Override
			public void run() {
				for(int i = 0; i<50;i++){
					System.out.println("run....."+i);
				}
			}
		}.start();
		for(int i = 0; i<50;i++){
			System.out.println("main....."+i);
		}
	}
}
