package com.ithup.pool;
/**
 * ģ����߳�ʵ�ֹ����Ʊ��
 * 	
 * @author acer
 *
 */
public class ThreadTicker {
	public static void main(String[] args) {
		Ticker t=new Ticker();
		Thread t1=new Thread(t,"����");
		Thread t2=new Thread(t,"����");
		Thread t3=new Thread(t,"��ΰ");
		Thread t4=new Thread(t,"����");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
