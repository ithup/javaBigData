package day08;
/**
 * 总结：
 * 		抽象类--》适配器类--》普通类（具体的实现类）
 * @author acer
 *
 */
abstract class Win {
	abstract void open();

	abstract void move();

	abstract void max();

	abstract void min();
}

// 适配器类：该类其实也是一个抽象类
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
//普通类：打开、关闭窗口
class WinOper extends WinAdapter {
	void open(){
		System.out.println("打开一个新的窗口");
	}
	void close(){
		System.out.println("关闭窗口");
	}
}

public class Adapter {
	public static void main(String[] args) {
		Win openWin=new WinOper();
		openWin.open();
		
	}
}