package day10;

import java.util.Scanner;

/**
 * String类
 * @author acer
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int p=0,q=0,d=0,o=0;//其中：p,q,d,o分别表示大写字母，小写字母，数字及其他字符个数
		System.out.print("请输入一行字符：");
		String str=input.next();
		for(int i=0;i<str.length();i++){
			System.out.print("字符串："+str.charAt(i)+" ");
			char charAt = str.charAt(i);
			if(Character.isUpperCase(charAt)){
				//确定指定字符（Unicode 代码点）是否为大写字母。
				p++;
			}
			else if(Character.isLowerCase(charAt)){
				//确定指定字符是否为小写字母。
				q++;
			}else if('0' <= charAt && charAt<='9'){
				d++;
			}else{
				o++;
			}
		}
		System.out.println(p);
		System.out.println(q);
		System.out.println(d);
		System.out.println(o);
	}
}
