package com.turygin.api.model;

public class SectionDTO extends WithIdDTO {
    String daysOfTheWeek;
    String meetingTimes;
    String instructor;

    public SectionDTO(){
        super();
    }

    public SectionDTO(long id, String daysOfTheWeek, String meetingTimes, String instructor) {
        super();
        this.id = id;
        this.daysOfTheWeek = daysOfTheWeek;
        this.meetingTimes = meetingTimes;
        this.instructor = instructor;
    }

    public String getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    public void setDaysOfTheWeek(String daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getMeetingTimes() {
        return meetingTimes;
    }

    public void setMeetingTimes(String meetingTimes) {
        this.meetingTimes = meetingTimes;
    }
}
