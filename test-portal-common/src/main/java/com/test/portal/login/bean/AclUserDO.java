package com.test.portal.login.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "ACL_USER")
public class AclUserDO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	/*@SequenceGenerator(name = "ACL_USER", sequenceName = "ACL_USER_SQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACL_USER")*/
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "USER_ID")
	private Integer userId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "PWD")
	private String password;

	@Column(name = "IS_ACTIVE")
	private Character isActive;

	@Column(name = "LAST_LOGIN_DATE_TIME")
	private Date lastLoginDateTime;

	@Column(name = "NO_UNSUCCESSFUL_LOGIN_ATMPT")
	private Integer noUnsuccessfulLoginAtmpt;

	@Column(name = "LAST_UNSUCCESSFUL_LOGIN_ATMPT")
	private Date lastUnsuccessfulLoginAtmt;

	@Column(name = "COMPANY_ID")
	private Integer companyId;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CREATED_DT")
	private Date createdDt;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_DT")
	private Date modifiedDt;
	
	//@Column(name = "IS_ACCOUNT_LOCKED")
	@Transient
	private Character isAccountLocked;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Character getIsActive() {
		return isActive;
	}

	public void setIsActive(Character isActive) {
		this.isActive = isActive;
	}

	public Date getLastLoginDateTime() {
		return lastLoginDateTime;
	}

	public void setLastLoginDateTime(Date lastLoginDateTime) {
		this.lastLoginDateTime = lastLoginDateTime;
	}

	public Integer getNoUnsuccessfulLoginAtmpt() {
		return noUnsuccessfulLoginAtmpt;
	}

	public void setNoUnsuccessfulLoginAtmpt(Integer noUnsuccessfulLoginAtmpt) {
		this.noUnsuccessfulLoginAtmpt = noUnsuccessfulLoginAtmpt;
	}

	public Date getLastUnsuccessfulLoginAtmt() {
		return lastUnsuccessfulLoginAtmt;
	}

	public void setLastUnsuccessfulLoginAtmt(Date lastUnsuccessfulLoginAtmt) {
		this.lastUnsuccessfulLoginAtmt = lastUnsuccessfulLoginAtmt;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDt() {
		return modifiedDt;
	}

	public void setModifiedDt(Date modifiedDt) {
		this.modifiedDt = modifiedDt;
	}

	public Character getIsAccountLocked() {
		return isAccountLocked;
	}

	public void setIsAccountLocked(Character isAccountLocked) {
		this.isAccountLocked = isAccountLocked;
	}

}
