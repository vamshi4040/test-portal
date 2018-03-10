package com.portal.common.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DTLS")
public class UserDetailsDO implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="USER_DTLS")
	@SequenceGenerator(name = "USER_DTLS", sequenceName="USER_DTLS_SQ",allocationSize=1)
	@Column(name ="USER_DTLS_ID")
	private Long userDtlsId;
	
	@Column(name ="USER_NAME")
	private String userName;
	
	
	@Column(name ="PASSWORD")
	private String password;
	
	@Column(name ="IS_EMPLOYEE")
	private char isEmployee;
	
	@Column(name ="IS_SESSION_ENABLED")
	private char isSessionEnabled;
	
	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CREATED_DT")
	private Date createdDt;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_DT")
	private Date modifiedDt;

	public Long getUserDtlsId() {
		return userDtlsId;
	}

	public void setUserDtlsId(Long userDtlsId) {
		this.userDtlsId = userDtlsId;
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

	public char getIsEmployee() {
		return isEmployee;
	}

	public void setIsEmployee(char isEmployee) {
		this.isEmployee = isEmployee;
	}

	public char getIsSessionEnabled() {
		return isSessionEnabled;
	}

	public void setIsSessionEnabled(char isSessionEnabled) {
		this.isSessionEnabled = isSessionEnabled;
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

}
