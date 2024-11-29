package com.turygin.api.model;

/**
 * Stores course information in addition to section information.
 */
public class SectionWithCourseDTO extends SectionDTO {

    /** Associated section course. */
    protected CourseDTO course;

    /** Empty constructor. */
    public SectionWithCourseDTO() {
        super();
    }

    /**
     * Instantiates a section with course object.
     * @param sectionDTO the section DTO
     * @param course     the course DTO
     */
    public SectionWithCourseDTO(SectionDTO sectionDTO, CourseDTO course) {
        super(sectionDTO);
        this.course = course;
    }

    /**
     * Gets course.
     * @return the course
     */
    public CourseDTO getCourse() {
        return course;
    }

    /**
     * Sets course.
     * @param course the course
     */
    public void setCourse(CourseDTO course) {
        this.course = course;
    }

    /**
     * Creates a string representation of the section with course DTO.
     * @return section with course DTO description
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("SectionWithCourseDTO {");
        builder.append(super.toString());
        builder.append(", course=").append(course.toString());
        builder.append("}");
        return builder.toString();
    }
}
