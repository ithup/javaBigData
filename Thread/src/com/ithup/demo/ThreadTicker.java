package com.ithup.demo;
/**
 * 线程模拟购票火车票
 * 	实现Runnable接口的方式实现共享
 * 线程的同步：synchronized
 * @author acer
 *
 */
class Ticker implements Runnable{
	int ticker=5;		//票数
	@Override
	public void run() {
		for(int i=1;i<100;i++){
			/*if(ticker>0){//判断是否有票
				System.out.println("购票："+(ticker--));
			}*/
			synchronized (this) {
				if(ticker>0){//判断是否有票
					System.out.println("购票："+(ticker--));
				}
			}
		}
		
	}
}
public class ThreadTicker {
	public static void main(String[] args) {
		Ticker t1 = new Ticker();
		new Thread(t1).start();
		new Thread(t1).start();
		new Thread(t1).start();
		new Thread(t1).start();
	}
}
