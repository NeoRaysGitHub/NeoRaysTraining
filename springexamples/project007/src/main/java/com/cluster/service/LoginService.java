package com.cluster.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cluster.DAO.LoginDAO;
import com.cluster.beans.LoginBeans;

@Service("service")
public class LoginService {
	@Autowired
	private LoginDAO loginDao;
//	int count = 0;

	public String insert(LoginBeans bean) throws Exception {
		int count = 0;
		count = loginDao.insert(bean);
		if (count == 0) {
			return "Record Is Not Inserted";
		} else
			return "Record Is Inserted";
	}

	public List selectAll() throws Exception {
		List list = null;
		list = loginDao.selectAll();
		return list;
	}

	public List select(String user) throws Exception {
		List list = null;
		list = loginDao.select(user);
		
		return list;
	}
}
