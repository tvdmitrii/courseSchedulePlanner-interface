package com.turygin.api.model;

/** Represents department DTO. */
public class DepartmentDTO extends WithIdDTO {

    /** Department code. */
    private String code;

    /** Department name. */
    private String name;

    /** Default constructor. */
    public DepartmentDTO(){
        super();
    }

    /**
     * Instantiates Department DTO object.
     * @param id unique department id
     * @param code department unique code
     * @param name department name
     */
    public DepartmentDTO(long id, String code, String name) {
        super(id);
        this.code = code;
        this.name = name;
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
     * Gets name.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Creates a string representation of the instance.
     * @return a string describing the department
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DepartmentDTO {id=");
        builder.append(id);
        builder.append(", code=");
        builder.append(code);
        builder.append(", name=");
        builder.append(name);
        builder.append("}");
        return builder.toString();
    }
}
