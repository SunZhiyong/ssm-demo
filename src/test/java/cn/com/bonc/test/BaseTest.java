/*
 * 文件名：BaseTest.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月11日
 */

package cn.com.bonc.test;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.bonc.SpringWeb.dao.UserDao;

public abstract class BaseTest
{

    protected ClassPathXmlApplicationContext ctx;


    @Before
    public void initTest()
    {
        ctx = new ClassPathXmlApplicationContext("conf/spring-mybatis.xml",
            "conf/spring-service.xml");
    }

    @After
    public void detroy()
    {
    	ctx.close();
    }

}