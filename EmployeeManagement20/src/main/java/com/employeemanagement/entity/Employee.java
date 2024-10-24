package com.employeemanagement.entity;

import org.hibernate.annotations.IdGeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eId;
	private String name;
	private String address;
	private int sallary;
	private String designation;
	private String type;
	private int leaveBalence;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSallary() {
		return sallary;
	}
	public void setSallary(int sallary) {
		this.sallary = sallary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLeaveBalence() {
		return leaveBalence;
	}
	public void setLeaveBalence(int leaveBalence) {
		this.leaveBalence = leaveBalence;
	}
	
	
	
	

}
