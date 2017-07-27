package com.ithup.demo;
/**
 * interrupte中断线程
 * @author acer
 *
 *进入main线程
 *	main线程睡眠5秒
 *	1.进入run线程
 *	休眠1秒
 *	2.线程进入休眠状态
 *	4.线程正常结束
 *	线程中断
 *
 *进入main线程
 *		main线程睡眠5秒
 *		1.进入run线程
 *		休眠10秒
 *		2.线程进入休眠状态
 *		线程中断
 *		3.线程休眠终止
 */
class MyThreadInterrupt extends Thread{
	@Override
	public void run() {		//覆写run方法
		System.out.println("1.进入run线程");
		try {
			System.out.println("休眠10秒");
			System.out.println("2.线程进入休眠状态");
			sleep(10000);			//休眠10秒
		} catch (Exception e) {
			System.out.println("3.线程休眠终止");
			return;
		}
		System.out.println("4.线程正常结束");
	}
}
public class ThreadInterrupt {
	public static void main(String[] args) {
		//实例化子类对象
		MyThreadInterrupt mti=new MyThreadInterrupt();
		//实例化线程对象
		Thread th = new Thread(mti);
		th.start();
		try {
			System.out.println("进入main线程");
			System.out.println("main线程睡眠5秒");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		th.interrupt(); 		//中断线程执行
		System.out.println("线程中断");
	}
}
