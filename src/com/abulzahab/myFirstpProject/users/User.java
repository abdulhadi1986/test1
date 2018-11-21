package com.abulzahab.myFirstpProject.users;

public class User {

	private String firstName ;
	private String lastName; 
	private int age;
	
	public void setFirstName(String name) {
		firstName = name;
	}
	
	public String getFirstName() {
	
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
