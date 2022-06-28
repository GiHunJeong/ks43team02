package ks43team02.dto;

public class WorkSetting {
	private String standardWorkCode;
	private String worksystemName;
	private String regUser;
	private String regDate;
	public String getStandardWorkCode() {
		return standardWorkCode;
	}
	public void setStandardWorkCode(String standardWorkCode) {
		this.standardWorkCode = standardWorkCode;
	}
	public String getWorksystemName() {
		return worksystemName;
	}
	public void setWorksystemName(String worksystemName) {
		this.worksystemName = worksystemName;
	}
	public String getRegUser() {
		return regUser;
	}
	public void setRegUser(String regUser) {
		this.regUser = regUser;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "WorkSetting [standardWorkCode=" + standardWorkCode + ", worksystemName=" + worksystemName + ", regUser="
				+ regUser + ", regDate=" + regDate + "]";
	}
	
	
}
