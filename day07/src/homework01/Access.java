package homework01;
/**
 * ������
 * @author acer
 *
 */
public class Access {
	public static void main(String[] args) {
		Weapon weaponArray[]=new Weapon[9];
		//��������
		weaponArray[0]=new Axe("��ɽ��ͷ","��ɫ");
		weaponArray[1]=new Axe("����ͷ","��ɫ");
		weaponArray[2]=new Axe("������ͷ","��ɫ");
		weaponArray[3]=new Pistol("������ǹ","��ɫ");
		weaponArray[4]=new Pistol("�¹���ǹ","��ɫ");
		weaponArray[5]=new Pistol("�й�ʽ��ǹ","��ɫ");
		weaponArray[6]=new Sword("�ձ�����","��ɫ");
		weaponArray[7]=new Sword("�й�����","��ɫ");
		weaponArray[8]=new Sword("��������","��ɫ");
		//����ѭ��
		for (Weapon weapon : weaponArray) {
			weapon.showMe();
		}
	}
}
