package com.test.portal.login.validator;

import java.util.Map;

import com.test.portal.exception.ApplicationException;
import com.test.portal.login.bean.UserBean;

public class LoginValidator implements ILoginValidator {

	public boolean validateCaptcha(String userId, String captcha) {
		return false;
	}

	public Map<String, Object> validateSession(UserBean userbean, Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

}
