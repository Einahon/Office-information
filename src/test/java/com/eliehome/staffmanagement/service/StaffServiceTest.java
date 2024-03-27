package com.eliehome.staffmanagement.service;

import com.eliehome.staffmanagement.entity.Staff;
import com.eliehome.staffmanagement.repository.StaffRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StaffServiceTest {
    @Autowired
private StaffService staffService;
    @MockBean
    private StaffRepository staffRepository;
    @BeforeEach
    void setUp() {
        Staff staff =
                Staff.builder()
                        .staffName("David Diva")
                        .staffDepartment("Prod")
                        .staffPhoneNumber("513-303-0040")
                        .staffId(1L)
                        .build();

        Mockito.when(staffRepository.findByStaffNameIgnoreCase("David Diva"))
                .thenReturn(staff);
    }
    @Test

    public void whenValidStaffName_thenDepartmentIsCorrect(){
        String staffName = "David Diva";
        Staff found = staffService.fetchStaffByName(staffName);
        assertEquals(staffName, found.getStaffName());
    }
}