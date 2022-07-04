package ks43team02.dto;

import java.time.LocalDateTime;

public class FileDto {
	private String attachFileCode;
	private String attachFileOriginalName;
	private String attachFileNewName;
	private String attachFilePath;
	private Long attachFileSize;
	private LocalDateTime regDate;
	
	public String getAttachFileCode() {
		return attachFileCode;
	}
	public void setAttachFileCode(String attachFileCode) {
		this.attachFileCode = attachFileCode;
	}

	/*
	 * public String getCpRepresentiveCode() { return cpRepresentiveCode; } public
	 * void setCpRepresentiveCode(String cpRepresentiveCode) {
	 * this.cpRepresentiveCode = cpRepresentiveCode; } public String
	 * getSuperAdminId() { return superAdminId; } public void setSuperAdminId(String
	 * superAdminId) { this.superAdminId = superAdminId; }
	 */
	public String getAttachFileOriginalName() {
		return attachFileOriginalName;
	}
	public void setAttachFileOriginalName(String attachFileOriginalName) {
		this.attachFileOriginalName = attachFileOriginalName;
	}
	public String getAttachFileNewName() {
		return attachFileNewName;
	}
	public void setAttachFileNewName(String attachFileNewName) {
		this.attachFileNewName = attachFileNewName;
	}
	public String getAttachFilePath() {
		return attachFilePath;
	}
	public void setAttachFilePath(String attachFilePath) {
		this.attachFilePath = attachFilePath;
	}
	public Long getAttachFileSize() {
		return attachFileSize;
	}
	public void setAttachFileSize(Long attachFileSize) {
		this.attachFileSize = attachFileSize;
	}
	public LocalDateTime getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "File [attachFileCode=" + attachFileCode + ", cpRepresentiveCode=" /* + cpRepresentiveCode */
				+ ", superAdminId=" /* + superAdminId */ + ", attachFileOriginalName=" + attachFileOriginalName
				+ ", attachFileNewName=" + attachFileNewName + ", attachFilePath=" + attachFilePath  
				+ ", attachFileSize=" + attachFileSize + ", regDate=" + regDate + "]";
	}
	
	
}
