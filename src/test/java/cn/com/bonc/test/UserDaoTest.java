package cn.com.bonc.test;

import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Before;
import org.junit.Test;

import cn.com.bonc.SpringWeb.dao.UserDao;
import cn.com.bonc.SpringWeb.entity.User;

public class UserDaoTest extends BaseTest {
	
	UserDao dao;
	
	@Before
	public void initDao(){
	    dao =ctx.getBean("userDao",UserDao.class);
	}
	
	@Test
	public void testFindUserByName(){
		User user = dao.findUserByName("demo");
		System.out.println(user);
	}
	
	@Test
	public void testAddUser(){
	    String id = UUID.randomUUID().toString();
	    String name = "sunshine";
	    String password = "123321";
	    String token = "";
	    String nick = "Mice";
	    
	    String salt = "Day Day Up!";
	    String pwd = DigestUtils.md5Hex(password+salt);
	    User user = new User(id, name, pwd, token, nick);
	    int n = dao.addUser(user);
	    System.out.println(pwd); 
	}
}
