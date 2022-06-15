package ks43team02.dto;

public class annualDto {
	private String annualDivision;
	private String startDate;
	private String endDate;
	private String regDate;
	private String comment;
	
	
	@Override
	public String toString() {
		return "annualDto [annualDivision=" + annualDivision + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", regDate=" + regDate + ", comment=" + comment + "]";
	}
	
	public String getAnnualDivision() {
		return annualDivision;
	}
	public void setAnnualDivision(String annualDivision) {
		this.annualDivision = annualDivision;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
