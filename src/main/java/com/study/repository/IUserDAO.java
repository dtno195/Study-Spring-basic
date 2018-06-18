package com.study.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.study.entities.UserBO;


public interface IUserDAO {
	public UserBO loadUserByUsername(String username);

	public List<UserBO> getAll();

	public List<UserBO> search(UserBO userBO, Integer page);

	public UserBO getUserById(UserBO userBO);

	public UserBO getUserByUserName(UserBO userBO);

	public void insert(UserBO userBO);

	public void update(UserBO userBO);

	public void delete(UserBO userBO);
	
	public UserBO checkLogin(UserBO userBO);
}
