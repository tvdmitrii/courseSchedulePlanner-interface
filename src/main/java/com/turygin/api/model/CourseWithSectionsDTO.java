package com.turygin.api.model;

import java.util.*;

/** Represents a course with sections. */
public class CourseWithSectionsDTO extends CourseDTO {

    /** Course sections. */
    SortedMap<Long,SectionDTO> sections = new TreeMap<>();

    /** Empty constructor. */
    public CourseWithSectionsDTO(){
        super();
    }

    /**
     * Instantiates a new course with sections.
     * @param course the course DTO
     */
    public CourseWithSectionsDTO(CourseDTO course) {
        super(course);
    }

    /**
     * Gets sections.
     * @return the sections
     */
    public SortedMap<Long,SectionDTO> getSections() {
        return sections;
    }

    /**
     * Sets sections.
     * @param sections the sections
     */
    public void setSections(SortedMap<Long,SectionDTO> sections) {
        this.sections = sections;
    }

    /**
     * Creates a string representation of the object.
     * @return description of course and sections
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CourseWithSectionsDTO {");
        builder.append(super.toString());
        builder.append("}, sections=[");
        List<String> sectionStrings = sections.values().stream().map(Object::toString).toList();
        builder.append(String.join(",", sectionStrings));
        builder.append("]}");
        return builder.toString();
    }
}
