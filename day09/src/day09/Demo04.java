package day09;

public class Demo04 {
	public static void main(String[] args) {
//		String s1 = "zbabyzcd";
//		String s2 = "abyz";
//		System.out.println(s1.compareTo(s2));
		long start = System.currentTimeMillis();
		int s=0;
		for(int i=0;i<100000000;i++){
			s=s+i;
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		System.out.println("--------------------");
		System.out.println("ϵͳĬ�ϵ��ַ����룺"+System.getProperty("file.encoding"));
	}
}
