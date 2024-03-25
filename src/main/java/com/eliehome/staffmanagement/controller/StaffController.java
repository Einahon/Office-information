package com.eliehome.staffmanagement.controller;

import com.eliehome.staffmanagement.entity.Staff;
import com.eliehome.staffmanagement.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StaffController {
    @Autowired
    private StaffService staffService;
    @PostMapping("/staffs")
    public Staff saveStaff(@RequestBody Staff staff){
        return staffService.saveStaff(staff);

    }
    @GetMapping("/staffs")
    public List<Staff> fetchStaffList(){
        return staffService.fetchStaffList();
    }
    @GetMapping("/staffs/{id}")

    public Staff fetchStaffById(@PathVariable("id") Long staffId){
        return staffService.fetchStaffById(staffId);
    }
    @DeleteMapping("/staffs/{id}")

    public String deleteStaffById(@PathVariable("id") Long staffId){
         staffService.deleteStaffById(staffId);
        return "Staff deleted sucessfully!!!";
    }
    @PutMapping("/staffs/{id}")
    public Staff updateStaff(@RequestBody Staff staff, @PathVariable("id") Long staffId){
        return staffService.updateStaff(staff, staffId);

    }
    @GetMapping("/staffs/name/{name}")

    public Staff fetchStaffByName(@PathVariable("name") String staffName){
        return staffService.fetchStaffByName(staffName);
    }
}
