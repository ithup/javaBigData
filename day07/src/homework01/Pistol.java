package homework01;
/*
 * ��ǹ��
 */
public class Pistol extends Weapon{

	@Override
	public void showMe() {
		System.out.println("��ǹ�����ƣ�"+name+"��ǹ����ɫ��"+color);
	}

	public Pistol() {
		super();
	}

	public Pistol(String name, String color) {
		super(name, color);
	}
	
}
