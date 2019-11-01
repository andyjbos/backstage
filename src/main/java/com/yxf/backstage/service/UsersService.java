package com.yxf.backstage.service;

import java.util.List;

import com.yxf.backstage.domain.Users;

/**
 * 接口层
 * 
 * @author win
 */
public interface UsersService {
	/**
	 * 通过名字,密码查询用户信息
	 */
	int longin(String name, String password);

	/**
	 * 通过名字查询用户信息
	 */
	Users findUserByName(String name);

	/**
	 * 查询所有用户信息
	 */
	List<Users> findAllUser();

	/**
	 * 插入用户信息
	 */
	void insertUser(Users users);

	/**
	 * 根据 id 更新用户信息
	 */
	void updateUser(String name, String phone, String tel, Long id);

	/**
	 * 根据 id 删除用户信息
	 */
	void deleteUser(Long id);
}
