package ks43team02.dto;

public class WorkSettingList {
	private String standardWorksystemCpCode;
	private String cpRepresentativeCode;
	private String superAdminId;
	private String standardWorkCode;
	private String workwayCode;
	private String workStartTime;
	private String workEndTime;
	private String breakTime;
	private String cpName;
	private String regDate;
	private String dayCheck;
	
	private WorkSystem workSystem;
	
	private WorkWay workWay;
	
	public WorkSystem getWorkSystem() {
		return workSystem;
	}
	public void setWorkSystem(WorkSystem workSystem) {
		this.workSystem = workSystem;
	}
	public String getWorkwayCode() {
		return workwayCode;
	}
	public void setWorkwayCode(String workwayCode) {
		this.workwayCode = workwayCode;
	}
	public WorkWay getWorkWay() {
		return workWay;
	}
	public void setWorkWay(WorkWay workWay) {
		this.workWay = workWay;
	}
	@Override
	public String toString() {
		return "WorkSettingList [standardWorksystemCpCode=" + standardWorksystemCpCode + ", cpRepresentativeCode="
				+ cpRepresentativeCode + ", superAdminId=" + superAdminId + ", standardWorkCode=" + standardWorkCode
				+ ", workwayCode=" + workwayCode + ", workStartTime=" + workStartTime + ", workEndTime=" + workEndTime
				+ ", breakTime=" + breakTime + ", cpName=" + cpName + ", regDate=" + regDate + ", dayCheck=" + dayCheck
				+ ", workSystem=" + workSystem + ", workWay=" + workWay + "]";
	}
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
	public String getWorkWayCode() {
		return workwayCode;
	}
	public void setWorkWayCode(String workwayCode) {
		this.workwayCode = workwayCode;
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
	public String getDayCheck() {
		return dayCheck;
	}
	public void setDayCheck(String dayCheck) {
		this.dayCheck = dayCheck;
	}
	
	public WorkSettingList(String standardWorksystemCpCode) {
		this.standardWorksystemCpCode = standardWorksystemCpCode;
	}
}