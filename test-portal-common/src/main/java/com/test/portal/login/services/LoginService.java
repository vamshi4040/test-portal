package com.test.portal.login.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.portal.exception.ApplicationException;
import com.test.portal.login.bean.AclUserDO;
import com.test.portal.login.bean.UserBean;
import com.test.portal.login.dao.ILoginDao;
@Service
@Transactional
public class LoginService implements ILoginService{

	@Autowired
	private ILoginDao loginDao;

	public AclUserDO getUserDetails(UserBean userbean) {
		try {
			 return loginDao.getUserDetails(userbean);
		} catch (ApplicationException e) {
			throw new ApplicationException();
		}
	}
}
