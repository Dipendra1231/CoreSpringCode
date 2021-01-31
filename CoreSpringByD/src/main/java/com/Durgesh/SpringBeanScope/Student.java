package com.Durgesh.SpringBeanScope;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")  //@Scope("singleton") default is singletone bean scope thats mean give same hashcode of different object of ioc container
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
