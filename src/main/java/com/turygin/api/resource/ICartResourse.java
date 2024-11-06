package com.turygin.api.resource;

import com.turygin.api.model.CourseWithSectionsDTO;

import java.util.List;

public interface ICartResourse {
    List<CourseWithSectionsDTO> cartGetCourses(long userId);
    void cartAddCourseToCart(long userId, long courseId);
    void cartRemoveCourse(long userId, long courseId);
    CourseWithSectionsDTO cartUpdateCourse(long userId, long courseId, List<Long> sectionIds);
}
