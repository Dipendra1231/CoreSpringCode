package com.Durgesh.Collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private String Name;
	private List<String>Phones;
	private Set<String>Addresses;
	private Map<String,String>Courses;
	private Properties EmpDetails;//private Properties properties;
	
	
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Phones=" + Phones + ", Addresses=" + Addresses + ", Courses=" + Courses
				+ ", EmpDetails=" + EmpDetails + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, List<String> phones, Set<String> addresses, Map<String, String> courses,
			Properties empDetails) {
		super();
		Name = name;
		Phones = phones;
		Addresses = addresses;
		Courses = courses;
		EmpDetails = empDetails;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<String> getPhones() {
		return Phones;
	}
	public void setPhones(List<String> phones) {
		Phones = phones;
	}
	public Set<String> getAddresses() {
		return Addresses;
	}
	public void setAddresses(Set<String> addresses) {
		Addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return Courses;
	}
	public void setCourses(Map<String, String> courses) {
		Courses = courses;
	}
	public Properties getEmpDetails() {
		return EmpDetails;
	}
	public void setEmpDetails(Properties empDetails) {
		EmpDetails = empDetails;
	}
	

	
}
