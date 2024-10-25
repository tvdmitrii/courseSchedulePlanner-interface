package com.turygin.api.model;

public class DepartmentBasicDTO extends WithIdDTO {
    /** Department code. */
    private String code;

    /** Department name. */
    private String name;

    /**
     * Instantiates DepartmentBasicDTO object.
     * @param id unique department id
     * @param code department unique code
     * @param name department name
     */
    public DepartmentBasicDTO(long id, String code, String name) {
        super();
        this.id = id;
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
}
