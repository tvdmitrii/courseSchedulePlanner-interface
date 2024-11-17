package com.turygin.api.resource;

import jakarta.ws.rs.core.Response;

/** API resource interface for interacting with users. */
public interface IUserResource {

    /**
     * Creates a new user if one does not already exist
     * and returns the associated information.
     * @param uuid cognito uuid
     * @return user information
     */
    Response createUserIfNotExists(String uuid);
}

