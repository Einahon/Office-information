package com.eliehome.staffmanagement.service;

import com.eliehome.staffmanagement.entity.Staff;
import com.eliehome.staffmanagement.error.StaffNotFoundException;

import java.util.List;

public interface StaffService {
   public Staff saveStaff(Staff staff);

  public List<Staff> fetchStaffList();


    public Staff fetchStaffById(Long staffId) throws StaffNotFoundException;

   public void deleteStaffById(Long staffId);

   public Staff updateStaff(Staff staff, Long staffId);

   public Staff fetchStaffByName(String staffName);

   public Staff fetchStaffByStaffDepartment(String staffDepartment);
}
