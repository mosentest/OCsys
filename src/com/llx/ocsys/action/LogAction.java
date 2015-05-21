package com.llx.ocsys.action;

public class LogAction extends BaseAction {
	
	public String login() throws Exception {
		try {
			
			
			return SUCCESS;
		} catch (Exception login_Error) {
			login_Error.printStackTrace();
			return ERROR;
		}
	}
	
	public String logout() throws Exception {
		try {
			return SUCCESS;
		} catch (Exception logout_Error) {
			logout_Error.printStackTrace();
			return ERROR;
		}
	}
	
}
