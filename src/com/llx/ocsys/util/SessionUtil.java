package com.llx.ocsys.util;

import javax.servlet.http.HttpSession;

public class SessionUtil {
	public static Object pullSession(HttpSession httpSession,String type){
		Object attribute = httpSession.getAttribute(type);
		return attribute;
	}
}
