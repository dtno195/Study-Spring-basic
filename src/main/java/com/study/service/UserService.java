package com.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.study.entities.UserBO;
import com.study.repository.IUserDAO;

@Service("userService")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class UserService implements IUserService {
	@Autowired
	IUserDAO userDAO;


	public List<UserBO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	public List<UserBO> search(UserBO user, Integer page) {
		// TODO Auto-generated method stub
		return null;
	}


	public UserBO getUserById(UserBO user) {
		// TODO Auto-generated method stub
		return null;
	}


	public UserBO getUserByUserName(UserBO user) {
		// TODO Auto-generated method stub
		return null;
	}


	public void insert(UserBO user) {
		// TODO Auto-generated method stub

	}

	public void delete(UserBO user) {
		// TODO Auto-generated method stub

	}


	public void update(UserBO user) {
		// TODO Auto-generated method stub

	}


	public UserBO checkLogin(UserBO userBO) {

		return userDAO.checkLogin(userBO);
	}

}
