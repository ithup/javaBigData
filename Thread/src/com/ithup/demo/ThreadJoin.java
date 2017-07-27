package com.ithup.demo;
/**
 * 线程强制执行，只有等这个线程执行完毕，其他的才能执行
 * @author acer
 *
 */
class MyThreadJoin implements Runnable{
	@Override
	public void run() {
		//覆写run方法
		for(int i =0;i<20;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
public class ThreadJoin {
	public static void main(String[] args) {
		//实例化子类对象
		MyThreadJoin mt=new MyThreadJoin();
		Thread t=new Thread(mt,"线程");
		t.start();		//启动线程
		for(int j=0;j<20;j++){
			if(j>5){
				try {
					t.join();		//强制执行
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Main运行，j="+j);
		}
	}
}
