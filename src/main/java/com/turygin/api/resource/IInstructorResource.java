package com.turygin.api.resource;

import jakarta.ws.rs.core.Response;

/** API resource interface for interacting with instructors. */
public interface IInstructorResource {

    /**
     * Fetches information about all available instructors.
     * @return a list of instructor DTOs
     */
    Response getAllInstructors();
}
