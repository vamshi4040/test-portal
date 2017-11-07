package com.test.portal.login.services;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.portal.exception.ApplicationException;
import com.test.portal.login.bean.AclUserDO;
import com.test.portal.login.bean.EmployeeDO;
import com.test.portal.login.bean.Parameters;
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

	public int saveEmployeeRegistrationDetails(Parameters parameters) {
		int status = 0;
		EmployeeDO employeeObj  = null;
		try {
			employeeObj = new EmployeeDO();
			employeeObj.setFirstName(parameters.getFirstName());
			employeeObj.setMiddleName(parameters.getMiddleName());
			employeeObj.setLastName(parameters.getLastName());
			employeeObj.setMartialStatus(parameters.getMartialStatus());
			employeeObj.setDateOfBirth(parameters.getDateOfBirth());
			employeeObj.setGender(parameters.getGender());
			employeeObj.setIsActive(parameters.getIsActive());
			employeeObj.setEmploymentType(parameters.getEmploymentType());
			employeeObj.setMobileNo1(parameters.getMobileNo1());
			employeeObj.setMobileNo2(parameters.getMobileNo2());
			employeeObj.setPersonalEmail(parameters.getPersonalEmail());
			employeeObj.setOfficalEmail(parameters.getOfficalEmail());
			employeeObj.setTelephoneNo(parameters.getTelephoneNo());
			employeeObj.setCreatedBy(parameters.getCreatedBy());
			employeeObj.setCreatedDt(new Date());
			employeeObj.setModifiedBy(parameters.getModifiedBy());
			employeeObj.setModifiedDt(new Date());
			employeeObj.setCompanyMstrDO(parameters.getCompanyId());
			employeeObj.setDesignationmstDo(parameters.getDesignationmstDo());
			status =loginDao.saveEmployeeRegistrationDetails(employeeObj);
		} catch (ApplicationException e) {
			throw new ApplicationException();
		}
		return status;
	}
}
