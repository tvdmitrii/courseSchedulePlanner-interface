package com.turygin.api.model;


import java.util.ArrayList;
import java.util.List;

/** Represents section meeting times. */
public class DaysOfWeekDTO {
    /** Indicates whether the section meets on each of the 5 days. */
    Boolean[] daysOfWeek = new Boolean[]{false, false, false, false, false};

    /** Empty constructor. */
    public DaysOfWeekDTO() {}

    /**
     * Instantiates days of the week DTO object.
     * @param daysOfWeek an array of 5 days with true for each of the selected days
     */
    public DaysOfWeekDTO(Boolean[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    /**
     * Gets days of week.
     * @return days of week array
     */
    public Boolean[] getDaysOfWeek() {
        return daysOfWeek;
    }

    /**
     * Sets days of week.
     * @param daysOfWeek days of week array
     */
    public void setDaysOfWeek(Boolean[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    /**
     * Creates a comma separated string of selected days (e.g. M, W, F).
     * @return string of selected days
     */
    @Override
    public String toString() {
        String[] dayNames = {"M", "Tu", "We", "Th", "F"};
        List<String> selectedDays = new ArrayList<>();
        for(int i = 0; i < daysOfWeek.length; i++) {
            if(daysOfWeek[i]) {
                selectedDays.add(dayNames[i]);
            }
        }
        return String.join(", ", selectedDays);
    }
}
