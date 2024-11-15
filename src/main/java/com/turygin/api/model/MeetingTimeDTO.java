package com.turygin.api.model;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/** Represents section meeting time. */
public class MeetingTimeDTO {

    /** Meeting hours (12-hour format). */
    int hours;

    /** Meeting minutes. */
    int minutes;

    /** True if PM, false if AM. */
    boolean pastNoon;

    /** Empty constructor. */
    public MeetingTimeDTO() {}

    /**
     * Instantiates a meeting time object.
     * @param hours number of hours (12-hour format)
     * @param minutes number of minutes
     * @param pastNoon true if PM, false if AM
     */
    public MeetingTimeDTO(int hours, int minutes, boolean pastNoon) {
        this.hours = hours;
        this.minutes = minutes;
        this.pastNoon = pastNoon;
    }

    /**
     * Creates a meeting time object.
     * @param time meeting time
     */
    public MeetingTimeDTO(LocalTime time) {
        int hours24 = time.getHour();
        this.hours = hours24 > 12 ? hours24 - 12 : hours24;
        this.minutes = time.getMinute();
        this.pastNoon = hours24 >= 12;
    }

    /**
     * Gets the number of hours (12-hour format).
     * @return the number of hours 0-12
     */
    public int getHours() {
        return hours;
    }

    /**
     * Sets the number of hours (12-hour format).
     * @param hours the number of hours 0-12
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * Gets past noon field.
     * @return true if past noon, false otherwise
     */
    public boolean getPastNoon() {
        return pastNoon;
    }

    /**
     * Sets past noon field.
     * @param pastNoon true if past noon, false otherwise
     */
    public void setPastNoon(boolean pastNoon) {
        this.pastNoon = pastNoon;
    }

    /**
     * Gets minutes.
     * @return minutes
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * Sets minutes.
     * @param minutes minutes
     */
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    /**
     * Gets LocalTime in 24-hour format.
     * @return 24-hour time
     */
    public LocalTime getTime() {
        int hours24 = (pastNoon && hours != 12) ? hours + 12 : hours;
        return LocalTime.of(hours24, minutes);
    }

    /**
     * Creates 12-hour time string (e.g. 12:30 PM).
     * @return string representing time
     */
    @Override
    public String toString() {
        return getTime().format(DateTimeFormatter.ofPattern("h:mm a"));
    }
}
