package ks43team02.dto;

public class OrganizationMList {
	private String organizationCodeM;
	private String cpRepresentativeCode;
	private String superAdminId;
	private String organizationCodeL;
	private String organizationNameL;
	private String organizationNameM;
	private String cpName;
	private String regDate;
	OrganizationLList organizationLList;
	
	public OrganizationLList getOrganizationLList() {
		return organizationLList;
	}
	public void setOrganizationLList(OrganizationLList organizationLList) {
		this.organizationLList = organizationLList;
	}
	public String getOrganizationCodeM() {
		return organizationCodeM;
	}
	public void setOrganizationCodeM(String organizationCodeM) {
		this.organizationCodeM = organizationCodeM;
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
	public String getOrganizationCodeL() {
		return organizationCodeL;
	}
	public void setOrganizationCodeL(String organizationCodeL) {
		this.organizationCodeL = organizationCodeL;
	}
	public String getOrganizationNameL() {
		return organizationNameL;
	}
	public void setOrganizationNameL(String organizationNameL) {
		this.organizationNameL = organizationNameL;
	}
	public String getOrganizationNameM() {
		return organizationNameM;
	}
	public void setOrganizationNameM(String organizationNameM) {
		this.organizationNameM = organizationNameM;
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
		return "OrganizationMList [organizationCodeM=" + organizationCodeM + ", cpRepresentativeCode="
				+ cpRepresentativeCode + ", superAdminId=" + superAdminId + ", organizationCodeL=" + organizationCodeL
				+ ", organizationNameL=" + organizationNameL + ", organizationNameM=" + organizationNameM + ", cpName="
				+ cpName + ", regDate=" + regDate + ", organizationLList=" + organizationLList + "]";
	}
	
}
