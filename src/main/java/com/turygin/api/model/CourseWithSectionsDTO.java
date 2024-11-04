package com.turygin.api.model;

import java.util.ArrayList;
import java.util.List;

public class CourseWithSectionsDTO extends CourseBasicDTO {

    List<SectionDTO> sections = new ArrayList<>();

    public CourseWithSectionsDTO(){
        super();
    }

    public CourseWithSectionsDTO(CourseBasicDTO course) {
        super(course.getId(), course.getCode(), course.getTitle(), course.getDescription(), course.getCredits());
    }

    public CourseWithSectionsDTO(long id, String code, String title, String description, int credits) {
        super(id, code, title, description, credits);
    }

    public List<SectionDTO> getSections() {
        return sections;
    }

    public void setSections(List<SectionDTO> sections) {
        this.sections = sections;
    }
}
