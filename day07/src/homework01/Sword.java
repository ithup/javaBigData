package homework01;
/*
 * ������
 */
public class Sword extends Weapon{

	@Override
	public void showMe() {
		System.out.println("���������ƣ�"+name+"��������ɫ��"+color);
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
