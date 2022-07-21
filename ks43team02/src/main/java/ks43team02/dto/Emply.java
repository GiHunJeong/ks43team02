package ks43team02.dto;

public class Emply {
	private String emplyId;
	private String organizationCodeS;
	private String rankLevelCode;
	private String positionLevelCode;
	private String cpRepresentativeCode;
	private String superAdminId;
	private String emplyPw;
	private String emplyNumber;
	private String emplyName;
	private String emplyBirth;
	private String emplyAccount;
	private String emplySalary;
	private String emplyHomeAddress;
	private String emplyHomeAddressDetail;
	private String emplyHomeAddressZip;
	private String emplyProfilePic;
	private String emplymentDate;
	private String emplymentType;
	private boolean retireStatus;
	private String cpName;
	private String regDate;
	private RankLevelList rankLevelList;
	private PositionLevelList positionLevelList;
	private OrganizationSList organizationSList;
	
	public String getEmplyId() {
		return emplyId;
	}
	public void setEmplyId(String emplyId) {
		this.emplyId = emplyId;
	}
	public String getOrganizationCodeS() {
		return organizationCodeS;
	}
	public void setOrganizationCodeS(String organizationCodeS) {
		this.organizationCodeS = organizationCodeS;
	}
	public String getRankLevelCode() {
		return rankLevelCode;
	}
	public void setRankLevelCode(String rankLevelCode) {
		this.rankLevelCode = rankLevelCode;
	}
	public String getPositionLevelCode() {
		return positionLevelCode;
	}
	public void setPositionLevelCode(String positionLevelCode) {
		this.positionLevelCode = positionLevelCode;
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
	public String getEmplyAccount() {
		return emplyAccount;
	}
	public void setEmplyAccount(String emplyAccount) {
		this.emplyAccount = emplyAccount;
	}
	public String getEmplySalary() {
		return emplySalary;
	}
	public void setEmplySalary(String emplySalary) {
		this.emplySalary = emplySalary;
	}
	public String getEmplyHomeAddress() {
		return emplyHomeAddress;
	}
	public void setEmplyHomeAddress(String emplyHomeAddress) {
		this.emplyHomeAddress = emplyHomeAddress;
	}
	public String getEmplyHomeAddressDetail() {
		return emplyHomeAddressDetail;
	}
	public void setEmplyHomeAddressDetail(String emplyHomeAddressDetail) {
		this.emplyHomeAddressDetail = emplyHomeAddressDetail;
	}
	public String getEmplyHomeAddressZip() {
		return emplyHomeAddressZip;
	}
	public void setEmplyHomeAddressZip(String emplyHomeAddressZip) {
		this.emplyHomeAddressZip = emplyHomeAddressZip;
	}
	public String getEmplyProfilePic() {
		return emplyProfilePic;
	}
	public void setEmplyProfilePic(String emplyProfilePic) {
		this.emplyProfilePic = emplyProfilePic;
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
	public boolean isRetireStatus() {
		return retireStatus;
	}
	public void setRetireStatus(boolean retireStatus) {
		this.retireStatus = retireStatus;
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
	public RankLevelList getRankLevelList() {
		return rankLevelList;
	}
	public void setRankLevelList(RankLevelList rankLevelList) {
		this.rankLevelList = rankLevelList;
	}
	public PositionLevelList getPositionLevelList() {
		return positionLevelList;
	}
	public void setPositionLevelList(PositionLevelList positionLevelList) {
		this.positionLevelList = positionLevelList;
	}
	public OrganizationSList getOrganizationSList() {
		return organizationSList;
	}
	public void setOrganizationSList(OrganizationSList organizationSList) {
		this.organizationSList = organizationSList;
	}
	
	@Override
	public String toString() {
		return "Emply [emplyId=" + emplyId + ", organizationCodeS=" + organizationCodeS + ", rankLevelCode="
				+ rankLevelCode + ", positionLevelCode=" + positionLevelCode + ", cpRepresentativeCode="
				+ cpRepresentativeCode + ", superAdminId=" + superAdminId + ", emplyPw=" + emplyPw + ", emplyNumber="
				+ emplyNumber + ", emplyName=" + emplyName + ", emplyBirth=" + emplyBirth + ", emplyAccount="
				+ emplyAccount + ", emplySalary=" + emplySalary + ", emplyHomeAddress=" + emplyHomeAddress
				+ ", emplyHomeAddressDetail=" + emplyHomeAddressDetail + ", emplyHomeAddressZip=" + emplyHomeAddressZip
				+ ", emplyProfilePic=" + emplyProfilePic + ", emplymentDate=" + emplymentDate + ", emplymentType="
				+ emplymentType + ", retireStatus=" + retireStatus + ", cpName=" + cpName + ", regDate=" + regDate
				+ ", rankLevelList=" + rankLevelList + ", positionLevelList=" + positionLevelList
				+ ", organizationSList=" + organizationSList + "]";
	}
	
}
