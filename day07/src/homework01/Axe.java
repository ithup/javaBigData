package homework01;
/*
 * ��ͷ��
 */
public class Axe extends Weapon{

	@Override
	public void showMe() {
		System.out.println("��ͷ�����ƣ�"+name+"��ͷ����ɫ��"+color);
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
