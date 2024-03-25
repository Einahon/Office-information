package com.eliehome.staffmanagement.repository;

import com.eliehome.staffmanagement.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
    public Staff findByStaffName(String staffName);
    public Staff findByStaffNameIgnoreCase(String staffName);

}
