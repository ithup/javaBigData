package com.ithup.demo;
/**
 * �̵߳�����������start����
 * @author acer
 *
 */
public class ThreadStart2 {
	public static void main(String[] args) {
		//ʵ��������
		MyThread001 m0 = new MyThread001("�߳�A");
		MyThread001 m1 = new MyThread001("�߳�B");
		new Thread(m0).start();
		new Thread(m1).start();
	}
}
