package homework02;
/**
 * ԰��������: �õ���ͬ��ˮ�����Ӧ��ʵ��
 * @author acer
 *
 */
public class Gardener {
	public static Fruit getFruit(String  f){
		Fruit fruit=null;
		if("ƻ��".equals(f)){
			fruit=new Apple();
		}
		if("�㽶".equals(f)){
			fruit=new Banana();
		}
		if("����".equals(f)){
			fruit=new Grape();
		}
		return fruit;
	}
}
