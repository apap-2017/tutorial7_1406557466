package com.example.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseModel {
	private String idcourse;
	private String name;
	private Integer credits;
	private List<StudentModel> students;

	public void CourseModel (String idcourse, String name, Integer credits, List<StudentModel> students) {
		this.idcourse = idcourse;
		this.name = name;
		this.credits = credits;
		this.students = students;
	}
	
	public CourseModel(String idcourse, String name, Integer credits) {
		this.idcourse = idcourse;
		this.name = name;
		this.credits = credits;
	}
	
	public String getIdcourse() {
		return idcourse;
	}

	public void setIdcourse(String idcourse) {
		this.idcourse = idcourse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCredits() {
		return credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}

	public List<StudentModel> getStudents() {
		return students;
	}

	public void setStudents(List<StudentModel> students) {
		this.students = students;
	}
}
