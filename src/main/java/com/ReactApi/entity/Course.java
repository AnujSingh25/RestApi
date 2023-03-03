package com.ReactApi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String title;
	private String description;

	// non parametirized constructor

	public Course() {
		super();
	}

	public Course(long id, String title, String description) {
		this.id = id;
		this.title = title;
		this.description = description;
	}

	// getter and setter

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// to String

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
}
