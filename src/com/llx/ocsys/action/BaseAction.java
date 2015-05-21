package com.llx.ocsys.action;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Action基类
 * @author Administrator
 *
 */
public class BaseAction extends ActionSupport implements ServletRequestAware  {
	private HttpServletRequest request;

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletRequest getRequest() {
		return request;
	}
	/**
	 * 推數據入request
	 * @param tpye
	 * @param object
	 */
	public void pushRequest(String tpye,Object object){
		getRequest().setAttribute(tpye, object);
	}
	
	/**
	 * 推數據入Sesion
	 * @param type
	 * @param object
	 */
	public void pushSession(String type,Object object){
		getHttpSession().setAttribute(type, object);
	}

	/**
	 * 拉數據來自session
	 * @param type
	 * @return
	 */
	public Object pullSession(String type){
		return getHttpSession().getAttribute(type);
		
	}
	/**
	 * 獲取session
	 * @return
	 */
	public HttpSession getHttpSession(){
		return getRequest().getSession();
	}
	
	public static Timestamp getThisMoment() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(currentTime);
		Timestamp result = Timestamp.valueOf(dateString);
		return result;
	}
	
//	public static Timestamp getToday() {
//		Date currentTime = new Date();
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//		String dateString = formatter.format(currentTime);
//		Timestamp result = Timestamp.valueOf(dateString);
//		return result;
//	}
}
