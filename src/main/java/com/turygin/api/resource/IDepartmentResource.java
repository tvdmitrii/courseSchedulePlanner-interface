package com.turygin.api.resource;

import com.turygin.api.model.DepartmentDTO;
import jakarta.ws.rs.core.Response;

import java.util.List;

/** API resource interface for interacting with departments. */
public interface IDepartmentResource {

    /**
     * Fetches department data by department unique ID.
     * @param id unique department ID
     * @return information about the department
     */
    Response getDepartment(long id);

    /**
     * Fetches information about all available departments.
     * @return a list of department information objects
     */
    Response getAllDepartments();
}
