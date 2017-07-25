package day09;

import java.util.Random;

public class Demo02 {
	public static void main(String[] args) {
		Random r=new Random();
		double d = r.nextDouble();
		System.out.println((int)(d*10));
	}
}
