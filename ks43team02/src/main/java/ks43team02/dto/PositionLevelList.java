package ks43team02.dto;

public class PositionLevelList {
	// 회사대표코드, 아이디
	private String cpRepresentativeCode;
	private String superAdminId;
	private String cpName;
	private String regDate;
	// position
	private String positionLevelCode;	
	private String positionCode;
	private String positionLevel;
	private String positionName;
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
	public String getPositionLevelCode() {
		return positionLevelCode;
	}
	public void setPositionLevelCode(String positionLevelCode) {
		this.positionLevelCode = positionLevelCode;
	}
	public String getPositionCode() {
		return positionCode;
	}
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}
	public String getPositionLevel() {
		return positionLevel;
	}
	public void setPositionLevel(String positionLevel) {
		this.positionLevel = positionLevel;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	@Override
	public String toString() {
		return "PositionLevelList [cpRepresentativeCode=" + cpRepresentativeCode + ", superAdminId=" + superAdminId
				+ ", cpName=" + cpName + ", regDate=" + regDate + ", positionLevelCode=" + positionLevelCode
				+ ", positionCode=" + positionCode + ", positionLevel=" + positionLevel + ", positionName="
				+ positionName + "]";
	}
	
}
