package com.turygin.api.model;

/**
 * Sample course information data transfer object.
 * These will be tailored to WebApp needs.
 */
public class CourseBasicDTO extends WithIdDTO {

    /** Unique course code, e.g. CS 101. */
    protected String code;

    /** Course title. */
    protected String title;

    /** Course description. */
    protected String description;

    /** Number of credits. */
    protected int credits;

    /** ID of the associated department. */
    protected Long departmentId;

    /** Course number.*/
    protected int number;

    /** Default constructor. */
    public CourseBasicDTO(){
        super();
    }

    /**
     * Instantiates CourseDTO object.
     * @param id unique course code
     * @param code course code
     * @param title course title
     * @param description course description
     * @param credits number of course credits
     * @param departmentId ID of the associated department
     * @param number course number
     */
    public CourseBasicDTO(long id, String code, String title, String description, int credits, Long departmentId, int number) {
        super();
        this.id = id;
        this.code = code;
        this.title = title;
        this.description = description;
        this.credits = credits;
        this.departmentId = departmentId;
        this.number = number;
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

    /**
     * Gets department ID.
     * @return department ID
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * Sets department ID
     * @param departmentId department ID
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * Gets course number.
     * @return course number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets course number.
     * @param number course number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CourseBasicDTO {id=");
        builder.append(id);
        builder.append(", code=");
        builder.append(code);
        builder.append(", title=");
        builder.append(title);
        builder.append(", description=");
        builder.append(description);
        builder.append(", credits=");
        builder.append(credits);
        builder.append(", departmentId=");
        builder.append(departmentId);
        builder.append(", number=");
        builder.append(number);
        builder.append("}");
        return builder.toString();
    }
}
