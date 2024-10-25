package com.turygin.api.resource;

import com.turygin.api.model.CourseBasicDTO;
import com.turygin.api.model.CourseSearchParams;

import java.util.List;

/**
 * Interface that defines a course resource and describes
 * the actions that can be performed on courses.
 */
public interface ICourseResource {

    /**
     * Fetches course data by course unique ID.
     * @param id unique course ID
     * @return information about the course
     */
    CourseBasicDTO getCourse(long id);

    /**
     * Fetches information about all available courses.
     * @return a list of course information objects
     */
    List<CourseBasicDTO> getAllCourses();

    /**
     * Searches for courses based on parameters provided.
     * @param params search parameters
     * @return a list of courses that satisfy the search criteria
     */
    List<CourseBasicDTO> findCourses(CourseSearchParams params);
}

