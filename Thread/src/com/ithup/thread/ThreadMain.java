package com.ithup.thread;
/**
 * 创建和启动一个线程
 * @author acer
 *
 */
public class ThreadMain {
	public static void main(String[] args) {
		SubRunnable2 st=new SubRunnable2();
		Thread t = new Thread(st);
		t.start();
		for(int i=0;i<50;i++){
			System.out.println("main.."+i);
		}
		/*Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName());*/
		//SubRunnable subRunnable = new SubRunnable();
		/*Thread thread = new Thread(new SubRunnable());
		thread.start();
		for(int i=0;i<100;i++){
			System.out.println("main..."+i);
		}*/
		//继承的方式创建
		/*new Thread(){
			@Override
			public void run() {
				for(int i=0;i<100;i++){
					System.out.println("run.."+i);
				}
			}
		}.start();
		for(int i=0;i<100;i++){
			System.out.println("main.."+i);
		}*/
		//实现接口的方式
		/*Runnable runnable = new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<100;i++){
					System.out.println("run.."+i);
				}
			}
			
		};
		new Thread(runnable).start();
		for(int i=0;i<100;i++){
			System.out.println("main.."+i);
		}*/
		/*new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<10;i++){
					System.out.println("run.."+i);
				}
			}
			
		}).start();*/
		/*for(int i=0;i<10;i++){
			System.out.println("main.."+i);
		}*/
	}
}
