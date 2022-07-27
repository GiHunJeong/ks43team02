package ks43team02.dto;

public class ApprovalRequest {
	private String approvalRequestCode;
	private String cpRepresentativeCode;
	private String superAdminId;
	private String emplyId;
	private String documentCateSCode;
	private int approvalProgressStep;
	private int totalApprovalStep;
	private String approvalProgressStatus;
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
	public String getDocumentCateSCode() {
		return documentCateSCode;
	}
	public void setDocumentCateSCode(String documentCateSCode) {
		this.documentCateSCode = documentCateSCode;
	}
	public int getApprovalProgressStep() {
		return approvalProgressStep;
	}
	public void setApprovalProgressStep(int approvalProgressStep) {
		this.approvalProgressStep = approvalProgressStep;
	}
	public int getTotalApprovalStep() {
		return totalApprovalStep;
	}
	public void setTotalApprovalStep(int totalApprovalStep) {
		this.totalApprovalStep = totalApprovalStep;
	}
	public String getApprovalProgressStatus() {
		return approvalProgressStatus;
	}
	public void setApprovalProgressStatus(String approvalProgressStatus) {
		this.approvalProgressStatus = approvalProgressStatus;
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
		return "ApprovalRequest [approvalRequestCode=" + approvalRequestCode + ", cpRepresentativeCode="
				+ cpRepresentativeCode + ", superAdminId=" + superAdminId + ", emplyId=" + emplyId
				+ ", documentCateSCode=" + documentCateSCode + ", approvalProgressStep=" + approvalProgressStep
				+ ", totalApprovalStep=" + totalApprovalStep + ", approvalProgressStatus=" + approvalProgressStatus
				+ ", title=" + title + ", comment=" + comment + ", applicationFormGroupCode=" + applicationFormGroupCode
				+ ", applicationFormGroupNameCode=" + applicationFormGroupNameCode + ", regDate=" + regDate + "]";
	}
	
}
