package com.turygin.api.model;

import java.util.ArrayList;
import java.util.List;

/** Represents section meeting times. */
public class DaysOfWeekDTO {
    /** Indicates whether the section meets on each of the 5 days. */
    List<Boolean> daysOfWeek = new ArrayList<Boolean>(5);

    /** Empty constructor. */
    public DaysOfWeekDTO() {}

    /**
     * Instantiates days of the week DTO object.
     * @param daysOfWeek a list of 5 days with true for each of the selected days
     */
    public DaysOfWeekDTO(List<Boolean> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    /**
     * Gets days of week.
     * @return days of week list
     */
    public List<Boolean> getDaysOfWeek() {
        return daysOfWeek;
    }

    /**
     * Sets days of week.
     * @param daysOfWeek days of week list
     */
    public void setDaysOfWeek(List<Boolean> daysOfWeek) {
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
        for(int i = 0; i < daysOfWeek.size(); i++) {
            if(daysOfWeek.get(i)) {
                selectedDays.add(dayNames[i]);
            }
        }
        return String.join(", ", selectedDays);
    }
}
