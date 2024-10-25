package com.turygin.api.resource;

import com.turygin.api.model.DepartmentBasicDTO;

import java.util.List;

/**
 * Interface that defines a department resource and describes
 * the actions that can be performed on departments.
 */
public interface IDepartmentResource {

    /**
     * Fetches department data by department unique ID.
     * @param id unique department ID
     * @return information about the department
     */
    DepartmentBasicDTO getDepartment(long id);

    /**
     * Fetches information about all available departments.
     * @return a list of department information objects
     */
    List<DepartmentBasicDTO> getAllDepartments();
}
