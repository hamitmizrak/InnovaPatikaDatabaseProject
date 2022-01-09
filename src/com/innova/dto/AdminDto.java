package com.innova.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
//MVC
//Model
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class AdminDto {
    private int adminID;
    private String adminName;
    private String adminSurname;
    private Date createdDate;

    public AdminDto() {
    }

    public AdminDto(String adminName, String adminSurname) {
        this.adminName = adminName;
        this.adminSurname = adminSurname;
    }

    @Override
    public String toString() {
        return "AdminDto{" +
                "adminID=" + adminID +
                ", adminName='" + adminName + '\'' +
                ", adminSurname='" + adminSurname + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }

    public int getAdminID() {
        return adminID;
    }

    public AdminDto setAdminID(int adminID) {
        this.adminID = adminID;
        return this;
    }

    public String getAdminName() {
        return adminName;
    }

    public AdminDto setAdminName(String adminName) {
        this.adminName = adminName;
        return this;
    }

    public String getAdminSurname() {
        return adminSurname;
    }

    public AdminDto setAdminSurname(String adminSurname) {
        this.adminSurname = adminSurname;
        return this;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public AdminDto setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }
}
