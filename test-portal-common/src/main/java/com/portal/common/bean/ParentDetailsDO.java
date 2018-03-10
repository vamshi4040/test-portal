package com.portal.common.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PARENT_DTLS")
public class ParentDetailsDO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PARENT_DTLS")
	@SequenceGenerator(name = "PARENT_DTLS", sequenceName = "PARENT_DTLS_SQ", allocationSize = 1)
	@Column(name = "PARENT_DTLS_ID")
	private Long parentDtlsId;

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
	
	@Column(name = "OCCUPATION")
	private String occupation;

	
	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CREATED_DT")
	private Date createdDt;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_DT")
	private Date modifiedDt;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getParentDtlsId() {
		return parentDtlsId;
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

	public String getOccupation() {
		return occupation;
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

	public void setParentDtlsId(Long parentDtlsId) {
		this.parentDtlsId = parentDtlsId;
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

	public void setOccupation(String occupation) {
		this.occupation = occupation;
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
}
