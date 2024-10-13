package com.turygin.api.model;

/**
 * Sample course information data transfer object.
 * These will be tailored to WebApp needs.
 */
public class CourseDTO {

    /** Unique course code, e.g. CS 101. */
    private String code;

    /** Course title. */
    private String title;

    /** Empty constructor. */
    public CourseDTO() {}

    /**
     * Instantiates CourseDTO object.
     * @param code unique course code
     * @param title course title
     */
    public CourseDTO(String code, String title) {
        this.code = code;
        this.title = title;
    }

    /**
     * Gets title.
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets code.
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets code.
     * @param code the code
     */
    public void setCode(String code) {
        this.code = code;
    }
}
