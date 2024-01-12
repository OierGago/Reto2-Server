package com.example.Reto2.repository;

import java.util.List;

import com.example.Reto2.model.Group;

public interface GroupRepository {

	List<Group> findAllByUserId();
	Group findById(Integer id);
	int create(Group group);
	int update(Group group);
	int delete(Group group);
	
}
