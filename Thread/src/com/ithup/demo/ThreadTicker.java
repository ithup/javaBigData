package com.ithup.demo;
/**
 * 线程模拟购票火车票
 * 	实现Runnable接口的方式实现共享
 * @author acer
 *
 */
class Ticker implements Runnable{
	int ticker=5;		//票数
	@Override
	public void run() {
		if(ticker>0){
			System.out.println("购票："+ticker+(ticker--));
		}
	}
}
public class ThreadTicker {
	public static void main(String[] args) {
		Ticker t1 = new Ticker();
		Thread t2 = new Thread(t1);
		t2.start();
		t2.start();
	}
}
