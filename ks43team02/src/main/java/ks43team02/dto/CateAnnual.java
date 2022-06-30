package ks43team02.dto;

public class CateAnnual {
	private String cateAnnualCode;
	private String cpRepresentativeCode;
	private String superAdminId;
	private String annualDivision;
	private String cpName;
	private String regDate;
	
	public String getCateAnnualCode() {
		return cateAnnualCode;
	}

	public void setCateAnnualCode(String cateAnnualCode) {
		this.cateAnnualCode = cateAnnualCode;
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

	public String getAnnualDivision() {
		return annualDivision;
	}

	public void setAnnualDivision(String annualDivision) {
		this.annualDivision = annualDivision;
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
		return "CateAnnual [cateAnnualCode=" + cateAnnualCode + ", cpRepresentativeCode=" + cpRepresentativeCode
				+ ", superAdminId=" + superAdminId + ", annualDivision=" + annualDivision + ", cpName=" + cpName
				+ ", regDate=" + regDate + "]";
	}
	
	
	
}
