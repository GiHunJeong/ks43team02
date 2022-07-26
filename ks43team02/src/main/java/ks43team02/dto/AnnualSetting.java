package ks43team02.dto;

public class AnnualSetting {
	private String annualSettingCode;
	private String cpRepresentativeCode;
	private String superAdminId;
	private String annualStandardCode;
	private String emplyId;
	private String year;
	private String cpName;
	private String regDate;
	
	private CateAnnual cateAnnual;
	
	private AnnualStandard annualStandard;

	public String getAnnualSettingCode() {
		return annualSettingCode;
	}

	public void setAnnualSettingCode(String annualSettingCode) {
		this.annualSettingCode = annualSettingCode;
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

	public String getAnnualStandardCode() {
		return annualStandardCode;
	}

	public void setAnnualStandardCode(String annualStandardCode) {
		this.annualStandardCode = annualStandardCode;
	}

	public String getEmplyId() {
		return emplyId;
	}

	public void setEmplyId(String emplyId) {
		this.emplyId = emplyId;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
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

	public CateAnnual getCateAnnual() {
		return cateAnnual;
	}

	public void setCateAnnual(CateAnnual cateAnnual) {
		this.cateAnnual = cateAnnual;
	}

	public AnnualStandard getAnnualStandard() {
		return annualStandard;
	}

	public void setAnnualStandard(AnnualStandard annualStandard) {
		this.annualStandard = annualStandard;
	}

	@Override
	public String toString() {
		return "AnnualSetting [annualSettingCode=" + annualSettingCode + ", cpRepresentativeCode="
				+ cpRepresentativeCode + ", superAdminId=" + superAdminId + ", annualStandardCode=" + annualStandardCode
				+ ", emplyId=" + emplyId + ", year=" + year + ", cpName=" + cpName + ", regDate=" + regDate
				+ ", cateAnnual=" + cateAnnual + ", annualStandard=" + annualStandard + "]";
	}
	
}
