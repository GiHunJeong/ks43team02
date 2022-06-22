package ks43team02.dto;

public class OrganizationLList {
	private String organizationCodeL;
	private String cpRepresentativeCode;
	private String superAdminId;
	private String organizationNameL;
	private String cpName;
	private String regDate;
	public String getOrganizationCodeL() {
		return organizationCodeL;
	}
	public void setOrganizationCodeL(String organizationCodeL) {
		this.organizationCodeL = organizationCodeL;
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
	public String getOrganizationNameL() {
		return organizationNameL;
	}
	public void setOrganizationNameL(String organizationNameL) {
		this.organizationNameL = organizationNameL;
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
		return "OrganizationLList [organizationCodeL=" + organizationCodeL + ", cpRepresentativeCode="
				+ cpRepresentativeCode + ", superAdminId=" + superAdminId + ", organizationNameL=" + organizationNameL
				+ ", cpName=" + cpName + ", regDate=" + regDate + "]";
	}
	
}
