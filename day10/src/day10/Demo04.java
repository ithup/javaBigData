package day10;
//����ַ�����zhangsan:����|lisi:����|wangwu:����
public class Demo04 {
	public static void main(String[] args) {
		String str="zhangsan:����|lisi:����|wangwu:����";
		String s1[]=str.split("\\|");
		System.out.println("��һ�β�֣�");
		for (String string : s1) {
//			System.out.println(string);
			String[] strings = string.split(":");
			System.out.println(strings[0]+"\t"+strings[1]);
		}
		System.out.println("-----------------------------------");
		String res=str.replaceAll("\\|", "\n");
		String res1=res.replaceAll(":", " ");
		System.out.println("��ʱ�����\n"+res1);
	}
}
