package com.eliehome.staffmanagement.repository;

import com.eliehome.staffmanagement.entity.Staff;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest

class StaffRepositoryTest {
    @Autowired

    private StaffRepository staffRepository;
    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setUp() {
        Staff staff =
                Staff.builder()
                        .staffName("Theodore Zougla")
                        .staffDepartment("DEV")
                        .staffPhoneNumber("513-503-6000")
                        .build();

        entityManager.persist(staff);
    }
    @Test
    public void whenFindById_thenReturnStaff(){
        Staff staff = staffRepository.findById(1L).get();
        assertEquals(staff.getStaffName(), "Theodore Zougla");
    }
}