package com.Durgesh.StereotypeAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Student {
	
	@Value("Dipendra prasad jaiswal")
	private String studentName;
	
	@Value("Birgunj murli-15 parsa")
	private String city;
	
	@Value("#{li}")
	private List<String>Friends;


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public List<String> getFriends() {
		return Friends;
	}


	public void setFriends(List<String> friends) {
		Friends = friends;
	}


	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", Friends=" + Friends + "]";
	}
	
	

}
