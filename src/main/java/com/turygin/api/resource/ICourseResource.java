package com.turygin.api.resource;

import com.turygin.api.model.CourseDTO;

import jakarta.ws.rs.core.Response;

/** API resource interface for interacting with courses. */
public interface ICourseResource {

    /**
     * Fetches course data by course ID.
     * @param id unique course ID
     * @return information about the course
     */
    Response getCourse(long id);

    /**
     * Fetches information about all available courses.
     * @return a list of course information objects
     */
    Response getAllCourses();

    /**
     * Searches for courses based on parameters provided.
     * @param title partial course title (case-insensitive)
     * @param departmentId departmentId
     * @return a list of courses that satisfy the search criteria
     */
    Response findCourses(String title, long departmentId);

    /**
     * Removes a course.
     * @param courseId course ID
     */
    Response deleteCourse(long courseId);

    /**
     * Adds a new course.
     * @param course course object
     * @return newly added course information
     */
    Response addCourse(CourseDTO course);

    /**
     * Updates course.
     * @param course course information, including ID
     * @return updated course information
     */
    Response updateCourse(CourseDTO course);
}

