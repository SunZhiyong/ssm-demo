package cn.com.bonc.SpringWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.bonc.SpringWeb.entity.User;
import cn.com.bonc.SpringWeb.service.PasswordException;
import cn.com.bonc.SpringWeb.service.UserNotFoundException;
import cn.com.bonc.SpringWeb.service.UserService;
import cn.com.bonc.SpringWeb.util.JsonResult;

/**
 * 
 * 用户控制器类
 * @author zhiyong
 * @version 2017年7月11日
 * @see UserController
 * @since
 */
@Controller
@RequestMapping("/user")
public class UserController extends AbstractController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	@ResponseBody
	public Object login(String name, String password){
		User user = userService.login(name, password);
		return new JsonResult(user);
		
	}
	
	@ExceptionHandler(UserNotFoundException.class)
    @ResponseBody
    public JsonResult handleUserNotFound(UserNotFoundException e){
        e.printStackTrace();
        return new JsonResult(2, e);//state = 2
    }
    
    @ExceptionHandler(PasswordException.class)
    @ResponseBody
    public JsonResult handlePassword(PasswordException e){
        e.printStackTrace();
        return new JsonResult(3, e);//state = 3
    }
	
	@RequestMapping("/regist.do")
	@ResponseBody
	public JsonResult regist(String name, String nick, String password, String confirm){
	    User user = userService.regist( name, nick, password, confirm);
	    return new JsonResult(user);
	}
}
