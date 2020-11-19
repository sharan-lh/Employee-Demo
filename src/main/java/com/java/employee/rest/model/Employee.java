package com.java.employee.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
 
 @Id
 @GeneratedValue(strategy= GenerationType.IDENTITY)
 private Long id;
 
 @Column(name="NAME")
 private String name;
 
 @Column(name="SALARY")
 private Integer salary;
 
 @Column(name="TITLE")
 private String title;
 
 @Column(name="BUNIT")
 private String bunit;
 
 @Column(name="PLACE")
 private String place;

 @Column(name="SID")
 private Integer sid;
 
 @Column(name="COMPETENCIES")
 private String competencies;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getSalary() {
	return salary;
}

public void setSalary(Integer salary) {
	this.salary = salary;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getBunit() {
	return bunit;
}

public void setBunit(String bunit) {
	this.bunit = bunit;
}

public String getPlace() {
	return place;
}

public void setPlace(String place) {
	this.place = place;
}

public Integer getSid() {
	return sid;
}

public void setSid(Integer sid) {
	this.sid = sid;
}

public String getCompetencies() {
	return competencies;
}

public void setCompetencies(String competencies) {
	this.competencies = competencies;
}
 	
}