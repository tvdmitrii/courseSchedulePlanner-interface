package com.turygin.api.model;

import java.util.*;
import java.util.stream.Stream;

public class CourseWithSectionsDTO extends CourseBasicDTO {

    SortedMap<Long,SectionDTO> sections = new TreeMap<>();

    public CourseWithSectionsDTO(){
        super();
    }

    public CourseWithSectionsDTO(CourseBasicDTO course) {
        super(course.getId(), course.getCode(), course.getTitle(), course.getDescription(), course.getCredits(),
                course.getDepartmentId(), course.getNumber());
    }

    public SortedMap<Long,SectionDTO> getSections() {
        return sections;
    }

    public void setSections(SortedMap<Long,SectionDTO> sections) {
        this.sections = sections;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CourseWithSectionsDTO {id=");
        builder.append(id);
        builder.append(", code=");
        builder.append(code);
        builder.append(", sections=[");
        List<String> sectionStrings = Stream.of(sections.values()).map(Object::toString).toList();
        builder.append(String.join(",", sectionStrings));
        builder.append("]}");
        return builder.toString();
    }
}
