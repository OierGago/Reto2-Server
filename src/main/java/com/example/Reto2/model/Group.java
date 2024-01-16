package com.example.Reto2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "groups")
public class Group {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column()
	private String name;
	@Column()
	private boolean isPrivate;
	@Column()
	private String messageId;
	@Column()
	private String createdAt;
	@Column()
	private String updateAt;
	
}
