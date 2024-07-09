package com.hisyam.springboot.demo.mycoolapp.entity;

import jakarta.persistence.Column;

public class StudentPOJO {
    private String firstName;

    private String lastName;

    public StudentPOJO() {
    }

    public StudentPOJO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
