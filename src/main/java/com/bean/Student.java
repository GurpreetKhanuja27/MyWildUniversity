package com.bean;

public class Student {

	private String name;
	private String gender;
	private int university_number;
	public Student(String name, String gender, int university_number) {
		super();
		this.name = name;
		this.gender = gender;
		this.university_number = university_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getUniversity_number() {
		return university_number;
	}
	public void setUniversity_number(int university_number) {
		this.university_number = university_number;
	}
		
}