package com.turygin.api.resource;

import jakarta.ws.rs.core.Response;

/** API resource interface for generating and viewing schedules. */
public interface IScheduleResource {

    /**
     * Generate and return all schedules based on user's cart.
     * @param userId database user ID
     * @return a list of schedule DTOs
     */
    Response getSchedules(long userId);
}
