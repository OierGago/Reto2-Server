package com.example.Reto2.repository;

import java.util.List;

import com.example.Reto2.model.Message;

public interface MessageRepository {
	
	List<Message> findAllByGroupId();
	Message findById(Integer id);
	int create(Message message);
	int update(Message message);
	int deleteById(Integer id);
}
