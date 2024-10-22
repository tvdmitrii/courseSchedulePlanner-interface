package com.turygin.api.model;

/**
 * Sample course information data transfer object.
 * These will be tailored to WebApp needs.
 */
public class CourseBasicDTO {

    private long id;

    /** Unique course code, e.g. CS 101. */
    private String code;

    /** Course title. */
    private String title;

    /** Course description. */
    private String description;

    /** Number of credits. */
    private int credits;

    /** Empty constructor. */
    public CourseBasicDTO() {}

    /**
     * Instantiates CourseDTO object.
     * @param code unique course code
     * @param title course title
     */
    public CourseBasicDTO(long id, String code, String title, String description, int credits) {
        this.id = id;
        this.code = code;
        this.title = title;
        this.description = description;
        this.credits = credits;
    }

    /**
     * Gets id.
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets id.
     * @param id the id
     */
    public void setId(long id) {
        this.id = id;
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

    /**
     * Gets credits.
     * @return the credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Sets credits.
     * @param credits the credits
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    /**
     * Gets description.
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
