package day08;
/**
 * �ܽ᣺
 * 		������--����������--����ͨ�ࣨ�����ʵ���ࣩ
 * @author acer
 *
 */
abstract class Win {
	abstract void open();

	abstract void move();

	abstract void max();

	abstract void min();
}

// �������ࣺ������ʵҲ��һ��������
abstract class WinAdapter extends Win {
	
	void open() {

	}

	void move() {

	}

	void max() {

	}

	void min() {

	}

	void close() {

	}
}
//��ͨ�ࣺ�򿪡��رմ���
class WinOper extends WinAdapter {
	void open(){
		System.out.println("��һ���µĴ���");
	}
	void close(){
		System.out.println("�رմ���");
	}
}

public class Adapter {
	public static void main(String[] args) {
		Win openWin=new WinOper();
		openWin.open();
		
	}
}