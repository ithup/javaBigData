package day10;

import java.util.Scanner;

/**
 * String��
 * @author acer
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int p=0,q=0,d=0,o=0;//���У�p,q,d,o�ֱ��ʾ��д��ĸ��Сд��ĸ�����ּ������ַ�����
		System.out.print("������һ���ַ���");
		String str=input.next();
		for(int i=0;i<str.length();i++){
			System.out.print("�ַ�����"+str.charAt(i)+" ");
			char charAt = str.charAt(i);
			if(Character.isUpperCase(charAt)){
				//ȷ��ָ���ַ���Unicode ����㣩�Ƿ�Ϊ��д��ĸ��
				p++;
			}
			else if(Character.isLowerCase(charAt)){
				//ȷ��ָ���ַ��Ƿ�ΪСд��ĸ��
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
