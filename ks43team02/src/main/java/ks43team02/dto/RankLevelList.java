package ks43team02.dto;

public class RankLevelList {
	// 회사대표코드, 아이디
	private String cpRepresentativeCode;
	private String superAdminId;
	private String cpName;
	private String regDate;
	// rank
	private String rankLevelCode;
	private String rankCode;
	private String rankLevel;
	private String rankName;
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
	public String getRankLevelCode() {
		return rankLevelCode;
	}
	public void setRankLevelCode(String rankLevelCode) {
		this.rankLevelCode = rankLevelCode;
	}
	public String getRankCode() {
		return rankCode;
	}
	public void setRankCode(String rankCode) {
		this.rankCode = rankCode;
	}
	public String getRankLevel() {
		return rankLevel;
	}
	public void setRankLevel(String rankLevel) {
		this.rankLevel = rankLevel;
	}
	public String getRankName() {
		return rankName;
	}
	public void setRankName(String rankName) {
		this.rankName = rankName;
	}
	@Override
	public String toString() {
		return "RankLevelList [cpRepresentativeCode=" + cpRepresentativeCode + ", superAdminId=" + superAdminId
				+ ", cpName=" + cpName + ", regDate=" + regDate + ", rankLevelCode=" + rankLevelCode + ", rankCode="
				+ rankCode + ", rankLevel=" + rankLevel + ", rankName=" + rankName + "]";
	}
	
}
