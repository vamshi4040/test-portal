package com.test.portal.login.dao;

import com.test.portal.login.bean.AclUserDO;
import com.test.portal.login.bean.EmployeeDO;
import com.test.portal.login.bean.UserBean;

public interface ILoginDao {

	AclUserDO getUserDetails(UserBean userbean);

	int saveEmployeeRegistrationDetails(EmployeeDO employee);

}
