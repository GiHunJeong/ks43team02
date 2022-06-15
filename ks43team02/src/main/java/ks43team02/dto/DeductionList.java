package ks43team02.dto;

public class DeductionList {

	private String deductionCode;
	private String deductionName;
	private String deductionamount;
	private String deductioncontents;
	
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
	public String getDeductionamount() {
		return deductionamount;
	}
	public void setDeductionamount(String deductionamount) {
		this.deductionamount = deductionamount;
	}
	public String getDeductioncontents() {
		return deductioncontents;
	}
	public void setDeductioncontents(String deductioncontents) {
		this.deductioncontents = deductioncontents;
	}
	
	@Override
	public String toString() {
		return "DeductionList [deductionCode=" + deductionCode + ", deductionName=" + deductionName
				+ ", deductionamount=" + deductionamount + ", deductioncontents=" + deductioncontents + "]";
	}
	
}
