package homework01;
/*
 * ����������
 */
public abstract class Weapon {
	public String name;//����������
	public String color;//��������ɫ
	public Weapon(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	public Weapon() {
		super();
	}
	/**
	 * ������󷽷�
	 */
	public abstract void showMe();
}
