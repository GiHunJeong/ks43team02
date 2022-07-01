package ks43team02.dto;

public class WorkWayList {
	private String workwayCode;
	private String cpRepresentativeCode;
	private String superAdminId;
	private String workwayName;
	private String cpName;
	private String regDate;
	@Override
	public String toString() {
		return "WorkWayList [workwayCode=" + workwayCode + ", cpRepresentativeCode=" + cpRepresentativeCode
				+ ", superAdminId=" + superAdminId + ", workwayName=" + workwayName + ", cpName=" + cpName
				+ ", regDate=" + regDate + "]";
	}
	public String getWorkwayCode() {
		return workwayCode;
	}
	public void setWorkwayCode(String workwayCode) {
		this.workwayCode = workwayCode;
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
	public String getWorkwayName() {
		return workwayName;
	}
	public void setWorkwayName(String workwayName) {
		this.workwayName = workwayName;
	}
	public String getCpName() {
		return cpName;
	}
	public void setCpName(String cpName) {
		this.cpName = cpName;
	}
}
