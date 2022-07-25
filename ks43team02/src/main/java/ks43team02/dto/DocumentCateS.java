package ks43team02.dto;

public class DocumentCateS {
	private String documentCateSCode;
	private String cpRepresentativeCode;
	private String superAdminId;
	private String documentCateLCode;
	private String cateNameL;
	private String cateNameS;
	private String regDate;
	public String getDocumentCateSCode() {
		return documentCateSCode;
	}
	public void setDocumentCateSCode(String documentCateSCode) {
		this.documentCateSCode = documentCateSCode;
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
	public String getDocumentCateLCode() {
		return documentCateLCode;
	}
	public void setDocumentCateLCode(String documentCateLCode) {
		this.documentCateLCode = documentCateLCode;
	}
	public String getCateNameL() {
		return cateNameL;
	}
	public void setCateNameL(String cateNameL) {
		this.cateNameL = cateNameL;
	}
	public String getCateNameS() {
		return cateNameS;
	}
	public void setCateNameS(String cateNameS) {
		this.cateNameS = cateNameS;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "DocumentCateS [documentCateSCode=" + documentCateSCode + ", cpRepresentativeCode="
				+ cpRepresentativeCode + ", superAdminId=" + superAdminId + ", documentCateLCode=" + documentCateLCode
				+ ", cateNameL=" + cateNameL + ", cateNameS=" + cateNameS + ", regDate=" + regDate + "]";
	}
	
}