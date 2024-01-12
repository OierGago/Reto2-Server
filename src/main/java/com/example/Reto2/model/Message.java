package com.example.Reto2.model;

public class Message {

	private String id;
	private String text;
	private String imagePath;
	private double latitude;
	private double longtitude;
	private boolean isSend;
	private Integer userId;
	private Integer groupId;
	private String createdAt;
	private String updatedAt;
	
	public Message() {}
	public Message(String id, String text, String imagePath, double latitude, double longtitude, boolean isSend,
			Integer userId, Integer groupId, String createdAt, String updatedAt) {
		super();
		this.id = id;
		this.text = text;
		this.imagePath = imagePath;
		this.latitude = latitude;
		this.longtitude = longtitude;
		this.isSend = isSend;
		this.userId = userId;
		this.groupId = groupId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongtitude() {
		return longtitude;
	}
	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}
	public boolean isSend() {
		return isSend;
	}
	public void setSend(boolean isSend) {
		this.isSend = isSend;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", text=" + text + ", imagePath=" + imagePath + ", latitude=" + latitude
				+ ", longtitude=" + longtitude + ", isSend=" + isSend + ", userId=" + userId + ", groupId=" + groupId
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
	
	
	
}
