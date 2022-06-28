package ks43team02.dto;

import java.time.LocalDateTime;

public class DepartmentBoard {
	private int departmentPostCode;
	private String cpRepresentiveCode;
	private String superAdminId;
	private String departmentCate;
	private String emplyId;
	private String regUserName;
	private String postTitle;
	private String postContents;
	private LocalDateTime regDate;
	private LocalDateTime modifiedDate;
	private LocalDateTime delDate;
	private int viewCnt;
	public int getDepartmentPostCode() {
		return departmentPostCode;
	}
	public void setDepartmentPostCode(int departmentPostCode) {
		this.departmentPostCode = departmentPostCode;
	}
	public String getCpRepresentiveCode() {
		return cpRepresentiveCode;
	}
	public void setCpRepresentiveCode(String cpRepresentiveCode) {
		this.cpRepresentiveCode = cpRepresentiveCode;
	}
	public String getSuperAdminId() {
		return superAdminId;
	}
	public void setSuperAdminId(String superAdminId) {
		this.superAdminId = superAdminId;
	}
	public String getDepartmentCate() {
		return departmentCate;
	}
	public void setDepartmentCate(String departmentCate) {
		this.departmentCate = departmentCate;
	}
	public String getEmplyId() {
		return emplyId;
	}
	public void setEmplyId(String emplyId) {
		this.emplyId = emplyId;
	}
	public String getRegUserName() {
		return regUserName;
	}
	public void setRegUserName(String regUserName) {
		this.regUserName = regUserName;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getPostContents() {
		return postContents;
	}
	public void setPostContents(String postContents) {
		this.postContents = postContents;
	}
	public LocalDateTime getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}
	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public LocalDateTime getDelDate() {
		return delDate;
	}
	public void setDelDate(LocalDateTime delDate) {
		this.delDate = delDate;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	@Override
	public String toString() {
		return "DepartmentBoard [departmentPostCode=" + departmentPostCode + ", cpRepresentiveCode="
				+ cpRepresentiveCode + ", superAdminId=" + superAdminId + ", departmentCate=" + departmentCate
				+ ", emplyId=" + emplyId + ", regUserName=" + regUserName + ", postTitle=" + postTitle
				+ ", postContents=" + postContents + ", regDate=" + regDate + ", modifiedDate=" + modifiedDate
				+ ", delDate=" + delDate + ", viewCnt=" + viewCnt + "]";
	}
	
}
