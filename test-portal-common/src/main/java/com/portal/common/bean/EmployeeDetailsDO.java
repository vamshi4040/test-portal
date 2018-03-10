package com.portal.common.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_DTLS")
public class EmployeeDetailsDO implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPLOYEE_DTLS")
	@SequenceGenerator(name = "EMPLOYEE_DTLS", sequenceName = "EMPLOYEE_DTLS_SQ", allocationSize = 1)
	@Column(name = "EMPLOYEE_DTLS_ID")
	private Long employeeDtlsId;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "MIDDLE_NAME")
	private String middleName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "MOBILE_NO")
	private String mobilNo;

	@Column(name = "PHONE_NO")
	private String phoneNo;

	@Column(name = "EMAIL_ID")
	private String emailId;

	@Column(name = "DOB")
	private String dateOfBirth;
	
	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CREATED_DT")
	private Date createdDt;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_DT")
	private Date modifiedDt;
	
	@ManyToOne
	@JoinColumn(name="PARENT_DTLS_ID")
	private ParentDetailsDO parentDetailsDO;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getEmployeeDtlsId() {
		return employeeDtlsId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMobilNo() {
		return mobilNo;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public Date getCreatedDt() {
		return createdDt;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public Date getModifiedDt() {
		return modifiedDt;
	}

	public void setEmployeeDtlsId(Long employeeDtlsId) {
		this.employeeDtlsId = employeeDtlsId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMobilNo(String mobilNo) {
		this.mobilNo = mobilNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public void setModifiedDt(Date modifiedDt) {
		this.modifiedDt = modifiedDt;
	}

	public ParentDetailsDO getParentDetailsDO() {
		return parentDetailsDO;
	}

	public void setParentDetailsDO(ParentDetailsDO parentDetailsDO) {
		this.parentDetailsDO = parentDetailsDO;
	}
}
