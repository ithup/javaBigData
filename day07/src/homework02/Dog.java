package homework02;
/**
 * ���幷���̳�pet
 * @author acer
 *
 */
public class Dog extends Pet{
	String sex;
	@Override
	public void print() {
		System.out.println("�ҵ����ֽУ�"+name+",�ҵĽ���ֵ�ǣ�"+healthValue+",�Һ����˵����ܶ��ǣ�"+love+",�ҵ��Ա��ǣ�"+sex);
	}
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String name, double healthValue, double love,String sex) {
		super(name, healthValue, love);
	}
	
}
