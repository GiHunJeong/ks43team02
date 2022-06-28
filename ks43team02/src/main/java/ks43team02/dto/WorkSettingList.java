package ks43team02.dto;

public class WorkSettingList {
	private String standardWorksystemCpCode;
	private String cpRepresentativeCode;
	private String superAdminId;
	private String standardWorkCode;
	private String workStartTime;
	private String workEndTime;
	private String breakTime;
	private String cpName;
	private String regDate;
	
	
	public String getStandardWorksystemCpCode() {
		return standardWorksystemCpCode;
	}
	public void setStandardWorksystemCpCode(String standardWorksystemCpCode) {
		this.standardWorksystemCpCode = standardWorksystemCpCode;
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
	public String getStandardWorkCode() {
		return standardWorkCode;
	}
	public void setStandardWorkCode(String standardWorkCode) {
		this.standardWorkCode = standardWorkCode;
	}
	public String getWorkStartTime() {
		return workStartTime;
	}
	public void setWorkStartTime(String workStartTime) {
		this.workStartTime = workStartTime;
	}
	public String getWorkEndTime() {
		return workEndTime;
	}
	public void setWorkEndTime(String workEndTime) {
		this.workEndTime = workEndTime;
	}
	public String getBreakTime() {
		return breakTime;
	}
	public void setBreakTime(String breakTime) {
		this.breakTime = breakTime;
	}
	public String getCpName() {
		return cpName;
	}
	public void setCpName(String cpName) {
		this.cpName = cpName;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "WorkSettingList [standardWorksystemCpCode=" + standardWorksystemCpCode + ", cpRepresentativeCode="
				+ cpRepresentativeCode + ", superAdminId=" + superAdminId + ", standardWorkCode=" + standardWorkCode
				+ ", workStartTime=" + workStartTime + ", workEndTime=" + workEndTime + ", breakTime=" + breakTime
				+ ", cpName=" + cpName + ", regDate=" + regDate + "]";
	}
}
