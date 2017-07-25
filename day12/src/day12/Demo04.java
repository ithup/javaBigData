package day12;
/**
 * 匿名内部类
 * @author acer
 *
 */
interface Usb{
	String TYPE="3.0";
	public void work();
	
}
/*class Printer implements Usb{

	@Override
	public void work() {
		System.out.println("本打印机使用"+TYPE+"接口进行打印");
	}
	
}*/
public class Demo04 {
	public static void main(String[] args) {
		new Usb(){
				@Override
				public void work() {
					System.out.println("本打印机使用"+TYPE+"接口进行打印");
				}
			}.work();
	}
}
