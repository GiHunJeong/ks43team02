package ks43team02.service;

public class workDto {
	private String startTime;
	private String endTime;
	private String breakTime;
	private String returnTime;
	@Override
	public String toString() {
		return "workDto [startTime=" + startTime + ", endTime=" + endTime + ", breakTime=" + breakTime + ", returnTime="
				+ returnTime + "]";
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getBreakTime() {
		return breakTime;
	}
	public void setBreakTime(String breakTime) {
		this.breakTime = breakTime;
	}
	public String getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}
}
