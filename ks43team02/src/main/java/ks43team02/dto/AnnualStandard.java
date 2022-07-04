package ks43team02.dto;

public class AnnualStandard {
	private String annualStandardCode;
	private String cpRepresentativeCode;
	private String superAdminId;
	private int year;
	private int annualGetDay;
	
	public String getAnnualStandardCode() {
		return annualStandardCode;
	}


	public void setAnnualStandardCode(String annualStandardCode) {
		this.annualStandardCode = annualStandardCode;
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


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getAnnualGetDay() {
		return annualGetDay;
	}


	public void setAnnualGetDay(int annualGetDay) {
		this.annualGetDay = annualGetDay;
	}


	@Override
	public String toString() {
		return "AnnualStandard [annualStandardCode=" + annualStandardCode + ", cpRepresentativeCode="
				+ cpRepresentativeCode + ", superAdminId=" + superAdminId + ", year=" + year + ", annualGetDay="
				+ annualGetDay + "]";
	}

}
