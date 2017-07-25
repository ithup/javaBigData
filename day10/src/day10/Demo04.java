package day10;
//拆分字符串：zhangsan:张三|lisi:李四|wangwu:王五
public class Demo04 {
	public static void main(String[] args) {
		String str="zhangsan:张三|lisi:李四|wangwu:王五";
		String s1[]=str.split("\\|");
		System.out.println("第一次拆分：");
		for (String string : s1) {
//			System.out.println(string);
			String[] strings = string.split(":");
			System.out.println(strings[0]+"\t"+strings[1]);
		}
		System.out.println("-----------------------------------");
		String res=str.replaceAll("\\|", "\n");
		String res1=res.replaceAll(":", " ");
		System.out.println("此时结果：\n"+res1);
	}
}
