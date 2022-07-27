package ks43team02.dto;

public class ApprovalProgress {
	private String approvalProgressCode;
	private String cpRepresentativeCode;
	private String superAdminId;
	private String approvalRequestCode;
	private String emplyId;
	private String approverId;
	private int approverRank;
	private String documentCateSCode;
	private String emplyName;

	private int currentApprovalStep;
	private String returnStatus;
	private String comment;
	private String regDate;
	ApprovalRequest approvalRequest;
	DocumentCateS documentCateS;
	Emply emply;
	
	public int getApproverRank() {
		return approverRank;
	}
	public void setApproverRank(int approverRank) {
		this.approverRank = approverRank;
	}
	public ApprovalRequest getApprovalRequest() {
		return approvalRequest;
	}
	public void setApprovalRequest(ApprovalRequest approvalRequest) {
		this.approvalRequest = approvalRequest;
	}
	public DocumentCateS getDocumentCateS() {
		return documentCateS;
	}
	public void setDocumentCateS(DocumentCateS documentCateS) {
		this.documentCateS = documentCateS;
	}
	public Emply getEmply() {
		return emply;
	}
	public void setEmply(Emply emply) {
		this.emply = emply;
	}

	private String currentApprovalStep;
	private String returnStauts;
	private String comment;
	private String regDate;
	
	private ApprovalRequest approvalRequest;
	private DocumentCateS documentCateS;
	private Emply emply;
	

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



	public String getDocumentCateSCode() {
		return documentCateSCode;
	}



	public void setDocumentCateSCode(String documentCateSCode) {
		this.documentCateSCode = documentCateSCode;
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




	public String getCurrentApprovalStep() {
		return currentApprovalStep;
	}



	public void setCurrentApprovalStep(String currentApprovalStep) {

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



	public ApprovalRequest getApprovalRequest() {
		return approvalRequest;
	}



	public void setApprovalRequest(ApprovalRequest approvalRequest) {
		this.approvalRequest = approvalRequest;
	}



	public DocumentCateS getDocumentCateS() {
		return documentCateS;
	}



	public void setDocumentCateS(DocumentCateS documentCateS) {
		this.documentCateS = documentCateS;
	}



	public Emply getEmply() {
		return emply;
	}



	public void setEmply(Emply emply) {
		this.emply = emply;
	}



	@Override
	public String toString() {
		return "ApprovalProgress [approvalProgressCode=" + approvalProgressCode + ", cpRepresentativeCode="
				+ cpRepresentativeCode + ", superAdminId=" + superAdminId + ", approvalRequestCode="

				+ approvalRequestCode + ", emplyId=" + emplyId + ", approverId=" + approverId + ", approverRank="
				+ approverRank + ", documentCateSCode=" + documentCateSCode + ", emplyName=" + emplyName
				+ ", currentApprovalStep=" + currentApprovalStep + ", returnStatus=" + returnStatus + ", comment="
				+ comment + ", regDate=" + regDate + ", approvalRequest=" + approvalRequest + ", documentCateS="
				+ documentCateS + ", emply=" + emply + "]";
	}

				+ approvalRequestCode + ", emplyId=" + emplyId + ", approverId=" + approverId + ", documentCateSCode="
				+ documentCateSCode + ", emplyName=" + emplyName + ", currentApprovalStep=" + currentApprovalStep
				+ ", returnStauts=" + returnStauts + ", comment=" + comment + ", regDate=" + regDate
				+ ", approvalRequest=" + approvalRequest + ", documentCateS=" + documentCateS + ", emply=" + emply
				+ "]";
	}



}
