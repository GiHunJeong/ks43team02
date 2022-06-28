package ks43team02.dto;

public class CpRepresentative {
	private String cpRepresentativeCode;
	private String cpDepositStatusCode;
	private String cpUniquemplyNumber;
	private String cpName;
	private String cpRepresentativemplyName;
	private String cpTel;
	private String cpRegistrationNumber;
	private String cpAddr;
	private String superSwManager;
	private String regDate;
	public String getCpRepresentativeCode() {
		return cpRepresentativeCode;
	}
	public void setCpRepresentativeCode(String cpRepresentativeCode) {
		this.cpRepresentativeCode = cpRepresentativeCode;
	}
	public String getCpDepositStatusCode() {
		return cpDepositStatusCode;
	}
	public void setCpDepositStatusCode(String cpDepositStatusCode) {
		this.cpDepositStatusCode = cpDepositStatusCode;
	}
	public String getCpUniquemplyNumber() {
		return cpUniquemplyNumber;
	}
	public void setCpUniquemplyNumber(String cpUniquemplyNumber) {
		this.cpUniquemplyNumber = cpUniquemplyNumber;
	}
	public String getCpName() {
		return cpName;
	}
	public void setCpName(String cpName) {
		this.cpName = cpName;
	}
	public String getCpRepresentativemplyName() {
		return cpRepresentativemplyName;
	}
	public void setCpRepresentativemplyName(String cpRepresentativemplyName) {
		this.cpRepresentativemplyName = cpRepresentativemplyName;
	}
	public String getCpTel() {
		return cpTel;
	}
	public void setCpTel(String cpTel) {
		this.cpTel = cpTel;
	}
	public String getCpRegistrationNumber() {
		return cpRegistrationNumber;
	}
	public void setCpRegistrationNumber(String cpRegistrationNumber) {
		this.cpRegistrationNumber = cpRegistrationNumber;
	}
	public String getCpAddr() {
		return cpAddr;
	}
	public void setCpAddr(String cpAddr) {
		this.cpAddr = cpAddr;
	}
	public String getSuperSwManager() {
		return superSwManager;
	}
	public void setSuperSwManager(String superSwManager) {
		this.superSwManager = superSwManager;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "CpRepresentative [cpRepresentativeCode=" + cpRepresentativeCode + ", cpDepositStatusCode="
				+ cpDepositStatusCode + ", cpUniquemplyNumber=" + cpUniquemplyNumber + ", cpName=" + cpName
				+ ", cpRepresentativemplyName=" + cpRepresentativemplyName + ", cpTel=" + cpTel
				+ ", cpRegistrationNumber=" + cpRegistrationNumber + ", cpAddr=" + cpAddr + ", superSwManager="
				+ superSwManager + ", regDate=" + regDate + "]";
	}
	
}
