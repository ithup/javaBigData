package com.ithup.demo;
/**
 * �߳�ģ�⹺Ʊ��Ʊ
 * 	ʵ��Runnable�ӿڵķ�ʽʵ�ֹ���
 * @author acer
 *
 */
class Ticker implements Runnable{
	int ticker=5;		//Ʊ��
	@Override
	public void run() {
		if(ticker>0){
			System.out.println("��Ʊ��"+ticker+(ticker--));
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
