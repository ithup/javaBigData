package day10;

import java.util.StringTokenizer;

public class Demo07 {
	public static void main(String[] args) {
		/*StringTokenizer st=new StringTokenizer("中国 南昌 高新区");
		System.out.println("拆分后的词组个数："+st.countTokens());
		while(st.hasMoreElements()){
			System.out.println(st.nextElement());
		}
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}*/
		String str="江西(南昌,高新区}创业大街),234号";
		StringTokenizer st=new StringTokenizer(str, "(),}");
		System.out.println("拆分后的词数："+st.countTokens());
		while(st.hasMoreElements()){
			System.out.println(st.nextElement());
		}
	}
}
