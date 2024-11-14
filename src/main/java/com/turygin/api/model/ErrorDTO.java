package com.turygin.api.model;

import jakarta.ws.rs.core.Response;

/**
 * Represents API error.
 */

public class ErrorDTO {

    /** HTTP response status code. */
    private int status;

    /** Error message. */
    private String message;

    /**
     * Empty constructor.
     */
    public ErrorDTO() {}

    /**
     * Instantiates a new error object.
     * @param status  HTTP response status code from Jersey
     * @param message error message
     */
    public ErrorDTO(Response.Status status, String message) {
        this.status = status.getStatusCode();
        this.message = message;
    }


    /**
     * Gets error message.
     * @return the error message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets error message.
     * @param message the error message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets HTTP status code.
     * @return the HTTP status code
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the HTTP status code.
     * @param status the HTTP status code
     */
    public void setStatus(int status) {
        this.status = status;
    }
}
