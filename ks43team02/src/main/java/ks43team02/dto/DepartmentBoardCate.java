package ks43team02.dto;

import java.time.LocalDateTime;

public class DepartmentBoardCate {
	private String departmentCateCode;
	private String cpRepresentiveCode;
	private String superAdminId;
	private String boardCate;
	private LocalDateTime regDate;
	public String getDepartmentCateCode() {
		return departmentCateCode;
	}
	public void setDepartmentCateCode(String departmentCateCode) {
		this.departmentCateCode = departmentCateCode;
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
	public String getBoardCate() {
		return boardCate;
	}
	public void setBoardCate(String boardCate) {
		this.boardCate = boardCate;
	}
	public LocalDateTime getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "DepartmentBoardCate [departmentCateCode=" + departmentCateCode + ", cpRepresentiveCode="
				+ cpRepresentiveCode + ", superAdminId=" + superAdminId + ", boardCate=" + boardCate + ", regDate="
				+ regDate + "]";
	}

}
