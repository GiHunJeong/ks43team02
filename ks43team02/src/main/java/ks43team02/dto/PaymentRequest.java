package ks43team02.dto;

public class PaymentRequest {
	private String approvalRequestCode;
	private String cpRepresentativeCode;
	private String superAdminId;
	private String emplyId;
	private String documentDivisionManagementSCode;
	private String approvalProgressStep;
	private String totalApprovalStep;
	private String approvalGrogressStatus;
	private String title;
	private String comment;
	private String applicationFormGroupCode;
	private String applicationFormGroupNameCode;
	private String regDate;
	public String getApprovalRequestCode() {
		return approvalRequestCode;
	}
	public void setApprovalRequestCode(String approvalRequestCode) {
		this.approvalRequestCode = approvalRequestCode;
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
	public String getEmplyId() {
		return emplyId;
	}
	public void setEmplyId(String emplyId) {
		this.emplyId = emplyId;
	}
	public String getDocumentDivisionManagementSCode() {
		return documentDivisionManagementSCode;
	}
	public void setDocumentDivisionManagementSCode(String documentDivisionManagementSCode) {
		this.documentDivisionManagementSCode = documentDivisionManagementSCode;
	}
	public String getApprovalProgressStep() {
		return approvalProgressStep;
	}
	public void setApprovalProgressStep(String approvalProgressStep) {
		this.approvalProgressStep = approvalProgressStep;
	}
	public String getTotalApprovalStep() {
		return totalApprovalStep;
	}
	public void setTotalApprovalStep(String totalApprovalStep) {
		this.totalApprovalStep = totalApprovalStep;
	}
	public String getApprovalGrogressStatus() {
		return approvalGrogressStatus;
	}
	public void setApprovalGrogressStatus(String approvalGrogressStatus) {
		this.approvalGrogressStatus = approvalGrogressStatus;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getApplicationFormGroupCode() {
		return applicationFormGroupCode;
	}
	public void setApplicationFormGroupCode(String applicationFormGroupCode) {
		this.applicationFormGroupCode = applicationFormGroupCode;
	}
	public String getApplicationFormGroupNameCode() {
		return applicationFormGroupNameCode;
	}
	public void setApplicationFormGroupNameCode(String applicationFormGroupNameCode) {
		this.applicationFormGroupNameCode = applicationFormGroupNameCode;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "PaymentRequest [approvalRequestCode=" + approvalRequestCode + ", cpRepresentativeCode="
				+ cpRepresentativeCode + ", superAdminId=" + superAdminId + ", emplyId=" + emplyId
				+ ", documentDivisionManagementSCode=" + documentDivisionManagementSCode + ", approvalProgressStep="
				+ approvalProgressStep + ", totalApprovalStep=" + totalApprovalStep + ", approvalGrogressStatus="
				+ approvalGrogressStatus + ", title=" + title + ", comment=" + comment + ", applicationFormGroupCode="
				+ applicationFormGroupCode + ", applicationFormGroupNameCode=" + applicationFormGroupNameCode
				+ ", regDate=" + regDate + "]";
	}
	
}
