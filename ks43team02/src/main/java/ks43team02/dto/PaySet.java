package ks43team02.dto;

import java.util.Arrays;

public class PaySet {
	
	private String paySetCode;
	private String paySetDate;
	private String paySetTime;
	private String fixedPayList;
	private String deducePayList;
	private String[] fixedPayArrays;
	private String[] deducePayArrays;
	
	public String[] getFixedPayArrays() {
		return fixedPayArrays;
	}
	public void setFixedPayArrays(String[] fixedPayArrays) {
		this.fixedPayArrays = fixedPayArrays;
	}
	public String[] getDeducePayArrays() {
		return deducePayArrays;
	}
	public void setDeducePayArrays(String[] deducePayArrays) {
		this.deducePayArrays = deducePayArrays;
	}

	private String paySetRegDate;
	
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
	public String getDeducePayList() {
		return deducePayList;
	}
	public void setDeducePayList(String deducePayList) {
		this.deducePayList = deducePayList;
	}
	public String getPaySetRegDate() {
		return paySetRegDate;
	}
	public void setPaySetRegDate(String paySetRegDate) {
		this.paySetRegDate = paySetRegDate;
	}
	
	@Override
	public String toString() {
		return "PaySet [paySetCode=" + paySetCode + ", paySetDate=" + paySetDate + ", paySetTime=" + paySetTime
				+ ", fixedPayList=" + fixedPayList + ", deducePayList=" + deducePayList + ", fixedPayArrays="
				+ Arrays.toString(fixedPayArrays) + ", deducePayArrays=" + Arrays.toString(deducePayArrays)
				+ ", paySetRegDate=" + paySetRegDate + "]";
	}

}
