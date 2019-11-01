package com.yxf.backstage.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.yxf.backstage.dao.UsersDao;
import com.yxf.backstage.domain.Users;
import com.yxf.backstage.service.UsersService;
import com.yxf.backstage.utils.DateUtils;

/**
 * 接口实现层
 * @author win
 */
@Service
public class UsersServiceImpl implements UsersService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UsersServiceImpl.class);
	
	@Autowired
	private UsersDao usersDao;
	
	@Override
	public int longin(String name, String password) {

		Users user = usersDao.loginUser(name, password);
		if(!StringUtils.isEmpty(user)) {
			return 1;
		}else {
			return 0;
		}
	}

	@Override
	public Users findUserByName(String name) {
		return usersDao.findUserByName(name);
	}

	@Override
	public List<Users> findAllUser() {
		return usersDao.findAllUser();
	}

	@Override
	public void insertUser(Users users) {
		usersDao.insertUser(users.getUserName(), users.getPassword(), users.getPhone(), users.getTel(), DateUtils.getStringDate(), users.getCreateBy(), null,users.getUpdateBy());
	}

	@Override
	public void updateUser(String name, String phone, String tel, Long id) {
		usersDao.updateUser(name, phone, tel, id);
	}

	@Override
	public void deleteUser(Long id) {
		usersDao.deleteUser(id);
	}
	
}
