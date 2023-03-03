package com.ReactApi.service;

import java.util.List;

import com.ReactApi.entity.Course;

public interface ApiService {

	List<Course> getAllData();

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public Course findById(int delId);

	public void delCourse(Course delid);

}
