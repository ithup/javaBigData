package homework02;
/**
 * �����ࣺ����Ϊ������
 * @author acer
 *
 */
public abstract class Pet {
	 String name;//����
	 double healthValue;//����ֵ
	 double love;//���ܶ�
	//������󷽷�
	public abstract void print();
	public Pet() {
		super();
	}
	public Pet(String name, double healthValue, double love) {
		super();
		this.name = name;
		this.healthValue = healthValue;
		this.love = love;
	}
	
}
