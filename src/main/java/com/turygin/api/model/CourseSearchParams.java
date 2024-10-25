package com.turygin.api.model;

public class CourseSearchParams {

    private String title;
    private long departmentId = -1;

    public CourseSearchParams(String title, long departmentId) {
        this.title = title;
        this.departmentId = departmentId;
    }

    public boolean hasTitle() {
        return title != null && !title.isEmpty();
    }

    public boolean hasDepartmentId() {
        return departmentId > 0;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
