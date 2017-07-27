package com.ithup.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 使用线程池中线程对象的步骤： 创建线程池对象 创建Runnable接口子类对象 提交Runnable接口子类对象 关闭线程池
 * 
 * @author acer
 *
 */
class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("我要一个教练");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("教练来了： " + Thread.currentThread().getName());
		System.out.println("教我游泳,交完后，教练回到了游泳池");
	}
	// Runnable接口实现类
}

public class ThreadPool {
	public static void main(String[] args) {
		// 创建线程池对象
		ExecutorService threadPool = Executors.newFixedThreadPool(2); // 包含2个线程对象
		//创建Runnable实例对象
		MyRunnable mr=new MyRunnable();
		//从线程池中获取线程对象,然后调用MyRunnable中的run()
		threadPool.submit(mr);
		//再获取个线程对象，调用MyRunnable中的run()
		threadPool.submit(mr);
		threadPool.submit(mr);
		//注意：submit方法调用结束后，程序并不终止，是因为线程池控制了线程的关闭。将使用完的线程又归还到了线程池中
		//关闭线程池
		//service.shutdown();
	}
}
