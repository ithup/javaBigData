package day08;
//�ӿ�
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
		System.out.println("����������");
	}

	@Override
	public void work() {
		System.out.println("����"+TYPE+"����");
	}

	@Override
	public void stop() {
		System.out.println("���Թر���");
	}

	@Override
	public void open() {
		
	}
	
}
abstract class Printer implements Usb,Sub{
	//��ʵ�ֽӿڵ������ǳ����࣬�����п��Բ�ʵ�ֽӿ���
}
public class InterfaceDemo01 {
	public static void main(String[] args) {
	//1.��̬�ԣ�ָ����ͬһ�����ö��󣬽��ղ�ͬ
		Usb u=new Computer();//����ת��
		u.start();
		u.work();
		u.stop();
	}
}
