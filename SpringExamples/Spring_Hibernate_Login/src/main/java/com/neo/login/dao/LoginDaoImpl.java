package com.neo.login.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neo.login.model.Login;
@Repository("loginDao")
public class LoginDaoImpl {
	@Autowired
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	Session session = null;
	public Login login(Login login){
		String sql = "SELECT login.username FROM com.neo.login.model.Login as login WHERE login.email_id= ?  AND login.password = ?";
		// create session object
		session = sessionFactory.openSession();
		Query query = session.createQuery(sql);
		// set the query params to the query
		query.setParameter(0, login.getEmail_id());
		query.setParameter(1, login.getPassword());
		// execute the query
		String[] obj = (String[]) query.uniqueResult();
		if(obj!=null && obj.length>0){
			login.setUsername((String) obj[0]);
		}
		return login;
		
	}
}
