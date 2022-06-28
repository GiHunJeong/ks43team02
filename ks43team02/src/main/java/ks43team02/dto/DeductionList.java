package ks43team02.dto;

public class DeductionList {

	private String deductionCode;
	private String deductionName;
	private String deductionAmount;
	private String deductionContents;
	
	public String getDeductionCode() {
		return deductionCode;
	}
	public void setDeductionCode(String deductionCode) {
		this.deductionCode = deductionCode;
	}
	public String getDeductionName() {
		return deductionName;
	}
	public void setDeductionName(String deductionName) {
		this.deductionName = deductionName;
	}
	public String getDeductionAmount() {
		return deductionAmount;
	}
	public void setDeductionAmount(String deductionAmount) {
		this.deductionAmount = deductionAmount;
	}
	public String getDeductionContents() {
		return deductionContents;
	}
	public void setDeductionContents(String deductionContents) {
		this.deductionContents = deductionContents;
	}
	
	@Override
	public String toString() {
		return "DeductionList [deductionCode=" + deductionCode + ", deductionName=" + deductionName
				+ ", deductionAmount=" + deductionAmount + ", deductionContents=" + deductionContents + "]";
	}
	
}
