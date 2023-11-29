package com.grpc.ums.entities;

public class Student {

    private long student_id;
    private String name;
    private String email;

    private String address;
    private String phone;

    public Student() {
    }

    public Student(long student_id, String name, String email, String address, String phone) {
        this.student_id = student_id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(long student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {

            return "Student{" +
                    "student_id=" + student_id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", address='" + address + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
    }
}
