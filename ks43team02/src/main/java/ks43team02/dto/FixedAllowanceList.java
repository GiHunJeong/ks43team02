package ks43team02.dto;

public class FixedAllowanceList {
	
	private String fixedAllowCode;
	private String fixedAllowName;
	private String fixedAllowAmount;
	private String fixedAllowContents;
	
	public String getFixedAllowCode() {
		return fixedAllowCode;
	}
	public void setFixedAllowCode(String fixedAllowCode) {
		this.fixedAllowCode = fixedAllowCode;
	}
	public String getFixedAllowName() {
		return fixedAllowName;
	}
	public void setFixedAllowName(String fixedAllowName) {
		this.fixedAllowName = fixedAllowName;
	}
	public String getFixedAllowAmount() {
		return fixedAllowAmount;
	}
	public void setFixedAllowAmount(String fixedAllowAmount) {
		this.fixedAllowAmount = fixedAllowAmount;
	}
	public String getFixedAllowContents() {
		return fixedAllowContents;
	}
	public void setFixedAllowContents(String fixedAllowContents) {
		this.fixedAllowContents = fixedAllowContents;
	}
	
	@Override
	public String toString() {
		return "FixedAllowanceList [fixedAllowCode=" + fixedAllowCode + ", fixedAllowName=" + fixedAllowName
				+ ", fixedAllowAmount=" + fixedAllowAmount + ", fixedAllowContents=" + fixedAllowContents + "]";
	}
	
}
