package com.eliehome.staffmanagement.service;

import com.eliehome.staffmanagement.entity.Staff;

import java.util.List;

public interface StaffService {
   public Staff saveStaff(Staff staff);

  public List<Staff> fetchStaffList();


    public Staff fetchStaffById(Long staffId);

   public void deleteStaffById(Long staffId);

   public Staff updateStaff(Staff staff, Long staffId);

   public Staff fetchStaffByName(String staffName);
}
