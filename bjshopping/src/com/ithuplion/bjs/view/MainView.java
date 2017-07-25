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
 * 视图层：用户看到和操作的界面
 * 数据传递给controller层实现
 * 
 */
public class MainView {
	private ManagerController managerController = new ManagerController();
	private CustomerController customerController = new CustomerController();
	private GoodsController goodsController=new GoodsController();
	/*
	 * 实现界面效果 接收用户的输入 根据数据调用不同的功能
	 */
	public void run() throws Exception {
		// 创建Scanner类对象
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("\t欢迎使用便捷购物管理系统1.0版\n\n\n");
			System.out.println("****************************************\n\n");
			System.out.println("\t1.登录系统\n\n");
			System.out.println("\t2.更改管理员密码\n\n");
			System.out.println("\t3.退出系统\n\n");
			System.out.println("****************************************\n\n");
			System.out.print("请输入要操作的功能序号[1-3]:");
			// 接收用户的菜单选择
			int choose = input.nextInt();
			// 对选择的菜单判断,调用不同的功能
			switch (choose) {
			case 1:
				loginManager();
				break;
			case 2:
				editManager();
				break;
			case 3:
				System.out.println("谢谢你的使用！");
				System.exit(0);
				break;
			}
		}
	}

	/*
	 * 定义方法，实现对管理员密码的更改 实现思想： 接收用户的输入的信息 封装成Manager对象 调用控制层的方法，传递Manager对象，实现编辑
	 * 
	 */
	private void editManager() throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String username = input.next();
		System.out.print("请输入密码：");
		String password = input.next();
		Manager manager = managerController.login(username, password);
		if (manager != null) {
			System.out.print("请输入新的用户名：");
			String newUserName=input.next();
			System.out.print("请输入新的密码：");
			String newPassword=input.next();
			System.out.print("请再次输入新的密码：");
			String reNewPassword=input.next();
			//根据用户名输入的用户名、密码、新密码修改管理密码
			if(newPassword.equals(reNewPassword)){
				//修改管理员密码的方法
				int i=managerController.editManagerPassword(username,newUserName,newPassword);
				if(i>0){
					System.out.println("用户名和密码已修改！");
				}
			}else{
				System.out.println("两次输入的新密码不一致");
			}
		} else {
			System.out.println("用户名密码错误！");
		}
		
	}

	/*
	 * 定义方法，管理员的登录功能 实现思想： 接收用户的输入信息 封装成Manager对象 调用控制层的方法，实现登录
	 */
	private void loginManager() throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String username = input.next();
		System.out.print("请输入密码：");
		String password = input.next();
		Manager manager = managerController.login(username, password);
		if (manager != null) {
			mainView();
		} else {
			System.out.println("登录失败");
		}
	}

	private void mainView() throws Exception {
		// 创建Scanner类对象
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("\t\n欢迎使用便捷购物管理系统\n\n\n");
			System.out.println("****************************************\n\n");
			System.out.println("\t1.客户信息管理\n\n");
			System.out.println("\t2.购物结算\n\n");
			System.out.println("\t3.真情回馈\n\n");
			System.out.println("\t4.注销\n\n");
			System.out.println("****************************************\n\n");
			System.out.print("请输入要操作的功能序号[1-4]:");
			// 接收用户的菜单选择
			int choose = input.nextInt();
			// 对选择的菜单判断,调用不同的功能
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
	 * 真情回馈方法：
	 */
	private void zhenQingHuiKui() {
		Scanner input=new Scanner(System.in);
		while(true){
			System.out.println("便捷购物管理系统>真情回馈\n\n");
			System.out.println("***********************************\n\n");
			System.out.println("1.幸运大放送\n\n");
			System.out.println("2.幸运抽奖\n\n");
			System.out.println("3.生日问候\n\n");
			System.out.println("***********************************\n\n");
			System.out.print("请选择，输入数字或按'n'返回上一级菜单：");
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
	 * 生日问候方法
	 */
	private void shengRiWenHou() {
		Scanner input=new Scanner(System.in);
		System.out.println("便捷购物管理系统>生日问候\n\n");
		System.out.print("请输入今天的日期(月/日期<用两位表示>):\n\n");
		String custBirth=input.next();
		System.out.println("过生日的会员是：");
		//根据用户输入的日期查询有哪些会员
		try {
			List<Customer> customers=customerController.findCustomerByCustbirth(custBirth);
			for (Customer customer : customers) {
				System.out.println(customer.getCustNo()+"  "+customer.getCustBirth()+"  "+customer.getCustScore());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("恭喜!获赠MP3一个!\n\n");
		while(true){
			System.out.print("请'n'返回上一级菜单：");
			String num = input.next();
			if("n".equals(num)){
				break;
			}else{
				System.out.println("请重新输入：");
			}
		}
	}

	/**
	 * 幸运抽奖方法
	 */
	private void xinChouJiang() {
		Scanner input=new Scanner(System.in);
		System.out.println("便捷购物管理系统>幸运抽奖\n\n");
		System.out.print("是否开始(y/n):");
		String choice=input.next();
		if("y".equals(choice)){
			System.out.println("幸运客户获赠MP3:1900");
		}
		while(true){
			System.out.print("请'n'返回上一级菜单：");
			String num = input.next();
			if("n".equals(num)){
				break;
			}else{
				System.out.println("请重新输入：");
			}
		}
	}

	/**
	 * 幸运大放送方法
	 * @throws Exception 
	 */
	private void xinDaFangSong(){
		Scanner input=new Scanner(System.in);
		System.out.println("便捷购物管理系统>幸运大放送\n\n\n");
		System.out.print("具有最高积分的会员是：");
		//查询最高会员积分的信息：
		Customer customer;
		try {
			customer = customerController.selectMaxCustomerScore();
			System.out.println(customer.getCustNo()+"  "+customer.getCustBirth()+"  "+customer.getCustScore());
			System.out.println("恭喜！获赠礼品：一个价值￥12000.0的苹果笔记本电脑");
		} catch (Exception e) {
			e.printStackTrace();
		}
		while(true){
			System.out.print("请'n'返回上一级菜单：");
			String num = input.next();
			if("n".equals(num)){
				break;
			}else{
				System.out.println("请重新输入：");
			}
		}
	}

	/*
	 * 购物结算方法：
	 * @param 
	 */
	private void shopping() {
		Scanner input=new Scanner(System.in);
		System.out.println("便捷购物管理系统>购物结算\n\n");
		System.out.println("******************************************\n");
		System.out.println("请选择购买的商品编号:");
		try {
			System.out.println("商品号\t\t商品名称\t\t商品价格");
			System.out.println("-------------|--------------|-----------");
			List<Goods> goods=goodsController.findAllGoods();
			for (Goods good : goods) {
				System.out.println(good.getId()+"\t\t"+good.getGoodsName()+"\t\t"+good.getGoodsPrice());
			}
		} catch (Exception e) {
			System.out.println("商品信息为空");
		}
		System.out.println("********************************************");
		System.out.print("请输入会员号：");
		int custNo=input.nextInt();//
		System.out.print("请输入商品编号：");
		int goodId=input.nextInt();
		System.out.print("请输入购买商品数目：");
		int goodNum=input.nextInt();//商品数量
		System.out.println("\n\n****************消费清单*******************");
		System.out.println("商品名称\t\t\t单价\t\t\t商品数量\t\t\t金额");
		try {
			Goods good=goodsController.findGoodsById(goodId);
			double JinE=good.getGoodsPrice()*goodNum;//金额
			System.out.println(good.getGoodsName()+"\t\t\t￥"+good.getGoodsPrice()+"\t\t\t"+goodNum+"\t\t\t￥"+good.getGoodsPrice()*goodNum);
			if(JinE>7.5){
				System.out.println("折扣："+7.5+"折");
				double totalJinE=good.getGoodsPrice()*goodNum*0.75;
				System.out.println("金额总计：￥"+totalJinE);
				System.out.print("实际缴费：￥");
				//缴费
				double jiaoFei=input.nextDouble();
				System.out.println(jiaoFei);
				double zq=jiaoFei-totalJinE;
				System.out.println("找钱：￥"+zq);
				double score=JinE*0.1;
				System.out.println("本次购物所获得积分是："+score);
				//System.out.println("此处还没实现客户积分的增加");
			}else if(JinE>4000){
				System.out.println("折扣："+8.0+"折");
				double totalJinE=good.getGoodsPrice()*goodNum*0.80;
				System.out.println("金额总计：￥"+totalJinE);
				System.out.print("实际缴费：￥");
				double jf=input.nextDouble();
				System.out.println(jf);
				double zq=jf-totalJinE;
				System.out.println("找钱：￥"+zq);
				double score=JinE*0.1;
				System.out.println("本次购物所获得积分是："+score);
			}else if(JinE>3000){
				System.out.println("折扣："+8.5+"折");
				double totalJinE=good.getGoodsPrice()*goodNum*0.85;
				System.out.println("金额总计：￥"+totalJinE);
				System.out.print("实际缴费：￥");
				double jf=input.nextDouble();
				System.out.println(jf);
				double zq=jf-totalJinE;
				System.out.println("找钱：￥"+zq);
				double score=JinE*0.1;
				System.out.println("本次购物所获得积分是："+score);
			}else if(JinE>2000){
				System.out.println("折扣："+9.0+"折");
				double totalJinE=good.getGoodsPrice()*goodNum*0.9;
				System.out.println("金额总计：￥"+totalJinE);
				System.out.print("实际缴费：￥");
				double jf=input.nextDouble();
				System.out.println(jf);
				double zq=jf-totalJinE;
				System.out.println("找钱：￥"+zq);
				double score=JinE*0.1;
				System.out.println("本次购物所获得积分是："+score);
			}else if(JinE>1000){
				System.out.println("折扣："+9.5+"折");
				double totalJinE=good.getGoodsPrice()*goodNum*0.95;
				System.out.println("金额总计：￥"+totalJinE);
				System.out.print("实际缴费：￥");
				double jf=input.nextDouble();
				System.out.println(jf);
				double zq=jf-totalJinE;
				System.out.println("找钱：￥"+zq);
				double score=JinE*0.1;
				System.out.println("本次购物所获得积分是："+score);
			}else{
				System.out.println("折扣："+9.9+"折");
				double totalJinE=good.getGoodsPrice()*goodNum*0.99;
				System.out.println("金额总计：￥"+totalJinE);
				System.out.print("实际缴费：￥");
				double jf=input.nextDouble();
				System.out.println(jf);
				double zq=jf-totalJinE;
				System.out.println("找钱：￥"+zq);
				double score=JinE*0.1;
				System.out.println("本次购物所获得积分是："+score);
				
			}
		} catch (Exception e) {
			System.out.println("请输入正确的商品信息");
		}
		while(true){
			System.out.print("请'n'返回上一级菜单：");
			String num = input.next();
			if("n".equals(num)){
				break;
			}else{
				System.out.println("请重新输入：");
			}
		}
	}

	/*
	 * 客户信息管理方法：
	 * 
	 */
	private void customerManager() {
		//创建Scanner类对象
		Scanner input=new Scanner(System.in);
		while(true){
		System.out.println("\n\n便捷购物管理系统>客户信息管理\n");
		System.out.println("****************************************\n\n");
		System.out.println("\t1.显示所有客户信息\n\n");
		System.out.println("\t2.添加客户信息\n\n");
		System.out.println("\t3.修改客户信息\n\n");
		System.out.println("\t4.查询客户信息\n\n");
		System.out.println("****************************************\n\n");
		System.out.println("请输入要操作的功能序号[1-4]或按'n'返回上一级菜单：");
		//接收用户的菜单选择
		String choose = input.next();
		//对选择的菜单判断,调用不同的功能
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
	 * 查询客户信息方法：根据客户会员号查询
	 * 		用户输入会员号，调用控制层方法
	 */
	private void findCustomerByNo() {
		while(true){
			//创建Scanner类对象
			Scanner input=new Scanner(System.in);
			System.out.println("\n\n便捷购物管理系统>客户信息管理>查询客户信息");
			System.out.print("请输入会员号：");
			int custNo=input.nextInt();
			System.out.println("会员号\t\t生日\t\t积分");
			System.out.println("-------------|--------------|-----------");
			try {
				Customer customer=customerController.findCustomerByCustNo(custNo);
				System.out.println(customer.getCustNo()+"\t\t"+customer.getCustBirth()+"\t\t"+customer.getCustScore());
			} catch (Exception e) {
				System.out.println("用户不存在");
			}
			System.out.print("要继续查询吗(y/n):");
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
	 * 修改客户信息方法：
	 * 	实现思想：
	 * 		1.查询需要修改的客户信息：根据会员号查询
	 * 		2.
	 * 
	 */
	private void editCustomer() {
		//创建Scanner类对象
		Scanner input=new Scanner(System.in);
		System.out.println("\n\n便捷购物管理系统>客户信息管理>修改客户信息");
		System.out.print("请输入会员号：");
		int custNo=input.nextInt();
		System.out.println("会员号\t\t生日\t\t积分");
		System.out.println("-------------|--------------|-----------");
		try {
			Customer customer=customerController.findCustomerByCustNo(custNo);
			System.out.println(customer.getCustNo()+"\t\t"+customer.getCustBirth()+"\t\t"+customer.getCustScore());
		} catch (Exception e) {
			System.out.println("用户不存在");
		}
		System.out.println("\n*******************************************\n");
		System.out.println("\t1.修改会员生日\n\n");
		System.out.println("\t2.修改会员积分");
		System.out.print("\n*******************************************\n");
		System.out.print("请选择，输入数字：");
		int choice=input.nextInt();
		switch(choice){
		case 1:
			System.out.print("请输入修改后生日：");
			String custBirth=input.next();
			try {
				customerController.editCustomerBirth(custNo,custBirth);
			} catch (Exception e) {
				System.out.println("生日信息修改失败");
			}
			System.out.println("生日信息已修改");
			break;
		case 2:
			System.out.print("请输入修改后积分：");
			int custScore=input.nextInt();
			try {
				customerController.editCustomerScore(custNo,custScore);
			} catch (Exception e) {
				System.out.println("积分信息修改失败");
			}
			System.out.println("积分信息已修改");
			break;
		}
		while(true){
			System.out.print("请'n'返回上一级菜单：");
			String num = input.next();
			if("n".equals(num)){
				break;
			}else{
				System.out.println("请重新输入：");
			}
		}
	}

	/*
	 * 添加客户信息方法：
	 * 	实现思想：
	 * 		用户输入客户的基本信息，封装到Customer对象中，调用Controller方法
	 * 
	 */
	private void addCustomer() {
		//创建Scanner类对象
		Scanner input=new Scanner(System.in);
		System.out.println("\n\n便捷购物管理系统>客户信息管理>添加客户信息");
		System.out.print("请输入会员号(<4位整数>):");
		int cusoNo=input.nextInt();
		System.out.print("请输入会员号生日(月/日<用2位整数表示>):");
		String custBirth=input.next();
		System.out.print("请输入会员号积分:");
		int custScore = input.nextInt();
		Customer customer=new Customer(cusoNo,custBirth,custScore);
		try {
			int n=customerController.addCustomer(customer);
			if(n>0){
				System.out.println("新会员添加成功");
			}else{
				System.out.println("新会员添加失败");
			}
		} catch (Exception e) {
			System.out.println("新会员添加失败");
		}
		while(true){
			System.out.print("请'n'返回上一级菜单：");
			String num = input.next();
			if("n".equals(num)){
				break;
			}else{
				System.out.println("请重新输入：");
			}
		}
	}

	/**
	 * 显示所有客户信息方法：
	 * 		调用控制层的方法，查询所有客户信息
	 * 
	 */
	private void showAllCustomer() {
		Scanner input=new Scanner(System.in);
		System.out.println("\n\n便捷购物管理系统>客户信息管理>显示客户信息\n\n");
		System.out.println("会员号\t\t生日\t\t积分");
		System.out.println("-------------|--------------|-----------");
		try {
			List<Customer> allCustomers = customerController.showAllCustomers();
			for (Customer customer : allCustomers) {
				System.out.println(customer.getCustNo()+"\t\t"+customer.getCustBirth()+"\t\t"+customer.getCustScore());
			}
		} catch (Exception e) {
			System.out.println("用户信息为空");
		}
		while(true){
			System.out.print("请'n'返回上一级菜单：");
			String num = input.next();
			if("n".equals(num)){
				break;
			}else{
				System.out.println("请重新输入：");
			}
		}
	}
}
