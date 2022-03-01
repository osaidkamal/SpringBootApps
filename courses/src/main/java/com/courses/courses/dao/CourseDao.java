package com.courses.courses.dao;

import com.courses.courses.models.Course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long>{
    
}
