package com.test.portal.login.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.portal.exception.ApplicationException;
import com.test.portal.login.bean.AclUserDO;
import com.test.portal.login.bean.UserBean;
import com.test.portal.login.services.ILoginService;
import com.test.portal.login.validator.ILoginValidator;

@RestController
public class LoginController {

	@Autowired
	private ILoginService loginService;

	//@Autowired
	//private ILoginValidator loginValidator;

	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
	public Map<String, Object> userLogin(HttpServletRequest request, @RequestBody UserBean userbean) {
		Map<String, Object> map = null;
		HttpSession session = request.getSession(false);
		try {
			AclUserDO aclUserDO = loginService.getUserDetails(userbean);
			map.put("user", aclUserDO);
			
		} catch (ApplicationException e) {
			throw new ApplicationException();
		}
		return map;
	}

}
