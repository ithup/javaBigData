package day10;

public class Demo03 {
	public static void main(String[] args) {
		String str="zhangsan:����|lisi:����|wangwu:����";
//		String[] split = str.split("|");
//		for (String string : split) {
//			System.out.print(string);
//		}
		int i1 = str.indexOf("��");
		int i2 = str.indexOf("��");
		int i3 = str.indexOf("��");
		String s1 = str.substring(0, i1+1);
		for(int i=0;i<s1.length();i++){
			char c = s1.charAt(i);
			if(':'==c){
				
			}
			System.out.print(c);
		}
//		String s2 = str.substring(i1+2, i2+1);
//		String s3 = str.substring(i2+2, i3+1);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
	}
}
