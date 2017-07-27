package com.ithup.demo;
/**
 * 
 * @author ithup
 *
 */
public class ThreadStart5 {
	public static void main(String[] args) {
		new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("----------------------start-------------------");
				int flag=0;			//¼ÆÊýÆ÷
				while(true){
					if(flag == 10){
						System.out.println("---------end--------------");
						break;
					}
					for(int i=0;i<flag;i++){
						System.out.print("*");
					}
					System.out.println();
					flag++;
					try {
						Thread.sleep(1000); 		//µÈ´ý1Ãë
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();;
	}
}
