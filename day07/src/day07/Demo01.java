package day07;
/**
 * ð������
 * @author �˻�Ҫ
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		int a[]={23,98,55,103,99,2,88,90};
		//��������
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		//ð������
		for(int i=0;i<a.length-1;i++){
			for(int k=0;k<a.length-i-1;k++){
				if(a[k]>a[k+1]){
					int temp=a[k];
					a[k]=a[k+1];
					a[k+1]=temp;
				}
			}
		}
		//��������������
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
