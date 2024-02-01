package com.hexaware.lms.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long AdminId;
	@Column(name = "firstName")
	private String adminFirstName;
	@Column(name = "lastName")
	private String adminLastName;
	private String username;
	private String password;
	@Column(columnDefinition = "varchar(5) default 'Admin'")
	private String role;
}
