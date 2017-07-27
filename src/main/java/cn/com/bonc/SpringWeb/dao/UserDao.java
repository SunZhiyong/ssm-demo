package cn.com.bonc.SpringWeb.dao;

import cn.com.bonc.SpringWeb.entity.User;

public interface UserDao {
	User findUserByName(String name);
	int addUser(User user);
	int countUserById(String userId);
}
