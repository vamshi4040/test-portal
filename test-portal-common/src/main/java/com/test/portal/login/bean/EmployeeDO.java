package com.test.portal.login.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MST_EMPLOYEE")
public class EmployeeDO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "EMPLOYEE_ID")
	private Integer employeeId;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "MIDDLE_NAME")
	private String middleName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "DOB")
	private Date dateOfBirth;

	@Column(name = "MARTIAL_STATUS")
	private String martialStatus;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "EMPLOYMENT_TYPE")
	private String employmentType;

	@Column(name = "PERSONAL_EMAIL")
	private String personalEmail;

	@Column(name = "OFFICIAL_EMAIL")
	private String officalEmail;

	@Column(name = "MOBILE_NO_1")
	private Integer mobileNo1;

	@Column(name = "MOBILE_NO_2")
	private Integer mobileNo2;

	@Column(name = "TELEPHONE_NO")
	private Integer telephoneNo;

	@Column(name = "IS_ACTIVE")
	private Character isActive;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CREATED_DT")
	private Date createdDt;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_DT")
	private Date modifiedDt;
	
	@OneToOne
	@JoinColumn(name = "DESIGNATION_ID")
	private DesignationMstrDO designationmstDo;

	/*@OneToOne
	@JoinColumn(name = "LOGGEDIN_LOCATION_ID")
	private Integer loggedinLocationId;*/

	/*@ManyToOne
	@JoinColumn(name = "COMPANY_ID")
	private CompanyMstrDO companyMstrDO;*/

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMartialStatus() {
		return martialStatus;
	}

	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public String getPersonalEmail() {
		return personalEmail;
	}

	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}

	public String getOfficalEmail() {
		return officalEmail;
	}

	public void setOfficalEmail(String officalEmail) {
		this.officalEmail = officalEmail;
	}

	public Integer getMobileNo1() {
		return mobileNo1;
	}

	public void setMobileNo1(Integer mobileNo1) {
		this.mobileNo1 = mobileNo1;
	}

	public Integer getMobileNo2() {
		return mobileNo2;
	}

	public void setMobileNo2(Integer mobileNo2) {
		this.mobileNo2 = mobileNo2;
	}

	public Integer getTelephoneNo() {
		return telephoneNo;
	}

	public void setTelephoneNo(Integer telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	public Character getIsActive() {
		return isActive;
	}

	public void setIsActive(Character isActive) {
		this.isActive = isActive;
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

	public DesignationMstrDO getDesignationmstDo() {
		return designationmstDo;
	}

	public void setDesignationmstDo(DesignationMstrDO designationmstDo) {
		this.designationmstDo = designationmstDo;
	}

	/*public CompanyMstrDO getCompanyMstrDO() {
		return companyMstrDO;
	}

	public void setCompanyMstrDO(CompanyMstrDO companyMstrDO) {
		this.companyMstrDO = companyMstrDO;
	}
*/
	 

}
