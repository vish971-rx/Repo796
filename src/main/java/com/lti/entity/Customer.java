package com.lti.entity; //it is model

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	@Id
	@GeneratedValue
private int id;
	
	
	private String name;
	private String email;
	private String profilePicName;
			
	

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfilePicName() {
		return profilePicName;
	}
	public void setProfilePicName(String profilePicName) {
		this.profilePicName = profilePicName;
	}

	
	
}
