package ks43team02.dto;

import java.time.LocalDateTime;

public class ChatRoom {
	private String messengerChatroomCode;
	private String cpRepresentativeCode;
	private String superAdminId;
	private int roomNumber;
	private String roomName;
	private LocalDateTime chatroomRegDate;
	private LocalDateTime chatroomEndDate;
	
	public String getMessengerChatroomCode() {
		return messengerChatroomCode;
	}
	public void setMessengerChatroomCode(String messengerChatroomCode) {
		this.messengerChatroomCode = messengerChatroomCode;
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
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public LocalDateTime getChatroomRegDate() {
		return chatroomRegDate;
	}
	public void setChatroomRegDate(LocalDateTime chatroomRegDate) {
		this.chatroomRegDate = chatroomRegDate;
	}
	public LocalDateTime getChatroomEndDate() {
		return chatroomEndDate;
	}
	public void setChatroomEndDate(LocalDateTime chatroomEndDate) {
		this.chatroomEndDate = chatroomEndDate;
	}
	@Override
	public String toString() {
		return "ChatRoom [messengerChatroomCode=" + messengerChatroomCode + ", cpRepresentativeCode="
				+ cpRepresentativeCode + ", superAdminId=" + superAdminId + ", roomNumber=" + roomNumber + ", roomName="
				+ roomName + ", chatroomRegDate=" + chatroomRegDate + ", chatroomEndDate=" + chatroomEndDate + "]";
	}
	
}
