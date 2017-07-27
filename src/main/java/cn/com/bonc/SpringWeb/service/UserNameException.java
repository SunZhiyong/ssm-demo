/*
 * 文件名：UserNameException.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：用户名异常类
 * 修改人：zhiyong
 * 修改时间：2017年7月11日
 */

package cn.com.bonc.SpringWeb.service;
/**
 * 
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author zhiyong
 * @version 2017年7月11日
 * @see UserNameException
 * @since
 */
public class UserNameException extends RuntimeException
{
    /**
     * 用户已存在异常
     */
    private static final long serialVersionUID = -3133256839393261540L;

    public UserNameException() {
    }

    public UserNameException(String message) {
        super(message);
    }

    public UserNameException(Throwable cause) {
        super(cause);
    }

    public UserNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
