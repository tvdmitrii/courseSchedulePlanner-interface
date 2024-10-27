package com.turygin.api.model;

public class UserDTO extends WithIdDTO {

    /** Indicates whether this is a new user. */
    private boolean isNewUser;

    /** Indicates whether the user is admin. */
    private boolean isAdmin;

    /** Default constructor. */
    public UserDTO(){
        super();
    }

    /**
     * Instantiates a user DTO.
     * @param id database user id
     * @param isNewUser indicates whether the user was created in this session
     * @param isAdmin indicates whether the user has administrator privileges
     */
    public UserDTO(long id, boolean isNewUser, boolean isAdmin) {
        super();
        this.id = id;
        this.isNewUser = isNewUser;
        this.isAdmin = isAdmin;
    }

    /**
     * Is admin boolean.
     * @return the boolean
     */
    public boolean isAdmin() {
        return isAdmin;
    }

    /**
     * Sets admin.
     * @param admin the admin
     */
    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    /**
     * Is new user boolean.
     * @return the boolean
     */
    public boolean isNewUser() {
        return isNewUser;
    }

    /**
     * Sets new user.
     * @param newUser the new user
     */
    public void setNewUser(boolean newUser) {
        isNewUser = newUser;
    }
}