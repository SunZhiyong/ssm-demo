package cn.com.bonc.SpringWeb.util;

import java.io.Serializable;

public class JsonResult implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8208824995747984409L;
	public static final int SUCCESS = 0;
	public static final int ERROR = 1;
	
	private int state;
	private Object data;
	private String message;
	
	public JsonResult() {
	}
	
	public JsonResult(Object data) {
		state = SUCCESS;
		this.data = data;
		message = "";
	}
	/**
	 * 返回错误的JSON消息
	 * @param e
	 */
	public JsonResult(Throwable e) {
		state = ERROR;
		this.data = "";
		message=e.getMessage();
	}

	public JsonResult(int state, Throwable e) {
		this.state = state;
		this.data = "";
		message=e.getMessage();
	}
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "JsonResult [state=" + state + ", data=" + data + ", message=" + message + "]";
	}
	
	
}
