package ks43team02.dto;

public class Emply {
	
    private String emplyId;
	private String emplyPw;
    private String emplyNumber;
    private String emplyOrganization;
	private String emplyRank;
    private String emplyName;
    private String emplyBirth;
    private String salary;
	private String emplyAccount;
    private String emplyAddr;
    private String emplymentDate;
    private String emplymentType;
    private boolean retireStatus;
    
	public String getEmplyId() {
		return emplyId;
	}
	public void setEmplyId(String emplyId) {
		this.emplyId = emplyId;
	}
	public String getEmplyPw() {
		return emplyPw;
	}
	public void setEmplyPw(String emplyPw) {
		this.emplyPw = emplyPw;
	}
	public String getEmplyNumber() {
		return emplyNumber;
	}
	public void setEmplyNumber(String emplyNumber) {
		this.emplyNumber = emplyNumber;
	}
	public String getEmplyOrganization() {
		return emplyOrganization;
	}
	public void setEmplyOrganization(String emplyOrganization) {
		this.emplyOrganization = emplyOrganization;
	}
	public String getEmplyRank() {
		return emplyRank;
	}
	public void setEmplyRank(String emplyRank) {
		this.emplyRank = emplyRank;
	}
	public String getEmplyName() {
		return emplyName;
	}
	public void setEmplyName(String emplyName) {
		this.emplyName = emplyName;
	}
	public String getEmplyBirth() {
		return emplyBirth;
	}
	public void setEmplyBirth(String emplyBirth) {
		this.emplyBirth = emplyBirth;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getEmplyAccount() {
		return emplyAccount;
	}
	public void setEmplyAccount(String emplyAccount) {
		this.emplyAccount = emplyAccount;
	}
	public String getEmplyAddr() {
		return emplyAddr;
	}
	public void setEmplyAddr(String emplyAddr) {
		this.emplyAddr = emplyAddr;
	}
	public String getEmplymentDate() {
		return emplymentDate;
	}
	public void setEmplymentDate(String emplymentDate) {
		this.emplymentDate = emplymentDate;
	}
	public String getEmplymentType() {
		return emplymentType;
	}
	public void setEmplymentType(String emplymentType) {
		this.emplymentType = emplymentType;
	}
	public boolean getRetireStatus() {
		return retireStatus;
	}
	public void setRetireStatus(boolean retireStatus) {
		this.retireStatus = retireStatus;
	}
	
	@Override
	public String toString() {
		return "Emply [emplyId=" + emplyId + ", emplyPw=" + emplyPw + ", emplyNumber=" + emplyNumber
				+ ", emplyOrganization=" + emplyOrganization + ", emplyRank=" + emplyRank + ", emplyName=" + emplyName
				+ ", emplyBirth=" + emplyBirth + ", salary=" + salary + ", emplyAccount=" + emplyAccount
				+ ", emplyAddr=" + emplyAddr + ", emplymentDate=" + emplymentDate + ", emplymentType=" + emplymentType
				+ ", retireStatus=" + retireStatus + "]";
	}
}
