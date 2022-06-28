package ks43team02.dto;

import java.time.LocalDateTime;

public class board {
	public Long cpNoticeCode;
	public String noticeTitle;
	public String noticeContents;
	public String regUserName;
	public LocalDateTime regDate;
	public LocalDateTime modifiedDate;
	public LocalDateTime delDate;
	public int viewCnt;
	public Long getCpNoticeCode() {
		return cpNoticeCode;
	}
	public void setCpNoticeCode(Long cpNoticeCode) {
		this.cpNoticeCode = cpNoticeCode;
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
		return "board [cpNoticeCode=" + cpNoticeCode + ", noticeTitle=" + noticeTitle + ", noticeContents="
				+ noticeContents + ", regUserName=" + regUserName + ", regDate=" + regDate + ", modifiedDate="
				+ modifiedDate + ", delDate=" + delDate + ", viewCnt=" + viewCnt + "]";
	}	
}
