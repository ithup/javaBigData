package day08;
//接口
interface Usb{
	int TYPE=3;
	void start();
	void work();
	void stop();
}
interface Sub extends Usb{
	void open();
}
interface Inter extends Sub,Usb{
	void close();
}
class Computer implements Usb,Sub{

	@Override
	public void start() {
		System.out.println("电脑启动了");
	}

	@Override
	public void work() {
		System.out.println("电脑"+TYPE+"工作");
	}

	@Override
	public void stop() {
		System.out.println("电脑关闭了");
	}

	@Override
	public void open() {
		
	}
	
}
abstract class Printer implements Usb,Sub{
	//若实现接口的子类是抽象类，该类中可以不实现接口中
}
public class InterfaceDemo01 {
	public static void main(String[] args) {
	//1.多态性：指的是同一个引用对象，接收不同
		Usb u=new Computer();//向上转型
		u.start();
		u.work();
		u.stop();
	}
}
