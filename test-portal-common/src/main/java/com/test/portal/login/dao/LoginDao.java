package com.test.portal.login.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.portal.exception.ApplicationException;
import com.test.portal.login.bean.AclUserDO;
import com.test.portal.login.bean.EmployeeDO;
import com.test.portal.login.bean.UserBean;

@Repository
public class LoginDao implements ILoginDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public AclUserDO getUserDetails(UserBean userbean) {
		Session session = sessionFactory.getCurrentSession();
		AclUserDO aclUserDO = null;
		try {
			Criteria cr = session.createCriteria(AclUserDO.class);
			cr.add(Restrictions.eq("userName", userbean.getUserName()));
			aclUserDO = (AclUserDO) cr.uniqueResult();
		} catch (ApplicationException e) {
			throw new ApplicationException();
		}
		return aclUserDO;
	}

	public int saveEmployeeRegistrationDetails(EmployeeDO employee) {
		int status = 0;
		try {
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(employee);
			status = 1;
		} catch (ApplicationException e) {
			status = 0;
			throw new ApplicationException();
		}
		return status;
	}

}
