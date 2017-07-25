package day06;

import java.util.Scanner;

/**
 * 简单的学生信息管理信息v1.0
 * 
 * @author 顾怀要
 * 
 */
class Student {
	String sno; // 学号
	String sname;// 姓名
	String ssex;// 性别
	int sage;// 年龄
	String smajor;// 专业
	String stel;// 电话

	public Student() {
	}

	public Student(String sno, String sname, String ssex, int sage,
			String smajor, String stel) {
		this.sno = sno;// this 表示当前类的对象
		this.sname = sname;
		this.ssex = ssex;
		this.sage = sage;
		this.smajor = smajor;
		this.stel = stel;
	}

	public String toString() {
		return "学生信息 [学号=" + sno + ", 姓名=" + sname + ", 性别=" + ssex + ", 年龄="
				+ sage + ", 专业=" + smajor + ", 联系方式=" + stel + "]";
	}
}

public class StudentInfo {
	/*
	 * 1.静态方法只能调用静态方法，访问静态成员（属性） 2.非静态方法既可以调用静态方法，也可以调用非静态方法
	 */
	static Scanner input = new Scanner(System.in);
	// 学生对象数组
	static Student stu[];

	// 1.系统菜单
	public static void menu() {
		System.out.println("======学生信息管理系统v1.0==========");
		System.out.println("1.初始化系统");
		System.out.println("2.显示系统信息");
		System.out.println("3.添加学生信息");
		System.out.println("4.按学号删除学生信息");
		System.out.println("5.插入学生信息");
		System.out.println("6.按学号查询学生信息");
		System.out.println("7.按学号升序排序");
		System.out.println("8.备份系统信息");
		System.out.println("9.修改学生信息");
		System.out.println("10.退出系统");
		System.out.println("==================================");
	}

	// 2.选择菜单项
	public static void select() {
		System.out.print("请输入菜单项：");
		if (input.hasNextInt()) {
			int op = input.nextInt();// 接收一个整数
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
				System.out.println("请输入查找学生的学号：");
				String id = input.next();
				findBySno(id);
				break;
			case 7:
				sortStudentBySno();
				break;
			case 8:
				System.out.println("8.备份系统信息");
				break;
			case 9:
				updataStudent();
				break;
			case 10:
				System.out.println("拜拜！！！！！！！欢迎下次再来！");
				System.exit(0);// 表示正常退出虚拟机
				// System.exit(1);//表示不正常退出虚拟机
			}
		} else {
			System.out.println("输入的菜单项错误");
			System.exit(0);
		}
	}

	// 3.初始化系统
	public static void init() {
		stu = new Student[10];
		stu[0] = new Student("A102", "李四", "男", 32, "信息管理与信息系统", "9868972993");
		stu[1] = new Student("A103", "黄蓉", "女", 12, "计算机科学技术", "3249783");
		stu[2] = new Student("A101", "周三", "男", 22, "计算机软件技术", "13292993");
		System.out
				.println("===============欢迎来到学生信息管理系统！==================\n\n\n");
	}

	// 4.显示系统信息
	public static void display() {
		System.out.println("--------------学生信息------------------");
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null) {
				System.out.println(stu[i]);
			}
		}
	}

	// 统计学生人数
	public static int countStudent() {
		int s = 0;// 累加
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null) {
				s++;
			}
		}
		return s;
	}

	// 添加学生信息
	public static void addStudentInfo() {
		int num = countStudent();
		System.out.println("输入添加的学生人数：");
		int n = input.nextInt();
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				System.out.println("请输入" + (i + 1) + "学生信息：");
				System.out.print("学号：");
				String sno = input.next();
				System.out.print("姓名：");
				String sname = input.next();
				System.out.print("性别：");
				String sex = input.next();
				System.out.print("年龄：");
				int age = input.nextInt();
				System.out.print("专业：");
				String zy = input.next();
				System.out.print("联系方式：");
				String tel = input.next();
				stu[num + i] = new Student(sno, sname, sex, age, zy, tel);
				System.out.println("添加学生信息成功！");
			}
		} else {
			System.out.println("添加学生信息失败");
		}
	}

	// 5.按学号来查找学生信息
	public static void findBySno(String no) {
		boolean flag = false;
		int k = 0;
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null) {
				if (stu[i].sno.equals(no)) {
					k = i;
					flag = true;
					break;// 强制跳出循环
				}
			}
		}
		if (flag) {
			System.out.println("学号为：" + no + "的学生存在！");
			System.out.println(stu[k]);
		}
	}

	// 7.按学号升序排序
	public static void sortStudentBySno() {
		int num = countStudent();// 实际学生人数
		for (int i = 0; i < num - 1; i++) {// i表示比较的趟数
			for (int j = 0; j < num - 1 - i; j++) {
				if (stu[j].sno.compareTo(stu[j + i].sno) > 0) {
					Student temp = stu[j];
					stu[j] = stu[j + 1];
					stu[j + 1] = temp;
				}
			}
		}
		System.out.println("恭喜，按学号升序排序成功！");
	}

	// 按位置插入学生信息
	public static void insertStudent() {
		int num = countStudent();// 学生实际人数
		System.out.println("请输入插入学生的位置");
		int n = input.nextInt();
		if (n > 0) {
			// 该循环主要控制元素向后移动
			for (int i = num - 1; i >= n - 1; i--) {
				stu[i + 1] = stu[i];
			}
			System.out.print("学号：");
			String sno = input.next();
			System.out.print("姓名：");
			String sname = input.next();
			System.out.print("性别：");
			String sex = input.next();
			System.out.print("年龄：");
			int age = input.nextInt();
			System.out.print("专业：");
			String zy = input.next();
			System.out.print("联系方式：");
			String tel = input.next();
			stu[n - 1] = new Student(sno, sname, sex, age, zy, tel);
			System.out.println("添加学生信息成功！");
		} else {
			System.out.println("对不起，插入学生信息失败！");
		}
	}

	// 删除学生信息
	public static void deleteStudent() {
		int num = countStudent();// 学生实际人数
		System.out.println("请输入删除学生的位置");
		int n = input.nextInt();
		if (n > 0) {
			// 该循环主要控制元素向后移动
			for (int i = num - 1; i >= n - 1; i--) {
				stu[i] = stu[i + 1];

			}
			stu[num - 1] = null;
			System.out.println("删除学生信息成功！");
		} else {
			System.out.println("对不起，删除学生信息失败！");
		}
	}

	// 修改学生信息
	public static void updataStudent() {
		int k = -1;// 保存找到学生对应的元素下标
		System.out.println("输入修改学生的学号：");
		String no = input.next();
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null && stu[i].sno.equals(no)) {
				k = i;//stu[]
				break;
			}
		}
		if (k != -1) {// 此时说明该学号对应的学生存在
			System.out.println("请输入修改学号为：" + no + "的学生修改后的信息：");
			System.out.print("姓名：");
			stu[k].sname = input.next();
			System.out.print("性别：");
			stu[k].ssex = input.next();
			System.out.print("年龄：");
			stu[k].sage = input.nextInt();
			System.out.print("专业：");
			stu[k].smajor = input.next();
			System.out.print("联系方式：");
			stu[k].stel = input.next();
			System.out.println("恭喜，学号为：" + no + "的学生信息修改成功！");
		} else {
			System.out.println("修改失败！");
		}
	}

	public static void main(String[] args) {
		do{
			menu();
			select();
		}while(true);
	}
}
