package homework01;
/*
 * 武器抽象类
 */
public abstract class Weapon {
	public String name;//武器的名称
	public String color;//武器的颜色
	public Weapon(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	public Weapon() {
		super();
	}
	/**
	 * 定义抽象方法
	 */
	public abstract void showMe();
}
