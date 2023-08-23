package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentDetails")
public class StudentEntity {
    @Id
	private int id;
	private String Studentname;
	private String DepartmentName;
	private String mailid;
	public StudentEntity(int id, String studentname, String departmentName, String mailid) {
		super();
		this.id = id;
		Studentname = studentname;
		DepartmentName = departmentName;
		this.mailid = mailid;
	}
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	
}
