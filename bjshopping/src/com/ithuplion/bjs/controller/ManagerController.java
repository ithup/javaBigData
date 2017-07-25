package com.ithuplion.bjs.controller;
/**
 * 管理员信息类
 */
import com.ithuplion.bjs.domain.Manager;
import com.ithuplion.bjs.service.ManagerService;

public class ManagerController {
	private ManagerService managerService =new ManagerService();
	/*
	 * 登录功能：实现管理员的登录
	 * 		方法由视图层调用，调用业务层方法
	 */
	public Manager login(String username, String password) throws Exception {
		return managerService.login(username,password);
	}
	/**
	 * 控制层:
	 * 		根据视图层传递的数据修改管理员密码，由视图层调用，调用业务逻辑层
	 * @param username
	 * @param newUserName
	 * @param newPassword
	 * @return
	 * @throws Exception 
	 */
	public int editManagerPassword(String username, String newUserName, String newPassword) throws Exception {
		return managerService.editManagerPassword(username,newUserName,newPassword);
	}
}
