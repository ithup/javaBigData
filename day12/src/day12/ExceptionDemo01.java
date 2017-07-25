package day12;
/**
 * “Ï≥£¥¶¿Ì
 * @author acer
 *
 */
public class ExceptionDemo01 {
	public static void fun() throws MyException{
		int a=10;
		int b=a/0;
		System.out.println(b);
	}
	public static void main(String args[]){
		try {
			fun();
		} catch (MyException e) {
			System.out.println(e);
		}
	}
}
