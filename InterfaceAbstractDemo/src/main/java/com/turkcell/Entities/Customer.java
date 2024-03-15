package com.turkcell.Entities;

import java.util.Date;

public class Customer {

    public int Id;
    public String FirstName;
    public String LastName;
    public Date DateOfBirth;
    public String NationalityId;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }
}
