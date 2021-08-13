package com.example.demo;

//import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="student", createIndex = true)
//@Entity
public class Student {

	@Id
	int id;
	String name;
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
	public Student(int id,String name) {
		super();
		this.id=id;
		this.name=name;
	}
	public Student() {}
}
