package day12;
/**
 * ¾²Ì¬ÄÚ²¿Àà
 * @author acer
 *
 */
class Outer3{
	static String name1="tom";
	static class Inner3{
		static String name2="rose";
		public static void print(){
			System.out.println("name1="+name1);
			System.out.println("name2="+name2);
		}
	}
}
public class Demo03 {
	public static void main(String[] args) {
		Outer3.Inner3.print();
	}
}
