package ks43team02.dto;

public class Emply {
	private String userName;
	private String userEmail;
	private String userPw;
	private String userPhone;
	private String userAddr;
	private int userLvl;
	private String userRegDate;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	public int getUserLvl() {
		return userLvl;
	}
	public void setUserLvl(int userLvl) {
		this.userLvl = userLvl;
	}
	public String getUserRegDate() {
		return userRegDate;
	}
	public void setUserRegDate(String userRegDate) {
		this.userRegDate = userRegDate;
	}
	@Override
	public String toString() {
		return "Emply [userName=" + userName + ", userEmail=" + userEmail + ", userPw=" + userPw + ", userPhone="
				+ userPhone + ", userAddr=" + userAddr + ", userLvl=" + userLvl + ", userRegDate=" + userRegDate + "]";
	}
}
