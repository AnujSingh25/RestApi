package com.ReactApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ReactApi.dao.ApiDao;
import com.ReactApi.entity.Course;

@Service
public class ApiServiceImpl implements ApiService {

	@Autowired
	private ApiDao apiDao;

	public ApiServiceImpl() {
	}

	// get all data from db

	@Override
	public List<Course> getAllData() {
		return apiDao.findAll();
	}

	// add course to db

	@Override
	public Course addCourse(Course course) {
		apiDao.save(course);
		return course;
	}

	// update course in db

	@Override
	public Course updateCourse(Course course) {
		apiDao.save(course);
		return course;
	}

	@Override
	public Course findById(int delId) {

		Optional<Course> res = apiDao.findById((long) delId);
		Course cc = null;

		if (res.isPresent()) {
			cc = res.get();
		} else {
			throw new RuntimeException("Did not find the Id in Our DB :_" + delId);
		}
		return cc;
	}

	@Override
	public void delCourse(Course delid) {

		apiDao.delete(delid);
	}
}
