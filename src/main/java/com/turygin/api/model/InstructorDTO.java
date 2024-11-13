package com.turygin.api.model;

/** DTO that represents an instructor. */
public class InstructorDTO extends WithIdDTO {
    /** Full name of the instructor. */
    protected String name;

    /** Empty constructor. */
    public InstructorDTO() {
        super();
    }

    /**
     * Instantiates a new instructor DTO.
     * @param id unique ID
     * @param fullName full name of the instructor
     */
    public InstructorDTO(Long id, String fullName) {
        super(id);
        this.name = fullName;
    }

    /**
     * Gets instructor name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets instructor name.
     * @param name full name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Creates a string representation of the instance.
     * @return a string describing the instructor
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("InstructorDTO {id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append("}");
        return builder.toString();
    }
}
