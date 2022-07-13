package ks43team02.dto;

import java.time.LocalDate;

public class PayAdd {

	private String payAddCode;
	private String emplyName;
	private String emplyId;
	private String emplyRank;
	private String emplyOrganization;
	private String basicPay;
	private String fixedPayList;
	private String bonusPay;
	private String deductionPayList;
	private String totalDeduction;
	private String totalPayment;
	private LocalDate payAddRegDate;
	
	public String getPayAddCode() {
		return payAddCode;
	}
	public void setPayAddCode(String payAddCode) {
		this.payAddCode = payAddCode;
	}
	public String getEmplyName() {
		return emplyName;
	}
	public void setEmplyName(String emplyName) {
		this.emplyName = emplyName;
	}
	public String getEmplyId() {
		return emplyId;
	}
	public void setEmplyId(String emplyId) {
		this.emplyId = emplyId;
	}
	public String getEmplyRank() {
		return emplyRank;
	}
	public void setEmplyRank(String emplyRank) {
		this.emplyRank = emplyRank;
	}
	public String getEmplyOrganization() {
		return emplyOrganization;
	}
	public void setEmplyOrganization(String emplyOrganization) {
		this.emplyOrganization = emplyOrganization;
	}
	public String getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(String basicPay) {
		this.basicPay = basicPay;
	}
	public String getFixedPayList() {
		return fixedPayList;
	}
	public void setFixedPayList(String fixedPayList) {
		this.fixedPayList = fixedPayList;
	}
	public String getBonusPay() {
		return bonusPay;
	}
	public void setBonusPay(String bonusPay) {
		this.bonusPay = bonusPay;
	}
	public String getDeductionPayList() {
		return deductionPayList;
	}
	public void setDeductionPayList(String deductionPayList) {
		this.deductionPayList = deductionPayList;
	}
	public String getTotalDeduction() {
		return totalDeduction;
	}
	public void setTotalDeduction(String totalDeduction) {
		this.totalDeduction = totalDeduction;
	}
	public String getTotalPayment() {
		return totalPayment;
	}
	public void setTotalPayment(String totalPayment) {
		this.totalPayment = totalPayment;
	}
	public LocalDate getPayAddRegDate() {
		return payAddRegDate;
	}
	public void setPayAddRegDate(LocalDate payAddRegDate) {
		this.payAddRegDate = payAddRegDate;
	}
	
	@Override
	public String toString() {
		return "PayAdd [payAddCode=" + payAddCode + ", emplyName=" + emplyName + ", emplyId=" + emplyId + ", emplyRank="
				+ emplyRank + ", emplyOrganization=" + emplyOrganization + ", basicPay=" + basicPay + ", fixedPayList="
				+ fixedPayList + ", bonusPay=" + bonusPay + ", deductionPayList=" + deductionPayList
				+ ", totalDeduction=" + totalDeduction + ", totalPayment=" + totalPayment + ", payAddRegDate="
				+ payAddRegDate + "]";
	}
	
}
