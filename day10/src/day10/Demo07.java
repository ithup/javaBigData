package day10;

import java.util.StringTokenizer;

public class Demo07 {
	public static void main(String[] args) {
		/*StringTokenizer st=new StringTokenizer("�й� �ϲ� ������");
		System.out.println("��ֺ�Ĵ��������"+st.countTokens());
		while(st.hasMoreElements()){
			System.out.println(st.nextElement());
		}
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}*/
		String str="����(�ϲ�,������}��ҵ���),234��";
		StringTokenizer st=new StringTokenizer(str, "(),}");
		System.out.println("��ֺ�Ĵ�����"+st.countTokens());
		while(st.hasMoreElements()){
			System.out.println(st.nextElement());
		}
	}
}
