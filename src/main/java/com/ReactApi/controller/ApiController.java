package com.ReactApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ReactApi.entity.Course;
import com.ReactApi.service.ApiService;

@RestController
public class ApiController {

	@Autowired
	private ApiService apiService;

	// Get data from db

	@GetMapping("/data")
	public List<Course> getAllData() {
		return this.apiService.getAllData();
	}

	// Add Data to db

	@PostMapping("/save")
	public Course addCourse(@RequestBody Course course) {
		return this.apiService.addCourse(course);
	}

	// update Data of db

	@PutMapping("/update")
	public Course updateCourse(@RequestBody Course course) {
		return this.apiService.updateCourse(course);
	}

	// delete Data from db

	@DeleteMapping("/delete/{delId}")
	public String deleteCourse(@PathVariable int delId) {

		Course delid = apiService.findById(delId);

		if (delid == null) {
			throw new RuntimeException("Not found ID:-" + delId);
		}

		apiService.delCourse(delid);

		return "Del id : -" + delId;
	}
}
