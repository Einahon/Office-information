package com.eliehome.staffmanagement.service;

import com.eliehome.staffmanagement.entity.Staff;
import com.eliehome.staffmanagement.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffRepository staffRepository;
    @Override
    public Staff saveStaff(Staff staff) {
        return staffRepository.save(staff);
    }

    @Override
    public List<Staff> fetchStaffList() {
        return staffRepository.findAll();
    }

    @Override
    public Staff fetchStaffById(Long staffId) {
        return staffRepository.findById(staffId).get();
    }

    @Override
    public void deleteStaffById(Long staffId) {
        staffRepository.deleteById(staffId);
    }

    @Override
    public Staff updateStaff(Staff staff, Long staffId) {
        Staff staf = staffRepository.findById(staffId).get();
        if(Objects.nonNull(staff.getStaffName()) &&
        !"".equalsIgnoreCase(staff.getStaffName())){
            staf.setStaffName(staff.getStaffName());
        }
        if(Objects.nonNull(staff.getStaffDepartment()) &&
                !"".equalsIgnoreCase(staff.getStaffDepartment())){
            staf.setStaffDepartment(staff.getStaffDepartment());
        }
        if(Objects.nonNull(staff.getStaffPhoneNumber()) &&
                !"".equalsIgnoreCase(staff.getStaffPhoneNumber())){
            staf.setStaffPhoneNumber(staff.getStaffPhoneNumber());
        }
        return staffRepository.save(staf);
    }

    @Override
    public Staff fetchStaffByName(String staffName) {
        return staffRepository.findByStaffNameIgnoreCase(staffName);
    }

}
