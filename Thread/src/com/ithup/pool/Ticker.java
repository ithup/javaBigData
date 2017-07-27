package com.ithup.pool;
/**
 * 购买火车票
 * @author acer
 *
 */
public class Ticker implements Runnable{
	private int ticker=5;
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			//对票数判断，大于0可以出售
			synchronized (this) {
				if(ticker>0){
					System.out.println(Thread.currentThread().getName()+"买到第"+(ticker--)+"张");
				}
			}
		}
	}

}
