package day12;
/**
 * �����ڲ���
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
		System.out.println("����ӡ��ʹ��"+TYPE+"�ӿڽ��д�ӡ");
	}
	
}*/
public class Demo04 {
	public static void main(String[] args) {
		new Usb(){
				@Override
				public void work() {
					System.out.println("����ӡ��ʹ��"+TYPE+"�ӿڽ��д�ӡ");
				}
			}.work();
	}
}