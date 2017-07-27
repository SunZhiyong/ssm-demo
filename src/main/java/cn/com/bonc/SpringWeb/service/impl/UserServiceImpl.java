package cn.com.bonc.SpringWeb.service.impl;

import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.sun.org.apache.xalan.internal.xsltc.dom.SAXImpl.NamespaceWildcardIterator;

import cn.com.bonc.SpringWeb.dao.UserDao;
import cn.com.bonc.SpringWeb.entity.User;
import cn.com.bonc.SpringWeb.service.PasswordException;
import cn.com.bonc.SpringWeb.service.UserNameException;
import cn.com.bonc.SpringWeb.service.UserNotFoundException;
import cn.com.bonc.SpringWeb.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
    @Value("#{config.salt}")
    private String salt;
    
    @Resource 
	private UserDao userDao;
	/**
	 * 登陆功能
	 */
	public User login(String name, String password) throws UserNotFoundException, PasswordException {
		
		if(name==null || name.trim().isEmpty()){
			throw new UserNotFoundException("用户名不得为空！");
		}
		if(password==null || password.trim().isEmpty()){
			throw new PasswordException("密码不得为空！");
		}
		User user = userDao.findUserByName(name.trim());
		if(user == null){
			throw new UserNotFoundException("用户名错误！");
		}
		String salt = "Day Day Up!";
		String pwd = DigestUtils.md5Hex(password + salt);
		if(user.getPassword().equals(pwd)){
			return user;//登陆成功
		}
		throw new PasswordException("密码错误！");
	}
	
	public User regist(String name, 
	                   String nick, String password, 
	                   String confirm)
	                   throws UserNameException, PasswordException {
	               //检查userName, 用户名不能重复
	               if(name==null || name.trim().isEmpty()){
	                   throw new UserNameException("用户名不得为空！");
	               }
	               User one = userDao.findUserByName(name);
	               if(one!=null){
	                   throw new UserNameException("该用户已注册！");
	               }
	               //检查用户密码
	               if(password==null || password.trim().isEmpty()){
	                   throw new PasswordException("密码不得为空!");
	               }
	               if(! password.equals(confirm)){
	                   throw new PasswordException("确认密码不一致!");
	               }
	               //检查nick
	               if(nick ==null || nick.trim().isEmpty()){
	                   nick = name;
	               }
	               String id = UUID.randomUUID().toString();
	               String token = "";
	        
	               password = DigestUtils.md5Hex(password.trim()+salt);
	               User user = new User(
	                       id, name, password, 
	                       token, nick);
	               int n = userDao.addUser(user);
	               if(n!=1){
	                   throw new RuntimeException("用户注册失败!");
	               }
	               return user;
	           }
	
}
