package ks43team02.dto;

public class TimeDto {
	private String worktimeCumulativeCode;
	private String cpRepresentativeCode;
	private String standardWorksystemCpCode;
	private String workwayCode;
	private String emplyId;
	private String emplyName;
	private String workDate;
	private String workStartTime;
	private String workEndTime;
	private String workBreakTime;
	private String returnTime;
	private String statusLate;
	
	@Override
	public String toString() {
		return "WorkTime [worktimeCumulativeCode=" + worktimeCumulativeCode + ", cpRepresentativeCode="
				+ cpRepresentativeCode + ", standardWorksystemCpCode=" + standardWorksystemCpCode + ", workwayCode="
				+ workwayCode + ", emplyId=" + emplyId + ", emplyName=" + emplyName + ", workDate=" + workDate
				+ ", workStartTime=" + workStartTime + ", workEndTime=" + workEndTime + ", workBreakTime="
				+ workBreakTime + ", returnTime=" + returnTime + ", statusLate=" + statusLate + "]";
	}
	public String getWorktimeCumulativeCode() {
		return worktimeCumulativeCode;
	}
	public void setWorktimeCumulativeCode(String worktimeCumulativeCode) {
		this.worktimeCumulativeCode = worktimeCumulativeCode;
	}
	public String getCpRepresentativeCode() {
		return cpRepresentativeCode;
	}
	public void setCpRepresentativeCode(String cpRepresentativeCode) {
		this.cpRepresentativeCode = cpRepresentativeCode;
	}
	public String getStandardWorksystemCpCode() {
		return standardWorksystemCpCode;
	}
	public void setStandardWorksystemCpCode(String standardWorksystemCpCode) {
		this.standardWorksystemCpCode = standardWorksystemCpCode;
	}
	public String getWorkwayCode() {
		return workwayCode;
	}
	public void setWorkwayCode(String workwayCode) {
		this.workwayCode = workwayCode;
	}
	public String getEmplyId() {
		return emplyId;
	}
	public void setEmplyId(String emplyId) {
		this.emplyId = emplyId;
	}
	public String getEmplyName() {
		return emplyName;
	}
	public void setEmplyName(String emplyName) {
		this.emplyName = emplyName;
	}
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public String getWorkStartTime() {
		return workStartTime;
	}
	public void setWorkStartTime(String workStartTime) {
		this.workStartTime = workStartTime;
	}
	public String getWorkEndTime() {
		return workEndTime;
	}
	public void setWorkEndTime(String workEndTime) {
		this.workEndTime = workEndTime;
	}
	public String getWorkBreakTime() {
		return workBreakTime;
	}
	public void setWorkBreakTime(String workBreakTime) {
		this.workBreakTime = workBreakTime;
	}
	public String getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}
	public String getStatusLate() {
		return statusLate;
	}
	public void setStatusLate(String statusLate) {
		this.statusLate = statusLate;
	}
	
}
