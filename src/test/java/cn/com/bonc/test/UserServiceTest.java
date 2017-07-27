package cn.com.bonc.test;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import cn.com.bonc.SpringWeb.dao.UserDao;
import cn.com.bonc.SpringWeb.entity.User;
import cn.com.bonc.SpringWeb.service.UserService;

public class UserServiceTest extends BaseTest{
	UserService service;
	
	@Before
	public void initService(){
	    service = ctx.getBean("userService",UserService.class);
	}
	@Test
	public void testLogin(){
		String name="Andy";
		//String password="123456";
		String password = DigestUtils.md5Hex("123456");
		
		User user = service.login(name, password);
		System.out.println(user);
		
	}
	
	@Test
	public void testRegist(){
	    User user = service.regist( "Andy", "Andy", "123456", "123456");
	    System.out.println(user); 
	}
}
