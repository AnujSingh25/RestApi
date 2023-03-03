package com.ReactApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ReactApi.entity.Course;

public interface ApiDao extends JpaRepository<Course , Long> {

}
