package com.test.portal.login.services;

import com.test.portal.login.bean.AclUserDO;
import com.test.portal.login.bean.UserBean;

public interface ILoginService {

	AclUserDO getUserDetails(UserBean userbean);

}
