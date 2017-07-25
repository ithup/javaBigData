package homework01;
/*
 * 斧头类
 */
public class Axe extends Weapon{

	@Override
	public void showMe() {
		System.out.println("斧头的名称："+name+"斧头的颜色："+color);
	}

	public Axe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Axe(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}
	
}
