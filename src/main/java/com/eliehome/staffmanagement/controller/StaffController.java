package com.eliehome.staffmanagement.controller;

import com.eliehome.staffmanagement.entity.Staff;
import com.eliehome.staffmanagement.error.StaffNotFoundException;
import com.eliehome.staffmanagement.service.StaffService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StaffController {
    @Autowired
    private StaffService staffService;
    private final Logger LOGGER = LoggerFactory.getLogger(StaffController.class);
    @PostMapping("/staffs")
    public Staff saveStaff(@Valid @RequestBody Staff staff){
        LOGGER.info("Inside saveStaff of staffController");
        return staffService.saveStaff(staff);

    }
    @GetMapping("/staffs")
    public List<Staff> fetchStaffList(){
        LOGGER.info("Inside fetchStaffList of staffController");
        return staffService.fetchStaffList();
    }
    @GetMapping("/staffs/{id}")

    public Staff fetchStaffById(@PathVariable("id") Long staffId) throws StaffNotFoundException {
        LOGGER.info("Inside fetchStaffById of staffController");
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
        LOGGER.info("Inside fetchStaffByName of staffController");
        return staffService.fetchStaffByName(staffName);
    }
    @GetMapping("/staffs/staffDepartment/{staffDepartment}")
    public Staff fetchStaffByStaffDepartment(@PathVariable("staffDepartment") String staffDepartment ){
        return staffService.fetchStaffByStaffDepartment(staffDepartment);

    }
}
