package com.test.portal.login.controller;

import java.util.HashMap;
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
import com.test.portal.login.bean.Parameters;
import com.test.portal.login.bean.UserBean;
import com.test.portal.login.services.ILoginService;

@RestController
public class LoginController {

	@Autowired
	private ILoginService loginService;

	// @Autowired
	// private ILoginValidator loginValidator;

	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
	public Map<String, Object> userLogin(HttpServletRequest request, @RequestBody UserBean userbean) {
		Map<String, Object> map = new HashMap<String, Object>();
		HttpSession session = request.getSession(false);
		try {
			AclUserDO aclUserDO = loginService.getUserDetails(userbean);
			map.put("user", aclUserDO);

		} catch (ApplicationException e) {
			throw new ApplicationException();
		}
		return map;
	}

	@RequestMapping(value = "/registratin", method = RequestMethod.POST, produces = "application/json")
	public Map<String, Object> saveEmployeeRegistrationDetails(@RequestBody Parameters Parameters) {
		int status = 0;
		Map<String, Object> response = null;
		try {
			response = new HashMap<String, Object>();
			status = loginService.saveEmployeeRegistrationDetails(Parameters);
			response.put("message", status);
		} catch (ApplicationException e) {
			throw new ApplicationException();
		}

		return response;
	}

}
