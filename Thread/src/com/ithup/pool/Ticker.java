package com.ithup.pool;
/**
 * �����Ʊ
 * @author acer
 *
 */
public class Ticker implements Runnable{
	private int ticker=5;
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			//��Ʊ���жϣ�����0���Գ���
			synchronized (this) {
				if(ticker>0){
					System.out.println(Thread.currentThread().getName()+"�򵽵�"+(ticker--)+"��");
				}
			}
		}
	}

}