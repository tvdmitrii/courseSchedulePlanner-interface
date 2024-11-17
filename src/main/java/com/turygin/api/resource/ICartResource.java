package com.turygin.api.resource;

import jakarta.ws.rs.core.Response;

import java.util.List;

/** API resource interface for interacting with user's cart containing courses and selected course sections. */
public interface ICartResource {

    /**
     * Gets all courses in user's cart.
     * @param userId database user ID
     * @return a list of courses and associated sections
     */
    Response cartGetCourses(long userId);

    /**
     * Adds a new course to user's cart. None of the sections are selected by default.
     * @param userId database user ID
     * @param courseId cart course ID
     * @return newly added cart course
     */
    Response cartAddCourse(long userId, long courseId);

    /**
     * Removes a course from user's cart with all the associated sections.
     * @param userId database user ID
     * @param courseId cart course ID
     */
    Response cartRemoveCourse(long userId, long courseId);

    /**
     * Updates section selection for a course in user's cart.
     * @param userId database user ID
     * @param courseId cart course ID
     * @param sectionIds a list of cart section IDs that are selected
     * @return an updated cart course
     */
    Response cartUpdateSections(long userId, long courseId, List<Long> sectionIds);
}
