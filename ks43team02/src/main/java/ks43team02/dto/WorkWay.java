package ks43team02.dto;

public class WorkWay {
	private String workwayCode;
	private String workwayName;
	private String regDate;
	
	@Override
	public String toString() {
		return "WorkWay [workwayCode=" + workwayCode 
				+ ", workwayName=" + workwayName + ", regDate=" + regDate + "]";
	}
	public String getWorkwayCode() {
		return workwayCode;
	}
	public void setWorkwayCode(String workwayCode) {
		this.workwayCode = workwayCode;
	}
	
	public String getWorkwayName() {
		return workwayName;
	}
	public void setWorkwayName(String workwayName) {
		this.workwayName = workwayName;
	}
	public WorkWay(String workwayCode, String workwayName, String regDate) {
		this.workwayCode = workwayCode;
		this.workwayName = workwayName;
		this.regDate = regDate;
	}
}
