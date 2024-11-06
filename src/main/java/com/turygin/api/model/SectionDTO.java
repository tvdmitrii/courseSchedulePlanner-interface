package com.turygin.api.model;

public class SectionDTO extends WithIdDTO {
    String daysOfTheWeek;
    String meetingTimes;
    String instructor;
    boolean isSelected;

    public SectionDTO(){
        super();
    }

    public SectionDTO(long id, String daysOfTheWeek, String meetingTimes, String instructor) {
        super();
        this.id = id;
        this.daysOfTheWeek = daysOfTheWeek;
        this.meetingTimes = meetingTimes;
        this.instructor = instructor;
        this.isSelected = false;
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

    public boolean getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(boolean selected) {
        isSelected = selected;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("SectionDTO {id=");
        builder.append(id);
        builder.append(", daysOfTheWeek=");
        builder.append(daysOfTheWeek);
        builder.append(", meetingTimes=");
        builder.append(meetingTimes);
        builder.append(", instructor=");
        builder.append(instructor);
        builder.append(", isSelected=");
        builder.append(isSelected);
        builder.append("}");
        return builder.toString();
    }
}
