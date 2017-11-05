package com.test.portal.login.validator;

import java.util.Map;

import com.test.portal.login.bean.UserBean;

public interface ILoginValidator {
	
	public boolean validateCaptcha(String userId,String captcha);

	public Map<String, Object> validateSession(UserBean userbean, Map<String, Object> map);

}
