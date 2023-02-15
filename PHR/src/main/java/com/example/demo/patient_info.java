package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient")
public class patient_info {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String first_name;
	private String last_name;
	private String DOB;
	private String contact_no;
	private String emergency_contact_no;
	private String insurance_information;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfirst_name() {
		return first_name;
	}
	public void setfirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getlast_name() {
		return last_name;
	}
	public void setlast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String DOB) {
		this.DOB = DOB;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		
		this.contact_no = contact_no;
	}
	public String getemergency_contact_no() {
		return emergency_contact_no;
	}
	public void setEmergency_contact_no(String emergency_contact_no) {
		this.emergency_contact_no = emergency_contact_no;
	}
	public String getInsurance_information() {
		return insurance_information;
	}
	public void setInsurance_information(String insurance_information) {
		this.insurance_information = insurance_information;
	}
	public patient_info(int id, String first_name, String last_name, String DOB, String contact_no,
			String emergency_contact_no, String insurance_information) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.DOB = DOB;
		this.contact_no = contact_no;
		this.emergency_contact_no = emergency_contact_no;
		this.insurance_information = insurance_information;
	}
	
	public patient_info(){}
	
	}
