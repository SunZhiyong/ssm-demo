package cn.com.bonc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.bonc.SpringWeb.dao.UserDao;
import cn.com.bonc.SpringWeb.entity.User;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("conf/spring-mybatis.xml");
		
		UserDao dao = ctx.getBean("userDao",UserDao.class);
		
		User user = dao.findUserByName("’≈—©∑Â");
		System.out.println(user);
 
	}

}
