package com.turygin.api.model;

import java.util.ArrayList;
import java.util.List;

public class ScheduleDTO extends WithIdDTO {

    List<SectionWithCourseDTO> sections = new ArrayList<>();

    public ScheduleDTO(){
        super();
    }

    public ScheduleDTO(long id){
        super(id);
    }

    public List<SectionWithCourseDTO> getSections() {
        return sections;
    }

    public void setSections(List<SectionWithCourseDTO> sections) {
        this.sections = sections;
    }
}
