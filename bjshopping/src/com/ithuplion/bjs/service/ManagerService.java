package com.ithuplion.bjs.service;

import com.ithuplion.bjs.dao.ManagerDao;
import com.ithuplion.bjs.domain.Manager;

public class ManagerService {
	private ManagerDao managerDao=new ManagerDao();
	public Manager login(String username, String password) throws Exception {
		return managerDao.login(username,password);
	}
	/**
	 * 业务逻辑层：
	 * 		根据控制层传递的数据信息调用数据层修改管理员密码
	 * @param username
	 * @param newUserName
	 * @param newPassword
	 * @return
	 * @throws Exception 
	 */
	public int editManagerPassword(String username, String newUserName, String newPassword) throws Exception {
		//调用数据层的方法
		return managerDao.editManagerPassword(username,newUserName,newPassword);
	}

}
