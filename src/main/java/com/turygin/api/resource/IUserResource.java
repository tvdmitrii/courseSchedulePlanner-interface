package com.turygin.api.resource;

import com.turygin.api.model.UserDTO;

/**
 * Interface that defines a user resource and describes
 * the actions that can be performed on users.
 */
public interface IUserResource {

    /**
     * Creates a new user if one does not already exist
     * and returns the associated information.
     * @param uuid cognito uuid
     * @return user information
     */
    UserDTO createUserIfNotExists(String uuid);
}

