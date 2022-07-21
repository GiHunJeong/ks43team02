package ks43team02.dto;

public class AnnualApplication {
	private String annualApplicationCode;
	private String cpRepresentativeCode;
	private String superAdminId;
	private String cateAnnualCode;
	private String approvalRequestCode;
	private String emplyId;
	private String emplyName;
	private String annualStartDate;
	private String annualEndDate;
	private String useDate;
	private String comment;
	private String attachFileName;
	private String regDate;
	private String groupCode;
	
	private CateAnnual cateAnnual;
	
	public String getAnnualApplicationCode() {
		return annualApplicationCode;
	}

	public void setAnnualApplicationCode(String annualApplicationCode) {
		this.annualApplicationCode = annualApplicationCode;
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

	public String getCateAnnualCode() {
		return cateAnnualCode;
	}

	public void setCateAnnualCode(String cateAnnualCode) {
		this.cateAnnualCode = cateAnnualCode;
	}

	public String getApprovalRequestCode() {
		return approvalRequestCode;
	}

	public void setApprovalRequestCode(String approvalRequestCode) {
		this.approvalRequestCode = approvalRequestCode;
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

	public String getAnnualStartDate() {
		return annualStartDate;
	}

	public void setAnnualStartDate(String annualStartDate) {
		this.annualStartDate = annualStartDate;
	}

	public String getAnnualEndDate() {
		return annualEndDate;
	}

	public void setAnnualEndDate(String annualEndDate) {
		this.annualEndDate = annualEndDate;
	}

	public String getUseDate() {
		return useDate;
	}

	public void setUseDate(String useDate) {
		this.useDate = useDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getAttachFileName() {
		return attachFileName;
	}

	public void setAttachFileName(String attachFileName) {
		this.attachFileName = attachFileName;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public CateAnnual getCateAnnual() {
		return cateAnnual;
	}

	public void setCateAnnual(CateAnnual cateAnnual) {
		this.cateAnnual = cateAnnual;
	}

	@Override
	public String toString() {
		return "AnnualApplication [annualApplicationCode=" + annualApplicationCode + ", cpRepresentativeCode="
				+ cpRepresentativeCode + ", superAdminId=" + superAdminId + ", cateAnnualCode=" + cateAnnualCode
				+ ", approvalRequestCode=" + approvalRequestCode + ", emplyId=" + emplyId + ", emplyName=" + emplyName
				+ ", annualStartDate=" + annualStartDate + ", annualEndDate=" + annualEndDate + ", useDate=" + useDate
				+ ", comment=" + comment + ", attachFileName=" + attachFileName + ", regDate=" + regDate
				+ ", groupCode=" + groupCode + ", cateAnnual=" + cateAnnual + "]";
	}


}
