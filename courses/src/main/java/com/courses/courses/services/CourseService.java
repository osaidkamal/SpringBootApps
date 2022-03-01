package com.courses.courses.services;

import java.util.List;

import com.courses.courses.models.Course;

public interface CourseService {
    public List<Course> getCourses();

    public Course getCourse(long id);

    public Course addCourse(Course course);

    public Course updateCourse(Course course);

    public Course deleteCourse(long parseLong);
}
