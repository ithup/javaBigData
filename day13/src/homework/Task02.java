package homework;

import java.util.HashMap;
import java.util.Set;

/**
 * ����HashMap���󣬲�����������һЩѧԱ�������ͷ���
 * @author acer
 *
 */
public class Task02 {
	public static void main(String[] args) {
		//����hashmap���϶���
		HashMap<String,Integer> student=new HashMap<>();
		//��������
		student.put("����", 100);
		student.put("����", 90);
		student.put("���", 80);
		student.put("С��Ů", 95);
		//ʹ����ǿforѭ��������������
		System.out.println("�޸�ѧԱ֮ǰ��ѧԱ��Ϣ��");
		Set<String> studentKey = student.keySet();
		for (String stu : studentKey) {
			System.out.println("ѧԱ������"+stu+"\tѧԱ������"+student.get(stu));
		}
		//�޸�����һ��ѧԱ�ɼ���Ϣ
		Set<String> studentKeys = student.keySet();
		for (String stu : studentKeys) {
			if(student.containsKey("����")){
				student.put("����", 98);
			}
		}
		System.out.println("�޸�֮��ѧԱ��Ϣ");
		Set<String> studentKeyss = student.keySet();
		for (String stu : studentKeyss) {
			System.out.println("ѧԱ������"+stu+"\tѧԱ������"+student.get(stu));
		}
	}
}