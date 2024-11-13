package com.turygin.api.resource;

import com.turygin.api.model.SectionDTO;

import java.util.List;

/** API resource interface for interacting with sections. */
public interface ISectionResource {

    /**
     * Fetches information about all available sections of a course.
     * @param courseId ID of the course
     * @return a list of all sections of the associated course
     */
    List<SectionDTO> getAllCourseSections(long courseId);

    /**
     * Removes a section.
     * @param sectionId section ID
     */
    void deleteSection(long sectionId);

    /**
     * Adds a new section to a course.
     * @param courseId course ID
     * @param section section object
     * @return newly added section information
     */
    SectionDTO addSection(long courseId, SectionDTO section);

    /**
     * Updates section.
     * @param section section information, including ID
     * @return updated section information
     */
    SectionDTO updateSection(SectionDTO section);
}

