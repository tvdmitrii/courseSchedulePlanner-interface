package com.turygin.api.model;

/**
 * Course information data transfer object.
 * Does not contain section information.
 */
public class CourseDTO extends WithIdDTO {

    /** Course title. */
    protected String title;

    /** Course description. */
    protected String description;

    /** Number of credits. */
    protected int credits;

    /** Course number.*/
    protected int number;

    /** Associated department. */
    protected DepartmentDTO department;

    /** Default constructor. */
    public CourseDTO(){
        super();
    }

    /**
     * Instantiates CourseDTO object.
     * @param id unique course code
     * @param title course title
     * @param description course description
     * @param credits number of course credits
     * @param number course number
     * @param department associated department DTO
     */
    public CourseDTO(long id, String title, String description, int credits, int number,
                     DepartmentDTO department) {
        super(id);
        this.title = title;
        this.description = description;
        this.credits = credits;
        this.number = number;
        this.department = department;
    }

    /**
     * Copy constructor.
     * @param courseDTO course to copy
     */
    public CourseDTO(CourseDTO courseDTO) {
        super(courseDTO.getId());
        this.title = courseDTO.getTitle();
        this.description = courseDTO.getDescription();
        this.credits = courseDTO.getCredits();
        this.number = courseDTO.getNumber();
        this.department = courseDTO.getDepartment();
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
     * Constructs course code.
     * @return the course code
     */
    public String getCode() {
        return department != null ? String.format("%s %d", department.getCode(), number) : "";
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
     * Gets department.
     * @return department
     */
    public DepartmentDTO getDepartment() {
        return department;
    }

    /**
     * Sets department.
     * @param department department DTO
     */
    public void setDepartment(DepartmentDTO department) {
        this.department = department;
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

    /**
     * Creates a string representation of the instance.
     * @return a string describing the course
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CourseBasicDTO {id=");
        builder.append(id);
        builder.append(", title=");
        builder.append(title);
        builder.append(", description=");
        builder.append(description);
        builder.append(", credits=");
        builder.append(credits);
        builder.append(", number=");
        builder.append(number);
        builder.append(", department=");
        builder.append(department != null ? department.toString(): "{}");
        builder.append("}");
        return builder.toString();
    }
}
