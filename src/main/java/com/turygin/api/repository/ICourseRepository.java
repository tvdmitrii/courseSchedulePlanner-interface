package com.turygin.api.repository;

import com.turygin.api.model.CourseDTO;

import java.util.List;

public interface ICourseRepository {
    CourseDTO getCourse(long id);
    List<CourseDTO> getAllCourses();
}

