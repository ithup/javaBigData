package com.ithup.demo;

public class ThreadStard4 {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				System.out.println("--------------------------oneThreadStart");
				int flag= 0;
				while(true){
					if(flag == 20){
						System.out.println("-------------------ontThreadend");
						break;
					}
					for(int i=0;i<=flag;i++){
						System.out.print("*");
					}
					System.out.println();
					flag++;
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
}
