package ks43team02.dto;

import java.time.LocalDate;
import java.util.Arrays;

public class PaySet {
	
	private String paySetCode;
	private String paySetDate;
	private String paySetTime;
	private String fixedPayList;
	private String[] fixedPayArrays;
	private String fixedPayAmount;
	private String[] fixedAmountArrays;
	private String deductionPayList;
	private String[] deductionPayArrays;
	private String deductionPayAmount;
	private String[] deductionAmountArrays;
	private LocalDate paySetRegDate;
	
	public String getPaySetCode() {
		return paySetCode;
	}
	public void setPaySetCode(String paySetCode) {
		this.paySetCode = paySetCode;
	}
	public String getPaySetDate() {
		return paySetDate;
	}
	public void setPaySetDate(String paySetDate) {
		this.paySetDate = paySetDate;
	}
	public String getPaySetTime() {
		return paySetTime;
	}
	public void setPaySetTime(String paySetTime) {
		this.paySetTime = paySetTime;
	}
	public String getFixedPayList() {
		return fixedPayList;
	}
	public void setFixedPayList(String fixedPayList) {
		this.fixedPayList = fixedPayList;
	}
	public String[] getFixedPayArrays() {
		return fixedPayArrays;
	}
	public void setFixedPayArrays(String[] fixedPayArrays) {
		this.fixedPayArrays = fixedPayArrays;
	}
	public String getFixedPayAmount() {
		return fixedPayAmount;
	}
	public void setFixedPayAmount(String fixedPayAmount) {
		this.fixedPayAmount = fixedPayAmount;
	}
	public String[] getFixedAmountArrays() {
		return fixedAmountArrays;
	}
	public void setFixedAmountArrays(String[] fixedAmountArrays) {
		this.fixedAmountArrays = fixedAmountArrays;
	}
	public String getDeductionPayList() {
		return deductionPayList;
	}
	public void setDeductionPayList(String deductionPayList) {
		this.deductionPayList = deductionPayList;
	}
	public String[] getDeductionPayArrays() {
		return deductionPayArrays;
	}
	public void setDeductionPayArrays(String[] deductionPayArrays) {
		this.deductionPayArrays = deductionPayArrays;
	}
	public String getDeductionPayAmount() {
		return deductionPayAmount;
	}
	public void setDeductionPayAmount(String deductionPayAmount) {
		this.deductionPayAmount = deductionPayAmount;
	}
	public String[] getDeductionAmountArrays() {
		return deductionAmountArrays;
	}
	public void setDeductionAmountArrays(String[] deductionAmountArrays) {
		this.deductionAmountArrays = deductionAmountArrays;
	}
	public LocalDate getPaySetRegDate() {
		return paySetRegDate;
	}
	public void setPaySetRegDate(LocalDate paySetRegDate) {
		this.paySetRegDate = paySetRegDate;
	}
	
	@Override
	public String toString() {
		return "PaySet [paySetCode=" + paySetCode + ", paySetDate=" + paySetDate + ", paySetTime=" + paySetTime
				+ ", fixedPayList=" + fixedPayList + ", fixedPayArrays=" + Arrays.toString(fixedPayArrays)
				+ ", fixedPayAmount=" + fixedPayAmount + ", fixedAmountArrays=" + Arrays.toString(fixedAmountArrays)
				+ ", deductionPayList=" + deductionPayList + ", deductionPayArrays="
				+ Arrays.toString(deductionPayArrays) + ", deductionPayAmount=" + deductionPayAmount
				+ ", deductionAmountArrays=" + Arrays.toString(deductionAmountArrays) + ", paySetRegDate="
				+ paySetRegDate + "]";
	}
	
	
}
