package com.turygin.api.model;

/**
 * A base class for all DTOs with IDs.
 */
public class WithIdDTO {
    protected long id;

    /** Default constructor. */
    public WithIdDTO(){}

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
