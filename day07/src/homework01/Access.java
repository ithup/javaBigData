package homework01;
/**
 * 测试类
 * @author acer
 *
 */
public class Access {
	public static void main(String[] args) {
		Weapon weaponArray[]=new Weapon[9];
		//匿名对象
		weaponArray[0]=new Axe("开山斧头","黑色");
		weaponArray[1]=new Axe("开金斧头","金色");
		weaponArray[2]=new Axe("开银斧头","银色");
		weaponArray[3]=new Pistol("波克手枪","黑色");
		weaponArray[4]=new Pistol("德国手枪","金色");
		weaponArray[5]=new Pistol("中国式手枪","蓝色");
		weaponArray[6]=new Sword("日本军刀","黑色");
		weaponArray[7]=new Sword("中国军刀","金色");
		weaponArray[8]=new Sword("美国军刀","白色");
		//遍历循环
		for (Weapon weapon : weaponArray) {
			weapon.showMe();
		}
	}
}
