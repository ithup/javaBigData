package day09;

import java.util.Arrays;

public class Demo03 {
	public static void main(String[] args) {
		int a[]={110,1,55,3,66,23,45,79};
		//���û�ж�����������������ǲ�ȷ����
		Arrays.sort(a);
		for(int b:a){
			System.out.println(b);
		}
		//������λ��
		System.out.println(Arrays.binarySearch(a, 79));
	}
}
