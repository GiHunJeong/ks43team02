package ks43team02.dto;

public class FixedAllowanceList {
	
	private String fixedAllowCode;
	private String fixedAllowName;
	private String fixedAllowamount;
	private String fixedAllowcontents;

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
	public String getFixedAllowamount() {
		return fixedAllowamount;
	}
	public void setFixedAllowamount(String fixedAllowamount) {
		this.fixedAllowamount = fixedAllowamount;
	}
	public String getFixedAllowcontents() {
		return fixedAllowcontents;
	}
	public void setFixedAllowcontents(String fixedAllowcontents) {
		this.fixedAllowcontents = fixedAllowcontents;
	}
	
	@Override
	public String toString() {
		return "FixedAllowanceList [fixedAllowCode=" + fixedAllowCode + ", fixedAllowName=" + fixedAllowName
				+ ", fixedAllowamount=" + fixedAllowamount + ", fixedAllowcontents=" + fixedAllowcontents + "]";
	}
}
