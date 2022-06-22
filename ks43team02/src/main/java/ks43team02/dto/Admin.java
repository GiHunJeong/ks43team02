package ks43team02.dto;

public class Admin {
	private String superAdminId;
	private String cpRepresentativeCode;
	private String superAdminPw;
	private String cpDomain;
	private String specifiedDomainAddress;
	private String regDate;
	private CpRepresentative cpRepresentative;
	
	public CpRepresentative getCpRepresentative() {
		return cpRepresentative;
	}
	public void setCpRepresentative(CpRepresentative cpRepresentative) {
		this.cpRepresentative = cpRepresentative;
	}
	public String getSuperAdminId() {
		return superAdminId;
	}
	public void setSuperAdminId(String superAdminId) {
		this.superAdminId = superAdminId;
	}
	public String getCpRepresentativeCode() {
		return cpRepresentativeCode;
	}
	public void setCpRepresentativeCode(String cpRepresentativeCode) {
		this.cpRepresentativeCode = cpRepresentativeCode;
	}
	public String getSuperAdminPw() {
		return superAdminPw;
	}
	public void setSuperAdminPw(String superAdminPw) {
		this.superAdminPw = superAdminPw;
	}
	public String getCpDomain() {
		return cpDomain;
	}
	public void setCpDomain(String cpDomain) {
		this.cpDomain = cpDomain;
	}
	public String getSpecifiedDomainAddress() {
		return specifiedDomainAddress;
	}
	public void setSpecifiedDomainAddress(String specifiedDomainAddress) {
		this.specifiedDomainAddress = specifiedDomainAddress;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "Admin [superAdminId=" + superAdminId + ", cpRepresentativeCode=" + cpRepresentativeCode
				+ ", superAdminPw=" + superAdminPw + ", cpDomain=" + cpDomain + ", specifiedDomainAddress="
				+ specifiedDomainAddress + ", regDate=" + regDate + ", cpRepresentative=" + cpRepresentative + "]";
	}
	
}
