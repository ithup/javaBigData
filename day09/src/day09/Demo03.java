package day09;

import java.util.Arrays;

public class Demo03 {
	public static void main(String[] args) {
		int a[]={110,1,55,3,66,23,45,79};
		//如果没有对数组进行排序，则结果是不确定的
		Arrays.sort(a);
		for(int b:a){
			System.out.println(b);
		}
		//排序后的位置
		System.out.println(Arrays.binarySearch(a, 79));
	}
}
