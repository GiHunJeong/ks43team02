package ks43team02.dto;

import java.time.LocalDateTime;
import java.util.List;

public class DepartmentBoard {
	private String departmentPostCode;
	private String cpRepresentativeCode;
	private String superAdminId;
	private String departmentIdx;
	private String departmentCate;
	private String regUserName;
	private String postTitle;
	private String postContents;
	private LocalDateTime regDate;
	private LocalDateTime modifiedDate;
	private LocalDateTime delDate;
	private int ViewCnt;
	private DepartmentBoardCate boardCate;
	private List<FileDto> file;
	
	public String getDepartmentPostCode() {
		return departmentPostCode;
	}
	public void setDepartmentPostCode(String departmentPostCode) {
		this.departmentPostCode = departmentPostCode;
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
	public String getDepartmentIdx() {
		return departmentIdx;
	}
	public void setDepartmentIdx(String departmentIdx) {
		this.departmentIdx = departmentIdx;
	}
	public String getDepartmentCate() {
		return departmentCate;
	}
	public void setDepartmentCate(String departmentCate) {
		this.departmentCate = departmentCate;
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
		return ViewCnt;
	}
	public void setViewCnt(int ViewCnt) {
		this.ViewCnt = ViewCnt;
	}
	public DepartmentBoardCate getDepartmentBoardCate() {
		return boardCate;
	}
	public void setDepartmentBoardCate(DepartmentBoardCate boardCate) {
		this.boardCate = boardCate;
	}
	public DepartmentBoardCate getBoardCate() {
		return boardCate;
	}
	public void setBoardCate(DepartmentBoardCate boardCate) {
		this.boardCate = boardCate;
	}
	public List<FileDto> getFile() {
		return file;
	}
	public void setFile(List<FileDto> file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "DepartmentBoard [departmentPostCode=" + departmentPostCode + ", cpRepresentativeCode="
				+ cpRepresentativeCode + ", superAdminId=" + superAdminId + ", departmentIdx=" + departmentIdx
				+ ", departmentCate=" + departmentCate + ", regUserName=" + regUserName + ", postTitle=" + postTitle
				+ ", postContents=" + postContents + ", regDate=" + regDate + ", modifiedDate=" + modifiedDate
				+ ", delDate=" + delDate + ", ViewCnt=" + ViewCnt + ", boardCate=" + boardCate + ", file=" + file + "]";
	}
	
}
