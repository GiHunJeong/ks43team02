package ks43team02.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class NoticeBoard {
	private String cpNoticeCode;
	private String cpRepresentiveCode;
	private String superAdminId;
	private String noticeTitle;
	private String noticeContents;
	private String regUserName;
	private LocalDateTime regDate;
	private LocalDateTime modifiedDate;
	private LocalDateTime delDate;
	private int viewCnt;
	
	private ArrayList<FileDto> file;
	
	public String getCpNoticeCode() {	
		return cpNoticeCode;
	}
	public void setCpNoticeCode(String cpNoticeCode) {
		this.cpNoticeCode = cpNoticeCode;
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
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeContents() {
		return noticeContents;
	}
	public void setNoticeContents(String noticeContents) {
		this.noticeContents = noticeContents;
	}
	public String getRegUserName() {
		return regUserName;
	}
	public void setRegUserName(String regUserName) {
		this.regUserName = regUserName;
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
		return "board [cpNoticeCode=" + cpNoticeCode + ", cpRepresentiveCode=" + cpRepresentiveCode + ", superAdminId="
				+ superAdminId + ", noticeTitle=" + noticeTitle + ", noticeContents=" + noticeContents
				+ ", regUserName=" + regUserName + ", regDate=" + regDate + ", modifiedDate=" + modifiedDate
				+ ", delDate=" + delDate + ", viewCnt=" + viewCnt + "]";
	}
	public ArrayList<FileDto> getFile() {
		return file;
	}
	public void setFile(ArrayList<FileDto> file) {
		this.file = file;
	}
	
}