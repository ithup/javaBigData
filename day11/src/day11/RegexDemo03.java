package day11;

import java.util.Scanner;

public class RegexDemo03 {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("����һ���ַ�����");
		String s=input.next();
		String reg="\\w{2,4}$";
		if(s.matches(reg)){
			System.out.println("�ϸ�");
		}else{
			System.out.println("���ϸ�");
		}
	}
}
