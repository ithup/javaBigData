package com.ithup.thread;
/**
 * ����������һ���߳�
 * @author acer
 *
 */
public class ThreadMain {
	public static void main(String[] args) {
		/*SubThread st=new SubThread();
		st.start();
		for(int i=0;i<100;i++){
			System.out.println("main.."+i);
		}
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName());*/
		//SubRunnable subRunnable = new SubRunnable();
		/*Thread thread = new Thread(new SubRunnable());
		thread.start();
		for(int i=0;i<100;i++){
			System.out.println("main..."+i);
		}*/
		//�̳еķ�ʽ����
		/*new Thread(){
			@Override
			public void run() {
				for(int i=0;i<100;i++){
					System.out.println("run.."+i);
				}
			}
		}.start();
		for(int i=0;i<100;i++){
			System.out.println("main.."+i);
		}*/
		//ʵ�ֽӿڵķ�ʽ
		/*Runnable runnable = new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<100;i++){
					System.out.println("run.."+i);
				}
			}
			
		};
		new Thread(runnable).start();
		for(int i=0;i<100;i++){
			System.out.println("main.."+i);
		}*/
		new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<100;i++){
					System.out.println("run.."+i);
				}
			}
			
		}).start();
		for(int i=0;i<100;i++){
			System.out.println("main.."+i);
		}
	}
}