package homework01;
/*
 * 军刀类
 */
public class Sword extends Weapon{

	@Override
	public void showMe() {
		System.out.println("军刀的名称："+name+"军刀的颜色："+color);
	}

	public Sword() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sword(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}

}
