package ks43team02.dto;

public class WorkSystem {
	private String standardWorkCode;
	private String cpRepresentativeCode;
	private String superAdminId;
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
		return "WorkSystem [standardWorkCode=" + standardWorkCode + ", cpRepresentativeCode=" + cpRepresentativeCode
				+ ", superAdminId=" + superAdminId + ", worksystemName=" + worksystemName + ", regUser=" + regUser
				+ ", regDate=" + regDate + "]";
	}
	
	
}
