package day06;

import java.util.Scanner;

/**
 * �򵥵�ѧ����Ϣ������Ϣv1.0
 * 
 * @author �˻�Ҫ
 * 
 */
class Student {
	String sno; // ѧ��
	String sname;// ����
	String ssex;// �Ա�
	int sage;// ����
	String smajor;// רҵ
	String stel;// �绰

	public Student() {
	}

	public Student(String sno, String sname, String ssex, int sage,
			String smajor, String stel) {
		this.sno = sno;// this ��ʾ��ǰ��Ķ���
		this.sname = sname;
		this.ssex = ssex;
		this.sage = sage;
		this.smajor = smajor;
		this.stel = stel;
	}

	public String toString() {
		return "ѧ����Ϣ [ѧ��=" + sno + ", ����=" + sname + ", �Ա�=" + ssex + ", ����="
				+ sage + ", רҵ=" + smajor + ", ��ϵ��ʽ=" + stel + "]";
	}
}

public class StudentInfo {
	/*
	 * 1.��̬����ֻ�ܵ��þ�̬���������ʾ�̬��Ա�����ԣ� 2.�Ǿ�̬�����ȿ��Ե��þ�̬������Ҳ���Ե��÷Ǿ�̬����
	 */
	static Scanner input = new Scanner(System.in);
	// ѧ����������
	static Student stu[];

	// 1.ϵͳ�˵�
	public static void menu() {
		System.out.println("======ѧ����Ϣ����ϵͳv1.0==========");
		System.out.println("1.��ʼ��ϵͳ");
		System.out.println("2.��ʾϵͳ��Ϣ");
		System.out.println("3.���ѧ����Ϣ");
		System.out.println("4.��ѧ��ɾ��ѧ����Ϣ");
		System.out.println("5.����ѧ����Ϣ");
		System.out.println("6.��ѧ�Ų�ѯѧ����Ϣ");
		System.out.println("7.��ѧ����������");
		System.out.println("8.����ϵͳ��Ϣ");
		System.out.println("9.�޸�ѧ����Ϣ");
		System.out.println("10.�˳�ϵͳ");
		System.out.println("==================================");
	}

	// 2.ѡ��˵���
	public static void select() {
		System.out.print("������˵��");
		if (input.hasNextInt()) {
			int op = input.nextInt();// ����һ������
			switch (op) {
			case 1:
				init();
				break;
			case 2:
				display();
				break;
			case 3:
				addStudentInfo();
				break;
			case 4:
				deleteStudent();
				break;
			case 5:
				insertStudent();
				break;
			case 6:
				System.out.println("���������ѧ����ѧ�ţ�");
				String id = input.next();
				findBySno(id);
				break;
			case 7:
				sortStudentBySno();
				break;
			case 8:
				System.out.println("8.����ϵͳ��Ϣ");
				break;
			case 9:
				updataStudent();
				break;
			case 10:
				System.out.println("�ݰݣ���������������ӭ�´�������");
				System.exit(0);// ��ʾ�����˳������
				// System.exit(1);//��ʾ�������˳������
			}
		} else {
			System.out.println("����Ĳ˵������");
			System.exit(0);
		}
	}

	// 3.��ʼ��ϵͳ
	public static void init() {
		stu = new Student[10];
		stu[0] = new Student("A102", "����", "��", 32, "��Ϣ��������Ϣϵͳ", "9868972993");
		stu[1] = new Student("A103", "����", "Ů", 12, "�������ѧ����", "3249783");
		stu[2] = new Student("A101", "����", "��", 22, "������������", "13292993");
		System.out
				.println("===============��ӭ����ѧ����Ϣ����ϵͳ��==================\n\n\n");
	}

