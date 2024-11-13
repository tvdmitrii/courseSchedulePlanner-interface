package com.turygin.api.resource;

import com.turygin.api.model.CourseDTO;

import java.util.List;

/** API resource interface for interacting with courses. */
public interface ICourseResource {

    /**
     * Fetches course data by course ID.
     * @param id unique course ID
     * @return information about the course
     */
    CourseDTO getCourse(long id);

    /**
     * Fetches information about all available courses.
     * @return a list of course information objects
     */
    List<CourseDTO> getAllCourses();

    /**
     * Searches for courses based on parameters provided.
     * @param title partial course title (case-insensitive)
     * @param departmentId departmentId
     * @return a list of courses that satisfy the search criteria
     */
    List<CourseDTO> findCourses(String title, long departmentId);

    /**
     * Removes a course.
     * @param courseId course ID
     */
    void deleteCourse(long courseId);

    /**
     * Adds a new course.
     * @param course course object
     * @return newly added course information
     */
    CourseDTO addCourse(CourseDTO course);

    /**
     * Updates course.
     * @param course course information, including ID
     * @return updated course information
     */
    CourseDTO updateCourse(CourseDTO course);
}

