package com.eliehome.officeInformation.repository;

import com.eliehome.officeInformation.entity.Office;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

//@DataJpaTest
//
//class OfficeRepositoryTest {
//    @Autowired
//
//    private OfficeRepository officeRepository;
//    @Autowired
//    private TestEntityManager entityManager;
//
//    @BeforeEach
//    void setUp() {
//        Office office =
//                Office.builder()
//                        .staffName("Theodore Zougla")
//                        .staffDepartment("DEV")
//                        .staffPhoneNumber("513-503-6000")
//                        .build();
//
//        entityManager.persist(office);
//    }
//    @Test
//    public void whenFindById_thenReturnStaff(){
//        Office office = officeRepository.findById(1L).get();
//        assertEquals(office.getStaffName(), "Theodore Zougla");
//    }
//}