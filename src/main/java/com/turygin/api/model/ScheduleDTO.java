package com.turygin.api.model;

import java.util.ArrayList;
import java.util.List;

/** Schedule information object. Contains a list of section with course DTOs. */
public class ScheduleDTO extends WithIdDTO {

    /** The list of sections comprising the schedule and associated courses. */
    List<SectionWithCourseDTO> sections = new ArrayList<>();

    /** Empty constructor. */
    public ScheduleDTO(){
        super();
    }

    /**
     * Instantiates a schedule DTO.
     * @param id schedule id
     */
    public ScheduleDTO(long id){
        super(id);
    }

    /**
     * Gets sections.
     * @return the sections
     */
    public List<SectionWithCourseDTO> getSections() {
        return sections;
    }

    /**
     * Sets sections.
     * @param sections the sections
     */
    public void setSections(List<SectionWithCourseDTO> sections) {
        this.sections = sections;
    }

    /**
     * Creates a string representation of the schedule DTO.
     * @return schedule DTO description
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ScheduleDTO {id=");
        builder.append(id);
        builder.append(", sections=[");
        List<String> sectionStrings = sections.stream().map(Object::toString).toList();
        builder.append(String.join(",", sectionStrings));
        builder.append("]}");
        return builder.toString();
    }
}
