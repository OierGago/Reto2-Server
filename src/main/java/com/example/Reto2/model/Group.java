package com.example.Reto2.model;

public class Group {

	private Integer id;
	private String name;
	private boolean isPrivate;
	private String messageId;
	private String createdAt;
	private String updateAt;
	
	public Group() {}
	public Group(Integer id, String name, boolean isPrivate, String messageId, String createdAt, String updateAt) {
		super();
		this.id = id;
		this.name = name;
		this.isPrivate = isPrivate;
		this.messageId = messageId;
		this.createdAt = createdAt;
		this.updateAt = updateAt;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isPrivate() {
		return isPrivate;
	}
	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}
	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", isPrivate=" + isPrivate + ", messageId=" + messageId
				+ ", createdAt=" + createdAt + ", updateAt=" + updateAt + "]";
	}
}
