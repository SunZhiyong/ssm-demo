package cn.com.bonc.SpringWeb.service;


import cn.com.bonc.SpringWeb.entity.User;
/**
 * UserService类
 * @author zhiyong
 * @version 2017年7月11日
 * @see UserService
 * @since
 */
public interface UserService {
	/**
	 * 
	 * @param name
	 * @param password
	 * @return
	 * @throws UserNotFoundException
	 * @throws PasswordException
	 */
	public User login(String name,String password) 
			throws UserNotFoundException,PasswordException; 
	/**
	 * 用户注册功能
	 * @param name
	 * @param nick
	 * @param password
	 * @param confirm
	 * @return user
	 * @throws UserNameException
	 * @throws PasswordException 
	 * @see
	 */
	User regist(String name, String nick, String password, String confirm)
	    throws UserNameException, PasswordException;
}