	// 4.��ʾϵͳ��Ϣ
	public static void display() {
		System.out.println("--------------ѧ����Ϣ------------------");
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null) {
				System.out.println(stu[i]);
			}
		}
	}

	// ͳ��ѧ������
	public static int countStudent() {
		int s = 0;// �ۼ�
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null) {
				s++;
			}
		}
		return s;
	}

	// ���ѧ����Ϣ
	public static void addStudentInfo() {
		int num = countStudent();
		System.out.println("������ӵ�ѧ��������");
		int n = input.nextInt();
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				System.out.println("������" + (i + 1) + "ѧ����Ϣ��");
				System.out.print("ѧ�ţ�");
				String sno = input.next();
				System.out.print("������");
				String sname = input.next();
				System.out.print("�Ա�");
				String sex = input.next();
				System.out.print("���䣺");
				int age = input.nextInt();
				System.out.print("רҵ��");
				String zy = input.next();
				System.out.print("��ϵ��ʽ��");
				String tel = input.next();
				stu[num + i] = new Student(sno, sname, sex, age, zy, tel);
				System.out.println("���ѧ����Ϣ�ɹ���");
			}
		} else {
			System.out.println("���ѧ����Ϣʧ��");
		}
	}

	// 5.��ѧ��������ѧ����Ϣ
	public static void findBySno(String no) {
		boolean flag = false;
		int k = 0;
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null) {
				if (stu[i].sno.equals(no)) {
					k = i;
					flag = true;
					break;// ǿ������ѭ��
				}
			}
		}
		if (flag) {
			System.out.println("ѧ��Ϊ��" + no + "��ѧ�����ڣ�");
			System.out.println(stu[k]);
		}
	}

	// 7.��ѧ����������
	public static void sortStudentBySno() {
		int num = countStudent();// ʵ��ѧ������
		for (int i = 0; i < num - 1; i++) {// i��ʾ�Ƚϵ�����
			for (int j = 0; j < num - 1 - i; j++) {
				if (stu[j].sno.compareTo(stu[j + i].sno) > 0) {
					Student temp = stu[j];
					stu[j] = stu[j + 1];
					stu[j + 1] = temp;
				}
			}
		}
		System.out.println("��ϲ����ѧ����������ɹ���");
	}

	// ��λ�ò���ѧ����Ϣ
	public static void insertStudent() {
		int num = countStudent();// ѧ��ʵ������
		System.out.println("���������ѧ����λ��");
		int n = input.nextInt();
		if (n > 0) {
			// ��ѭ����Ҫ����Ԫ������ƶ�
			for (int i = num - 1; i >= n - 1; i--) {
				stu[i + 1] = stu[i];
			}
			System.out.print("ѧ�ţ�");
			String sno = input.next();
			System.out.print("������");
			String sname = input.next();
			System.out.print("�Ա�");
			String sex = input.next();
			System.out.print("���䣺");
			int age = input.nextInt();
			System.out.print("רҵ��");
			String zy = input.next();
			System.out.print("��ϵ��ʽ��");
			String tel = input.next();
			stu[n - 1] = new Student(sno, sname, sex, age, zy, tel);
			System.out.println("���ѧ����Ϣ�ɹ���");
		} else {
			System.out.println("�Բ��𣬲���ѧ����Ϣʧ�ܣ�");
		}
	}

	// ɾ��ѧ����Ϣ
	public static void deleteStudent() {
		int num = countStudent();// ѧ��ʵ������
		System.out.println("������ɾ��ѧ����λ��");
		int n = input.nextInt();
		if (n > 0) {
			// ��ѭ����Ҫ����Ԫ������ƶ�
			for (int i = num - 1; i >= n - 1; i--) {
				stu[i] = stu[i + 1];

			}
			stu[num - 1] = null;
			System.out.println("ɾ��ѧ����Ϣ�ɹ���");
		} else {
			System.out.println("�Բ���ɾ��ѧ����Ϣʧ�ܣ�");
		}
	}

	// �޸�ѧ����Ϣ
	public static void updataStudent() {
		int k = -1;// �����ҵ�ѧ����Ӧ��Ԫ���±�
		System.out.println("�����޸�ѧ����ѧ�ţ�");
		String no = input.next();
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null && stu[i].sno.equals(no)) {
				k = i;//stu[]
				break;
			}
		}
		if (k != -1) {// ��ʱ˵����ѧ�Ŷ�Ӧ��ѧ������
			System.out.println("�������޸�ѧ��Ϊ��" + no + "��ѧ���޸ĺ����Ϣ��");
			System.out.print("������");
			stu[k].sname = input.next();
			System.out.print("�Ա�");
			stu[k].ssex = input.next();
			System.out.print("���䣺");
			stu[k].sage = input.nextInt();
			System.out.print("רҵ��");
			stu[k].smajor = input.next();
			System.out.print("��ϵ��ʽ��");
			stu[k].stel = input.next();
			System.out.println("��ϲ��ѧ��Ϊ��" + no + "��ѧ����Ϣ�޸ĳɹ���");
		} else {
			System.out.println("�޸�ʧ�ܣ�");
		}
	}

	public static void main(String[] args) {
		do{
			menu();
			select();
		}while(true);
	}
}
