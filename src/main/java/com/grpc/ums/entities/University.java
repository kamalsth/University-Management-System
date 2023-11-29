package com.grpc.ums.entities;

public class University {
    private Long university_id;
    private String name;
    private String location;
    private Student student;
    private Department department;

    public University(Long university_id, String name, String location, Student student, Department department) {
        this.university_id = university_id;
        this.name = name;
        this.location = location;
        this.student = student;
        this.department = department;
    }

    public Long getUniversity_id() {
        return university_id;
    }

    public void setUniversity_id(Long university_id) {
        this.university_id = university_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
