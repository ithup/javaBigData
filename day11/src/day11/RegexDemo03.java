package day11;

import java.util.Scanner;

public class RegexDemo03 {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("输入一个字符串：");
		String s=input.next();
		String reg="\\w{2,4}$";
		if(s.matches(reg)){
			System.out.println("合格");
		}else{
			System.out.println("不合格！");
		}
	}
}
