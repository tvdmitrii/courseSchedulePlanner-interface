package com.turygin.api.model;

public class SectionWithCourseDTO extends SectionDTO{
    protected CourseDTO course;

    public SectionWithCourseDTO() {
        super();
    }

    public SectionWithCourseDTO(SectionDTO sectionDTO, CourseDTO course) {
        super(sectionDTO);
        this.course = course;
    }

    public CourseDTO getCourse() {
        return course;
    }

    public void setCourse(CourseDTO course) {
        this.course = course;
    }
}
