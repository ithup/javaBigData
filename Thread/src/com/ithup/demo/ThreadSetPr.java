package com.ithup.demo;
/**
 *�̵߳����ȼ���CPU���Ⱦ���
 *���������ȼ�Խ�߾���ִ��
 * @author acer
 *
 */
class ThreadSetPrs implements Runnable{
	@Override
	public void run() {		//�����ĸ�д
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(3000);		//����2��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//�̵߳�����
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
}
public class ThreadSetPr {
	public static void main(String[] args) {
		ThreadSetPrs tsp = new ThreadSetPrs();		//�����̶߳���
		//ʵ��������
		Thread t1 = new Thread(tsp,"�߳�A");
		Thread t2 = new Thread(tsp,"�߳�B");
		Thread t3 = new Thread(tsp,"�߳�C");
		t1.setPriority(Thread.MIN_PRIORITY);	//��С
		t1.setPriority(Thread.MAX_PRIORITY);	//���
		t1.setPriority(Thread.NORM_PRIORITY);	//Ĭ��
		t1.start();
		t2.start();
		t3.start();
	}
}