package com.turygin.api.repository;

import com.turygin.api.model.CourseDTO;

import java.util.List;

/**
 * Interface that defines a course repository and describes
 * the actions that can be performed on courses.
 */
public interface ICourseRepository {

    /**
     * Fetches course data by course unique ID.
     * @param id unique course ID
     * @return information about the course
     */
    CourseDTO getCourse(long id);

    /**
     * Fetches information about all available courses.
     * @return a list of course information objects
     */
    List<CourseDTO> getAllCourses();
}

