package com.ithuplion.bjs.view;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

import com.ithuplion.bjs.controller.CustomerController;
import com.ithuplion.bjs.controller.GoodsController;
import com.ithuplion.bjs.controller.ManagerController;
import com.ithuplion.bjs.domain.Customer;
import com.ithuplion.bjs.domain.Goods;
import com.ithuplion.bjs.domain.Manager;

/*
 * ��ͼ�㣺�û������Ͳ����Ľ���
 * ���ݴ��ݸ�controller��ʵ��
 * 
 */
public class MainView {
	private ManagerController managerController = new ManagerController();
	private CustomerController customerController = new CustomerController();
	private GoodsController goodsController=new GoodsController();
	/*
	 * ʵ�ֽ���Ч�� �����û������� �������ݵ��ò�ͬ�Ĺ���
	 */
	public void run() throws Exception {
		// ����Scanner�����
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("\t��ӭʹ�ñ�ݹ������ϵͳ1.0��\n\n\n");
			System.out.println("****************************************\n\n");
			System.out.println("\t1.��¼ϵͳ\n\n");
			System.out.println("\t2.���Ĺ���Ա����\n\n");
			System.out.println("\t3.�˳�ϵͳ\n\n");
			System.out.println("****************************************\n\n");
			System.out.print("������Ҫ�����Ĺ������[1-3]:");
			// �����û��Ĳ˵�ѡ��
			int choose = input.nextInt();
			// ��ѡ��Ĳ˵��ж�,���ò�ͬ�Ĺ���
			switch (choose) {
			case 1:
				loginManager();
				break;
			case 2:
				editManager();
				break;
			case 3:
				System.out.println("лл���ʹ�ã�");
				System.exit(0);
				break;
			}
		}
	}

	/*
	 * ���巽����ʵ�ֶԹ���Ա����ĸ��� ʵ��˼�룺 �����û����������Ϣ ��װ��Manager���� ���ÿ��Ʋ�ķ���������Manager����ʵ�ֱ༭
	 * 
	 */
	private void editManager() throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("�������û�����");
		String username = input.next();
		System.out.print("���������룺");
		String password = input.next();
		Manager manager = managerController.login(username, password);
		if (manager != null) {
			System.out.print("�������µ��û�����");
			String newUserName=input.next();
			System.out.print("�������µ����룺");
			String newPassword=input.next();
			System.out.print("���ٴ������µ����룺");
			String reNewPassword=input.next();
			//�����û���������û��������롢�������޸Ĺ�������
			if(newPassword.equals(reNewPassword)){
				//�޸Ĺ���Ա����ķ���
				int i=managerController.editManagerPassword(username,newUserName,newPassword);
				if(i>0){
					System.out.println("�û������������޸ģ�");
				}
			}else{
				System.out.println("��������������벻һ��");
			}
		} else {
			System.out.println("�û����������");
		}
		
	}

	/*
	 * ���巽��������Ա�ĵ�¼���� ʵ��˼�룺 �����û���������Ϣ ��װ��Manager���� ���ÿ��Ʋ�ķ�����ʵ�ֵ�¼
	 */
	private void loginManager() throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("�������û�����");
		String username = input.next();
		System.out.print("���������룺");
		String password = input.next();
		Manager manager = managerController.login(username, password);
		if (manager != null) {
			mainView();
		} else {
			System.out.println("��¼ʧ��");
		}
	}

	private void mainView() throws Exception {
		// ����Scanner�����
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("\t\n��ӭʹ�ñ�ݹ������ϵͳ\n\n\n");
			System.out.println("****************************************\n\n");
			System.out.println("\t1.�ͻ���Ϣ����\n\n");
			System.out.println("\t2.�������\n\n");
			System.out.println("\t3.�������\n\n");
			System.out.println("\t4.ע��\n\n");
			System.out.println("****************************************\n\n");
			System.out.print("������Ҫ�����Ĺ������[1-4]:");
			// �����û��Ĳ˵�ѡ��
			int choose = input.nextInt();
			// ��ѡ��Ĳ˵��ж�,���ò�ͬ�Ĺ���
			switch (choose) {
			case 1:
				customerManager();
				break;
			case 2:
				shopping();
				break;
			case 3:
				zhenQingHuiKui();
				break;
			case 4:
				run();
				break;
			}
		}
	}

	/*
	 * �������������
	 */
	private void zhenQingHuiKui() {
		Scanner input=new Scanner(System.in);
		while(true){
			System.out.println("��ݹ������ϵͳ>�������\n\n");
			System.out.println("***********************************\n\n");
			System.out.println("1.���˴����\n\n");
			System.out.println("2.���˳齱\n\n");
			System.out.println("3.�����ʺ�\n\n");
			System.out.println("***********************************\n\n");
			System.out.print("��ѡ���������ֻ�'n'������һ���˵���");
			String choice=input.next();
			switch(choice){
			case "1":
				xinDaFangSong();
				break;
			case "2":
				xinChouJiang();
				break;
			case "3":
				shengRiWenHou();
				break;
			}
			if("n".equals(choice)) break;
		}
		
	}
	/**
	 * �����ʺ򷽷�
	 */
	private void shengRiWenHou() {
		Scanner input=new Scanner(System.in);
		System.out.println("��ݹ������ϵͳ>�����ʺ�\n\n");
		System.out.print("��������������(��/����<����λ��ʾ>):\n\n");
		String custBirth=input.next();
		System.out.println("�����յĻ�Ա�ǣ�");
		//�����û���������ڲ�ѯ����Щ��Ա
		try {
			List<Customer> customers=customerController.findCustomerByCustbirth(custBirth);
			for (Customer customer : customers) {
				System.out.println(customer.getCustNo()+"  "+customer.getCustBirth()+"  "+customer.getCustScore());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("��ϲ!����MP3һ��!\n\n");
		while(true){
			System.out.print("��'n'������һ���˵���");
			String num = input.next();
			if("n".equals(num)){
				break;
			}else{
				System.out.println("���������룺");
			}
		}
	}

	/**
	 * ���˳齱����
	 */
	private void xinChouJiang() {
		Scanner input=new Scanner(System.in);
		System.out.println("��ݹ������ϵͳ>���˳齱\n\n");
		System.out.print("�Ƿ�ʼ(y/n):");
		String choice=input.next();
		if("y".equals(choice)){
			System.out.println("���˿ͻ�����MP3:1900");
		}
		while(true){
			System.out.print("��'n'������һ���˵���");
			String num = input.next();
			if("n".equals(num)){
				break;
			}else{
				System.out.println("���������룺");
			}
		}
	}

	/**
	 * ���˴���ͷ���
	 * @throws Exception 
	 */
	private void xinDaFangSong(){
		Scanner input=new Scanner(System.in);
		System.out.println("��ݹ������ϵͳ>���˴����\n\n\n");
		System.out.print("������߻��ֵĻ�Ա�ǣ�");
		//��ѯ��߻�Ա���ֵ���Ϣ��
		Customer customer;
		try {
			customer = customerController.selectMaxCustomerScore();
			System.out.println(customer.getCustNo()+"  "+customer.getCustBirth()+"  "+customer.getCustScore());
			System.out.println("��ϲ��������Ʒ��һ����ֵ��12000.0��ƻ���ʼǱ�����");
		} catch (Exception e) {
			e.printStackTrace();
		}
		while(true){
			System.out.print("��'n'������һ���˵���");
			String num = input.next();
			if("n".equals(num)){
				break;
			}else{
				System.out.println("���������룺");
			}
		}
	}

	/*
	 * ������㷽����
	 * @param 
	 */
	private void shopping() {
		Scanner input=new Scanner(System.in);
		System.out.println("��ݹ������ϵͳ>�������\n\n");
		System.out.println("******************************************\n");
		System.out.println("��ѡ�������Ʒ���:");
		try {
			System.out.println("��Ʒ��\t\t��Ʒ����\t\t��Ʒ�۸�");
			System.out.println("-------------|--------------|-----------");
			List<Goods> goods=goodsController.findAllGoods();
			for (Goods good : goods) {
				System.out.println(good.getId()+"\t\t"+good.getGoodsName()+"\t\t"+good.getGoodsPrice());
			}
		} catch (Exception e) {
			System.out.println("��Ʒ��ϢΪ��");
		}
		System.out.println("********************************************");
		System.out.print("�������Ա�ţ�");
		int custNo=input.nextInt();//
		System.out.print("��������Ʒ��ţ�");
		int goodId=input.nextInt();
		System.out.print("�����빺����Ʒ��Ŀ��");
		int goodNum=input.nextInt();//��Ʒ����
		System.out.println("\n\n****************�����嵥*******************");
		System.out.println("��Ʒ����\t\t\t����\t\t\t��Ʒ����\t\t\t���");
		try {
			Goods good=goodsController.findGoodsById(goodId);
			double JinE=good.getGoodsPrice()*goodNum;//���
			System.out.println(good.getGoodsName()+"\t\t\t��"+good.getGoodsPrice()+"\t\t\t"+goodNum+"\t\t\t��"+good.getGoodsPrice()*goodNum);
			if(JinE>7.5){
				System.out.println("�ۿۣ�"+7.5+"��");
				double totalJinE=good.getGoodsPrice()*goodNum*0.75;
				System.out.println("����ܼƣ���"+totalJinE);
				System.out.print("ʵ�ʽɷѣ���");
				//�ɷ�
				double jiaoFei=input.nextDouble();
				System.out.println(jiaoFei);
				double zq=jiaoFei-totalJinE;
				System.out.println("��Ǯ����"+zq);
				double score=JinE*0.1;
				System.out.println("���ι�������û����ǣ�"+score);
				//System.out.println("�˴���ûʵ�ֿͻ����ֵ�����");
			}else if(JinE>4000){
				System.out.println("�ۿۣ�"+8.0+"��");
				double totalJinE=good.getGoodsPrice()*goodNum*0.80;
				System.out.println("����ܼƣ���"+totalJinE);
				System.out.print("ʵ�ʽɷѣ���");
				double jf=input.nextDouble();
				System.out.println(jf);
				double zq=jf-totalJinE;
				System.out.println("��Ǯ����"+zq);
				double score=JinE*0.1;
				System.out.println("���ι�������û����ǣ�"+score);
			}else if(JinE>3000){
				System.out.println("�ۿۣ�"+8.5+"��");
				double totalJinE=good.getGoodsPrice()*goodNum*0.85;
				System.out.println("����ܼƣ���"+totalJinE);
				System.out.print("ʵ�ʽɷѣ���");
				double jf=input.nextDouble();
				System.out.println(jf);
				double zq=jf-totalJinE;
				System.out.println("��Ǯ����"+zq);
				double score=JinE*0.1;
				System.out.println("���ι�������û����ǣ�"+score);
			}else if(JinE>2000){
				System.out.println("�ۿۣ�"+9.0+"��");
				double totalJinE=good.getGoodsPrice()*goodNum*0.9;
				System.out.println("����ܼƣ���"+totalJinE);
				System.out.print("ʵ�ʽɷѣ���");
				double jf=input.nextDouble();
				System.out.println(jf);
				double zq=jf-totalJinE;
				System.out.println("��Ǯ����"+zq);
				double score=JinE*0.1;
				System.out.println("���ι�������û����ǣ�"+score);
			}else if(JinE>1000){
				System.out.println("�ۿۣ�"+9.5+"��");
				double totalJinE=good.getGoodsPrice()*goodNum*0.95;
				System.out.println("����ܼƣ���"+totalJinE);
				System.out.print("ʵ�ʽɷѣ���");
				double jf=input.nextDouble();
				System.out.println(jf);
				double zq=jf-totalJinE;
				System.out.println("��Ǯ����"+zq);
				double score=JinE*0.1;
				System.out.println("���ι�������û����ǣ�"+score);
			}else{
				System.out.println("�ۿۣ�"+9.9+"��");
				double totalJinE=good.getGoodsPrice()*goodNum*0.99;
				System.out.println("����ܼƣ���"+totalJinE);
				System.out.print("ʵ�ʽɷѣ���");
				double jf=input.nextDouble();
				System.out.println(jf);
				double zq=jf-totalJinE;
				System.out.println("��Ǯ����"+zq);
				double score=JinE*0.1;
				System.out.println("���ι�������û����ǣ�"+score);
				
			}
		} catch (Exception e) {
			System.out.println("��������ȷ����Ʒ��Ϣ");
		}
		while(true){
			System.out.print("��'n'������һ���˵���");
			String num = input.next();
			if("n".equals(num)){
				break;
			}else{
				System.out.println("���������룺");
			}
		}
	}

	/*
	 * �ͻ���Ϣ��������
	 * 
	 */
	private void customerManager() {
		//����Scanner�����
		Scanner input=new Scanner(System.in);
		while(true){
		System.out.println("\n\n��ݹ������ϵͳ>�ͻ���Ϣ����\n");
		System.out.println("****************************************\n\n");
		System.out.println("\t1.��ʾ���пͻ���Ϣ\n\n");
		System.out.println("\t2.��ӿͻ���Ϣ\n\n");
		System.out.println("\t3.�޸Ŀͻ���Ϣ\n\n");
		System.out.println("\t4.��ѯ�ͻ���Ϣ\n\n");
		System.out.println("****************************************\n\n");
		System.out.println("������Ҫ�����Ĺ������[1-4]��'n'������һ���˵���");
		//�����û��Ĳ˵�ѡ��
		String choose = input.next();
		//��ѡ��Ĳ˵��ж�,���ò�ͬ�Ĺ���
		switch(choose){
		  case "1":
			showAllCustomer();
			break;
		  case "2":
			addCustomer();
			break;
		  case "3":
			editCustomer();
			break;
		  case "4":
			findCustomerByNo();
			break;
		}
		if("n".equals(choose)) break;
		}
	}
	/*
	 * ��ѯ�ͻ���Ϣ���������ݿͻ���Ա�Ų�ѯ
	 * 		�û������Ա�ţ����ÿ��Ʋ㷽��
	 */
	private void findCustomerByNo() {
		while(true){
			//����Scanner�����
			Scanner input=new Scanner(System.in);
			System.out.println("\n\n��ݹ������ϵͳ>�ͻ���Ϣ����>��ѯ�ͻ���Ϣ");
			System.out.print("�������Ա�ţ�");
			int custNo=input.nextInt();
			System.out.println("��Ա��\t\t����\t\t����");
			System.out.println("-------------|--------------|-----------");
			try {
				Customer customer=customerController.findCustomerByCustNo(custNo);
				System.out.println(customer.getCustNo()+"\t\t"+customer.getCustBirth()+"\t\t"+customer.getCustScore());
			} catch (Exception e) {
				System.out.println("�û�������");
			}
			System.out.print("Ҫ������ѯ��(y/n):");
			String number=input.next();
			if("y".equals(number)){ 
				continue;
			}
			else if("n".equals(number)) {
				break;
			}
		}
	}

	/*
	 * �޸Ŀͻ���Ϣ������
	 * 	ʵ��˼�룺
	 * 		1.��ѯ��Ҫ�޸ĵĿͻ���Ϣ�����ݻ�Ա�Ų�ѯ
	 * 		2.
	 * 
	 */
	private void editCustomer() {
		//����Scanner�����
		Scanner input=new Scanner(System.in);
		System.out.println("\n\n��ݹ������ϵͳ>�ͻ���Ϣ����>�޸Ŀͻ���Ϣ");
		System.out.print("�������Ա�ţ�");
		int custNo=input.nextInt();
		System.out.println("��Ա��\t\t����\t\t����");
		System.out.println("-------------|--------------|-----------");
		try {
			Customer customer=customerController.findCustomerByCustNo(custNo);
			System.out.println(customer.getCustNo()+"\t\t"+customer.getCustBirth()+"\t\t"+customer.getCustScore());
		} catch (Exception e) {
			System.out.println("�û�������");
		}
		System.out.println("\n*******************************************\n");
		System.out.println("\t1.�޸Ļ�Ա����\n\n");
		System.out.println("\t2.�޸Ļ�Ա����");
		System.out.print("\n*******************************************\n");
		System.out.print("��ѡ���������֣�");
		int choice=input.nextInt();
		switch(choice){
		case 1:
			System.out.print("�������޸ĺ����գ�");
			String custBirth=input.next();
			try {
				customerController.editCustomerBirth(custNo,custBirth);
			} catch (Exception e) {
				System.out.println("������Ϣ�޸�ʧ��");
			}
			System.out.println("������Ϣ���޸�");
			break;
		case 2:
			System.out.print("�������޸ĺ���֣�");
			int custScore=input.nextInt();
			try {
				customerController.editCustomerScore(custNo,custScore);
			} catch (Exception e) {
				System.out.println("������Ϣ�޸�ʧ��");
			}
			System.out.println("������Ϣ���޸�");
			break;
		}
		while(true){
			System.out.print("��'n'������һ���˵���");
			String num = input.next();
			if("n".equals(num)){
				break;
			}else{
				System.out.println("���������룺");
			}
		}
	}

	/*
	 * ��ӿͻ���Ϣ������
	 * 	ʵ��˼�룺
	 * 		�û�����ͻ��Ļ�����Ϣ����װ��Customer�����У�����Controller����
	 * 
	 */
	private void addCustomer() {
		//����Scanner�����
		Scanner input=new Scanner(System.in);
		System.out.println("\n\n��ݹ������ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
		System.out.print("�������Ա��(<4λ����>):");
		int cusoNo=input.nextInt();
		System.out.print("�������Ա������(��/��<��2λ������ʾ>):");
		String custBirth=input.next();
		System.out.print("�������Ա�Ż���:");
		int custScore = input.nextInt();
		Customer customer=new Customer(cusoNo,custBirth,custScore);
		try {
			int n=customerController.addCustomer(customer);
			if(n>0){
				System.out.println("�»�Ա��ӳɹ�");
			}else{
				System.out.println("�»�Ա���ʧ��");
			}
		} catch (Exception e) {
			System.out.println("�»�Ա���ʧ��");
		}
		while(true){
			System.out.print("��'n'������һ���˵���");
			String num = input.next();
			if("n".equals(num)){
				break;
			}else{
				System.out.println("���������룺");
			}
		}
	}

	/**
	 * ��ʾ���пͻ���Ϣ������
	 * 		���ÿ��Ʋ�ķ�������ѯ���пͻ���Ϣ
	 * 
	 */
	private void showAllCustomer() {
		Scanner input=new Scanner(System.in);
		System.out.println("\n\n��ݹ������ϵͳ>�ͻ���Ϣ����>��ʾ�ͻ���Ϣ\n\n");
		System.out.println("��Ա��\t\t����\t\t����");
		System.out.println("-------------|--------------|-----------");
		try {
			List<Customer> allCustomers = customerController.showAllCustomers();
			for (Customer customer : allCustomers) {
				System.out.println(customer.getCustNo()+"\t\t"+customer.getCustBirth()+"\t\t"+customer.getCustScore());
			}
		} catch (Exception e) {
			System.out.println("�û���ϢΪ��");
		}
		while(true){
			System.out.print("��'n'������һ���˵���");
			String num = input.next();
			if("n".equals(num)){
				break;
			}else{
				System.out.println("���������룺");
			}
		}
	}
}
