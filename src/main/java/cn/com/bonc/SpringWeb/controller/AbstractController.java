/*
 * 文件名：AbstractController.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月11日
 */

package cn.com.bonc.SpringWeb.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.bonc.SpringWeb.util.JsonResult;

public class AbstractController
{
    /**
     * 在其他控制器方法执行出现异常时候, 执行
     * 异常处理方法 handleException
     */
    @ExceptionHandler
    @ResponseBody
    public JsonResult handlerException(Exception e)
    {
    	e.printStackTrace();
    	return new JsonResult(e);
    }

}