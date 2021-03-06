package com.ithup.demo;
/**
 *线程的优先级由CPU调度决定
 *并不是优先级越高就先执行
 * @author acer
 *
 */
class ThreadSetPrs implements Runnable{
	@Override
	public void run() {		//方法的覆写
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(3000);		//休眠2秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//线程的名称
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
}
public class ThreadSetPr {
	public static void main(String[] args) {
		ThreadSetPrs tsp = new ThreadSetPrs();		//定义线程对象
		//实例化对象
		Thread t1 = new Thread(tsp,"线程A");
		Thread t2 = new Thread(tsp,"线程B");
		Thread t3 = new Thread(tsp,"线程C");
		t1.setPriority(Thread.MIN_PRIORITY);	//最小
		t1.setPriority(Thread.MAX_PRIORITY);	//最大
		t1.setPriority(Thread.NORM_PRIORITY);	//默认
		t1.start();
		t2.start();
		t3.start();
	}
}
