package ks43team02.dto;

import java.time.LocalDateTime;

public class DepartmentComment {
	private String departmentCommentCode;
	private String cpRepresentativeCode;
	private String superAdminId;
	private String departmentPostCode;
	private String emplyId;
	private String regUserName;
	private String postComment;
	private LocalDateTime regDate;
	
	public String getDepartmentCommentCode() {
		return departmentCommentCode;
	}
	public void setDepartmentCommentCode(String departmentCommentCode) {
		this.departmentCommentCode = departmentCommentCode;
	}
	public String getCpRepresentativeCode() {
		return cpRepresentativeCode;
	}
	public void setCpRepresentativeCode(String cpRepresentativeCode) {
		this.cpRepresentativeCode = cpRepresentativeCode;
	}
	public String getSuperAdminId() {
		return superAdminId;
	}
	public void setSuperAdminId(String superAdminId) {
		this.superAdminId = superAdminId;
	}
	public String getDepartmentPostCode() {
		return departmentPostCode;
	}
	public void setDepartmentPostCode(String departmentPostCode) {
		this.departmentPostCode = departmentPostCode;
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
	public String getPostComment() {
		return postComment;
	}
	public void setPostComment(String departmentComment) {
		this.postComment = departmentComment;
	}
	public LocalDateTime getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "DepartmentComment [departmentCommentCode=" + departmentCommentCode + ", cpRepresentativeCode="
				+ cpRepresentativeCode + ", superAdminId=" + superAdminId + ", departmentPostCode=" + departmentPostCode
				+ ", emplyId=" + emplyId + ", regUserName=" + regUserName + ", postComment=" + postComment 
				+ ", regDate=" + regDate + "]";
	}
	
	
}
