package com.study.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.study.entities.UserBO;

@Repository("userDAO")
public class UserDAO implements IUserDAO {
	@Autowired
	SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public UserBO loadUserByUsername(String username) {
		return (UserBO) getSession().createQuery("SELECT o FROM UserBO o WHERE o.username=:username")
				.setParameter("username", username).uniqueResult();
	}

	@Override
	public List<UserBO> getAll() {
		String hql = "FROM UserBO u ";
		return getSession().createQuery(hql).list();
	}

	@Override
	public List<UserBO> search(UserBO userBO, Integer page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserBO getUserById(UserBO userBO) {
		return (UserBO) getSession().createQuery("SELECT u FROM UserBO u WHERE u.userId = :id")
				.setParameter("id", userBO.getUserId()).uniqueResult();
	}

	@Override
	public UserBO getUserByUserName(UserBO userBO) {
		return (UserBO) getSession().createQuery("SELECT u FROM UserBO u WHERE u.username=:username")
				.setParameter("username", userBO.getUsername()).uniqueResult();
	}

	@Override
	public void insert(UserBO userBO) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(UserBO userBO) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(UserBO userBO) {
		// TODO Auto-generated method stub

	}

	@Override
	public UserBO checkLogin(UserBO userBO) {
		return (UserBO) getSession()
				.createQuery("SELECT u FROM UserBO u WHERE u.username=:username,u.password=:password")
				.setParameter("username", userBO.getUsername()).setParameter("password", userBO.getPassword())
				.uniqueResult();
	}


}
