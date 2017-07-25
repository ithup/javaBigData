package homework01;
/*
 * 手枪类
 */
public class Pistol extends Weapon{

	@Override
	public void showMe() {
		System.out.println("手枪的名称："+name+"手枪的颜色："+color);
	}

	public Pistol() {
		super();
	}

	public Pistol(String name, String color) {
		super(name, color);
	}
	
}
