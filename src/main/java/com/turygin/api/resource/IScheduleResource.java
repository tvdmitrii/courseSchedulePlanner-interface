package com.turygin.api.resource;

import jakarta.ws.rs.core.Response;

import java.util.List;

/** API resource interface for generating and viewing schedules. */
public interface IScheduleResource {

    /**
     * Generate and return all schedules based on user's cart.
     * @param userId database user ID
     * @return a list of courses and associated sections
     */
    Response getSchedules(long userId);
}
