package com.example.Reto2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "messages")
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	@Column()
	private String text;
	@Column()
	private String imagePath;
	@Column()
	private double latitude;
	@Column()
	private double longtitude;
	@Column()
	private boolean isSend;
	@Column()
	private Integer userId;
	@Column()
	private Integer groupId;
	@Column()
	private String createdAt;
	@Column
	private String updatedAt;

}
