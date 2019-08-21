package com.vineeth.confusion.models;

public class User {

	private String firstName;
	private String lastName;
	private Boolean admin;
	private String facebookID;
	
	User(){
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Boolean getAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	public String getFacebookID() {
		return facebookID;
	}
	public void setFacebookID(String facebookID) {
		this.facebookID = facebookID;
	}
	

	
}
