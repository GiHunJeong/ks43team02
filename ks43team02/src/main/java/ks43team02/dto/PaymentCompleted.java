package ks43team02.dto;

public class PaymentCompleted {
	private String approvalCompletedDocumentCode;
	private String cpRepresentativeCode;
	private String superAdminId;
	private String documentDivisionManagementSCode;
	private String approvalRequestCode;
	private String emplyId;
	private String approverId;
	private String approvalDate;
	private String comment;
	private String cpName;
	private String regDate;
	
	private PaymentProgress	paymentProgress;
	private PaymentRequest paymentRequest;
	
	public PaymentProgress getPaymentProgress() {
		return paymentProgress;
	}
	public void setPaymentProgress(PaymentProgress paymentProgress) {
		this.paymentProgress = paymentProgress;
	}
	public PaymentRequest getPaymentRequest() {
		return paymentRequest;
	}
	public void setPaymentRequest(PaymentRequest paymentRequest) {
		this.paymentRequest = paymentRequest;
	}
	public String getApprovalCompletedDocumentCode() {
		return approvalCompletedDocumentCode;
	}
	public void setApprovalCompletedDocumentCode(String approvalCompletedDocumentCode) {
		this.approvalCompletedDocumentCode = approvalCompletedDocumentCode;
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
	public String getDocumentDivisionManagementSCode() {
		return documentDivisionManagementSCode;
	}
	public void setDocumentDivisionManagementSCode(String documentDivisionManagementSCode) {
		this.documentDivisionManagementSCode = documentDivisionManagementSCode;
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
	public String getApprovalDate() {
		return approvalDate;
	}
	public void setApprovalDate(String approvalDate) {
		this.approvalDate = approvalDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCpName() {
		return cpName;
	}
	public void setCpName(String cpName) {
		this.cpName = cpName;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "PaymentCompleted [approvalCompletedDocumentCode=" + approvalCompletedDocumentCode
				+ ", cpRepresentativeCode=" + cpRepresentativeCode + ", superAdminId=" + superAdminId
				+ ", documentDivisionManagementSCode=" + documentDivisionManagementSCode + ", approvalRequestCode="
				+ approvalRequestCode + ", emplyId=" + emplyId + ", approverId=" + approverId + ", approvalDate="
				+ approvalDate + ", comment=" + comment + ", cpName=" + cpName + ", regDate=" + regDate
				+ ", paymentProgress=" + paymentProgress + ", paymentRequest=" + paymentRequest + "]";
	}
	
}
