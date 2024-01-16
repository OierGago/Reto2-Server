package com.example.Reto2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Reto2.model.Group;
import com.example.Reto2.repository.GroupRepository;

@RestController
@RequestMapping("api")
public class GroupController {

	@Autowired
	private GroupRepository groupRepository;
	
	@GetMapping("/groups")
	public ResponseEntity<Iterable<Group>> getGroups(){
		return new ResponseEntity<Iterable<Group>>(groupRepository.findAll(), HttpStatus.OK);
	}
}
