package com.study.service;

import java.util.List;

import com.study.entities.UserBO;

public interface IUserService {
	public List<UserBO> getAll();

	public List<UserBO> search(UserBO user, Integer page);

	public UserBO getUserById(UserBO user);

	public UserBO getUserByUserName(UserBO user);

	public void insert(UserBO user);

	public void delete(UserBO user);

	public void update(UserBO user);

	public UserBO checkLogin(UserBO userBO);
}
