package com.ithup.thread;

public class SubThread extends Thread{
	@Override
	public void run() {
		/*for(int i=0;i<100;i++){
			System.out.println("run..."+i);
		}*/
		System.out.println(getName());
	}
}
