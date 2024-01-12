package com.QueCode.RequestComponents;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class InquiryRequest {

	private String name;

	private String email;

	private String gender;

	private String mobileNo;

	private Date expectedJoinDate;

	private Integer status;
	private String remark;
	private Integer orgId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Date getExpectedJoinDate() {
		return expectedJoinDate;
	}
	public void setExpectedJoinDate(Date expectedJoinDate) {
		this.expectedJoinDate = expectedJoinDate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	 
	 
}
