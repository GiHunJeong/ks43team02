package ks43team02.dto;

public class OrganizationSList {
	private String organizationCodeS;
	private String cpRepresentativeCode;
	private String superAdminId;
	private String organizationCodeL;
	private String organizationCodeM;
	private String organizationNameL;
	private String organizationNameM;
	private String organizationNameS;
	private String cpName;
	private String regDate;
	OrganizationLList organizationLList;
	OrganizationMList organizationMList;
	
	public OrganizationLList getOrganizationLList() {
		return organizationLList;
	}
	public void setOrganizationLList(OrganizationLList organizationLList) {
		this.organizationLList = organizationLList;
	}
	public OrganizationMList getOrganizationMList() {
		return organizationMList;
	}
	public void setOrganizationMList(OrganizationMList organizationMList) {
		this.organizationMList = organizationMList;
	}
	public String getOrganizationCodeS() {
		return organizationCodeS;
	}
	public void setOrganizationCodeS(String organizationCodeS) {
		this.organizationCodeS = organizationCodeS;
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
	public String getOrganizationCodeM() {
		return organizationCodeM;
	}
	public void setOrganizationCodeM(String organizationCodeM) {
		this.organizationCodeM = organizationCodeM;
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
	public String getOrganizationNameS() {
		return organizationNameS;
	}
	public void setOrganizationNameS(String organizationNameS) {
		this.organizationNameS = organizationNameS;
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
		return "OrganizationSList [organizationCodeS=" + organizationCodeS + ", cpRepresentativeCode="
				+ cpRepresentativeCode + ", superAdminId=" + superAdminId + ", organizationCodeL=" + organizationCodeL
				+ ", organizationCodeM=" + organizationCodeM + ", organizationNameL=" + organizationNameL
				+ ", organizationNameM=" + organizationNameM + ", organizationNameS=" + organizationNameS + ", cpName="
				+ cpName + ", regDate=" + regDate + ", organizationLList=" + organizationLList + ", organizationMList="
				+ organizationMList + "]";
	}
	
}