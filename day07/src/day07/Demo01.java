package day07;
/**
 * 冒泡排序
 * @author 顾怀要
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		int a[]={23,98,55,103,99,2,88,90};
		//遍历数据
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		//冒泡排序
		for(int i=0;i<a.length-1;i++){
			for(int k=0;k<a.length-i-1;k++){
				if(a[k]>a[k+1]){
					int temp=a[k];
					a[k]=a[k+1];
					a[k+1]=temp;
				}
			}
		}
		//遍历排序后的数据
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
