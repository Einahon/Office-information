package com.eliehome.staffmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long staffId;
    private String staffName;
    private String staffDepartment;
    private String staffPhoneNumber;

    public long getStaffId() {
        return staffId;
    }

    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffDepartment() {
        return staffDepartment;
    }

    public void setStaffDepartment(String staffDepartment) {
        this.staffDepartment = staffDepartment;
    }

    public String getStaffPhoneNumber() {
        return staffPhoneNumber;
    }

    public void setStaffPhoneNumber(String staffPhoneNumber) {
        this.staffPhoneNumber = staffPhoneNumber;
    }

    public Staff(long staffId, String staffName, String staffDepartment, String staffPhoneNumber) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.staffDepartment = staffDepartment;
        this.staffPhoneNumber = staffPhoneNumber;
    }
    public Staff(){

    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", staffName='" + staffName + '\'' +
                ", staffDepartment='" + staffDepartment + '\'' +
                ", staffPhoneNumber='" + staffPhoneNumber + '\'' +
                '}';
    }
}
