package com.turygin.api.model;

/** Represents course section DTO. */
public class SectionDTO extends WithIdDTO {

    /** Days of the week section meetings. */
    DaysOfWeekDTO daysOfWeek = new DaysOfWeekDTO();

    /** Meeting start time. */
    MeetingTimeDTO startTime = new MeetingTimeDTO();

    /** Meeting end time. */
    MeetingTimeDTO endTime = new MeetingTimeDTO();

    /** Section instructor. */
    InstructorDTO instructor = new InstructorDTO();

    /** Indicates whether the section is in user's cart. */
    boolean isSelected;

    /** Empty constructor. */
    public SectionDTO(){
        super();
    }

    /**
     * Instantiates new section DTO object.
     * @param id         unique section ID
     * @param daysOfWeek days of the week section meets
     * @param startTime  meeting start time
     * @param endTime    meeting end time
     * @param instructor section instructor
     */
    public SectionDTO(long id, DaysOfWeekDTO daysOfWeek, MeetingTimeDTO startTime, MeetingTimeDTO endTime,
                      InstructorDTO instructor) {
        super(id);
        this.daysOfWeek = daysOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
        this.instructor = instructor;
        this.isSelected = false;
    }

    /**
     * Gets days of week.
     * @return the days of week
     */
    public DaysOfWeekDTO getDaysOfWeek() {
        return daysOfWeek;
    }

    /**
     * Sets days of week.
     * @param daysOfWeek the days of week
     */
    public void setDaysOfWeek(DaysOfWeekDTO daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    /**
     * Gets end time.
     * @return the end time
     */
    public MeetingTimeDTO getEndTime() {
        return endTime;
    }

    /**
     * Sets end time.
     * @param endTime the end time
     */
    public void setEndTime(MeetingTimeDTO endTime) {
        this.endTime = endTime;
    }

    /**
     * Gets instructor.
     * @return the instructor
     */
    public InstructorDTO getInstructor() {
        return instructor;
    }

    /**
     * Sets instructor.
     * @param instructor the instructor
     */
    public void setInstructor(InstructorDTO instructor) {
        this.instructor = instructor;
    }

    /**
     * Gets start time.
     * @return the start time
     */
    public MeetingTimeDTO getStartTime() {
        return startTime;
    }

    /**
     * Sets start time.
     * @param startTime the start time
     */
    public void setStartTime(MeetingTimeDTO startTime) {
        this.startTime = startTime;
    }

    /**
     * Gets whether the section is selected in user's cart.
     * @return true if selected, false otherwise
     */
    public boolean getIsSelected() {
        return isSelected;
    }

    /**
     * Sets whether the section is selected in user's cart.
     * @param selected true if selected, false otherwise
     */
    public void setIsSelected(boolean selected) {
        isSelected = selected;
    }

    /**
     * Gets user-friendly string showing meeting start and end.
     * @return meeting start and end.
     */
    public String getMeetingTime() {
        return String.format("%s to %s", startTime.toString(), endTime.toString());
    }

    /**
     * Creates a string representation of the section DTO.
     * @return section DTO description
     */
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("SectionDTO {id=");
        builder.append(id);
        builder.append(", daysOfTheWeek=");
        builder.append(daysOfWeek.toString());
        builder.append(", meetingTime=");
        builder.append(getMeetingTime());
        builder.append(", instructor=");
        builder.append(instructor.toString());
        builder.append(", isSelected=");
        builder.append(isSelected);
        builder.append("}");
        return builder.toString();
    }
}
