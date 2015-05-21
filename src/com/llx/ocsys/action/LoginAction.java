package com.llx.ocsys.action;


import java.util.Enumeration;

import com.llx.ocsys.DTO.LoginDTO;

@SuppressWarnings("serial")
public class LoginAction extends BaseAction {

	private LoginDTO loginDTO;

	public LoginDTO getLoginDTO() {
		return loginDTO;
	}

	public void setLoginDTO(LoginDTO loginDTO) {
		this.loginDTO = loginDTO;
	}

	public String loginMethod() {
		//获取验证码
		String code = (String)pullSession("SESSION_SECURITY_CODE");
		//检查用户和密码是否存在
		boolean checkUser = checkUser(loginDTO.getNumber(), loginDTO.getUsername(), loginDTO.getPassword());
		if (code.equals(loginDTO.getCode()) && checkUser) {
			//把用户名放在session中
			pushSession("username", loginDTO.getUsername());
			return "success";
		}
		return "error";
	}
	
	public void validateLoginMethod() {
		if (loginDTO != null) {
			if (loginDTO.getNumber() == null || loginDTO.getNumber().trim().length() < 6) {
				this.addFieldError("number", "工号长度不能少于6位");
			}
			if (loginDTO.getUsername() == null || loginDTO.getUsername().trim().length() < 6) {
				this.addFieldError("username", "账号长度不能少于6位");
			}
			if (loginDTO.getPassword() == null || loginDTO.getPassword().trim().length() < 6) {
				this.addFieldError("password", "密码长度不能少于6位");
			}
			if (loginDTO.getCode() == null || "".equals(loginDTO.getCode().trim())) {
				this.addFieldError("code", "验证码为空");
			}
		}
	}

	
	private boolean checkUser(String number, String username, String password) {
		//TODO 自己补充代码
		return true;
	}

	public String logoutMethod() {
		//把session中的所有东西都清空
		Enumeration<String> attributeNames = getHttpSession().getAttributeNames();
		while(attributeNames.hasMoreElements()){
			String nextElement = attributeNames.nextElement();
			getHttpSession().removeAttribute(nextElement);
		}
		return "success";
	}
	
}