package com.courses.courses.services;

import java.util.List;

import com.courses.courses.dao.CourseDao;
import com.courses.courses.models.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImp implements CourseService {

    @Autowired
    private CourseDao courseDao;

    public Course CourseServiceImpl() {
        return null;

    }

    @Override
    public List<Course> getCourses() {

        return courseDao.findAll();
    }

    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public Course getCourse(long id) {

        return courseDao.getById(id);
    }

    @Override
    public Course updateCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public Course deleteCourse(long id) {
        Course entity = courseDao.getById(id);
        courseDao.delete(entity);
        return entity;
    }
}
