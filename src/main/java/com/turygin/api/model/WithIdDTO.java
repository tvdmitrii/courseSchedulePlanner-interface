package com.turygin.api.model;

/**
 * A base class for all DTOs with IDs.
 */
public class WithIdDTO {
    protected long id;

    /** Default constructor. */
    public WithIdDTO(){}

    /**
     * Constructs DTO with ID.
     * @param id unique ID.
     */
    public WithIdDTO(long id) {
        this.id = id;
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
}
