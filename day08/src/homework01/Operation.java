package homework01;
/**
 * ����һ���ӿڣ�ʵ�ּӼ��˳��ĸ�����
 * @author acer
 *
 */
public interface Operation {
	/**
	 * �ӷ�����
	 * @return
	 */
	public abstract double plus(double x,double y);
	/**
	 * ��������
	 * @return
	 */
	public abstract double subtract(double x,double y);
	/**
	 * �˷�����
	 * @return
	 */
	public abstract double mul(double x,double y);
	/**
	 * ��������
	 * @return
	 */
	public abstract double division(double x,double y);
}
