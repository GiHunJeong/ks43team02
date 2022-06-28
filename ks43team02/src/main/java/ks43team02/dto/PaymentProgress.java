package ks43team02.dto;

public class PaymentProgress {
	private String approvalProgressCode;
	private String cpRepresentativeCode;
	private String superAdminId;
	private String approvalRequestCode;
	private String emplyId;
	private String approverId;
	private String documentDivisionManagementSCode;
	private String emplyName;
	private int currentApprovalStep;
	private String returnStauts;
	private String comment;
	private String regDate;
	
	private PaymentRequest paymentRequest;
	
	public PaymentRequest getPaymentRequest() {
		return paymentRequest;
	}
	public void setPaymentRequest(PaymentRequest paymentRequest) {
		this.paymentRequest = paymentRequest;
	}
	public String getApprovalProgressCode() {
		return approvalProgressCode;
	}
	public void setApprovalProgressCode(String approvalProgressCode) {
		this.approvalProgressCode = approvalProgressCode;
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
	public String getApproverId() {
		return approverId;
	}
	public void setApproverId(String approverId) {
		this.approverId = approverId;
	}
	public String getDocumentDivisionManagementSCode() {
		return documentDivisionManagementSCode;
	}
	public void setDocumentDivisionManagementSCode(String documentDivisionManagementSCode) {
		this.documentDivisionManagementSCode = documentDivisionManagementSCode;
	}
	public String getEmplyName() {
		return emplyName;
	}
	public void setEmplyName(String emplyName) {
		this.emplyName = emplyName;
	}
	public int getCurrentApprovalStep() {
		return currentApprovalStep;
	}
	public void setCurrentApprovalStep(int currentApprovalStep) {
		this.currentApprovalStep = currentApprovalStep;
	}
	public String getReturnStauts() {
		return returnStauts;
	}
	public void setReturnStauts(String returnStauts) {
		this.returnStauts = returnStauts;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "PaymentProgress [approvalProgressCode=" + approvalProgressCode + ", cpRepresentativeCode="
				+ cpRepresentativeCode + ", superAdminId=" + superAdminId + ", approvalRequestCode="
				+ approvalRequestCode + ", emplyId=" + emplyId + ", approverId=" + approverId
				+ ", documentDivisionManagementSCode=" + documentDivisionManagementSCode + ", emplyName=" + emplyName
				+ ", currentApprovalStep=" + currentApprovalStep + ", returnStauts=" + returnStauts + ", comment="
				+ comment + ", regDate=" + regDate + ", paymentRequest=" + paymentRequest + "]";
	}
	
}
