package homework02;
/**
 * 园丁工厂类: 得到不同的水果类对应的实例
 * @author acer
 *
 */
public class Gardener {
	public static Fruit getFruit(String  f){
		Fruit fruit=null;
		if("苹果".equals(f)){
			fruit=new Apple();
		}
		if("香蕉".equals(f)){
			fruit=new Banana();
		}
		if("葡萄".equals(f)){
			fruit=new Grape();
		}
		return fruit;
	}
}
