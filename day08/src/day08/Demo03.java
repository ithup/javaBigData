package day08;

//��̬����飺
public class Demo03 {
	public static int add(int  ...x){
		//x�൱��һ�����ϻ�������
		int length = x.length;
		int s=0;
		for(int i=0;i<x.length;i++){
			s=s+x[i];
		}
		return length;
	}
	//����������Ͳ�һ��
	public static Object add1(Object ...obj){
		String res="";
		for(Object o:obj){
			res=res+o;
		}
		return res;
	}
	public static void main(String[] args) {
		int i[] ={1,2,3,4};
//		System.out.println(i);
		int a[]={1,3,4};
	    System.out.println(a);
	    Object obj=a;
	    int v[]=(int[]) obj;
		
	}
}
