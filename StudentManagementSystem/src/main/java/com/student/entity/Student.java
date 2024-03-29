package com.student.entity;

public class Student {
	private int id;
	private String name;
	private String password;
	private String email;
	private String gender;
	private String phone;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String password, String email, String gender, String phone) {
		super();
		
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.phone = phone;
	}
	public Student(int id,String name, String password, String email, String gender, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.phone = phone;
	}
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", gender="
				+ gender + ", phone=" + phone + "]";
	}
	
	

}
