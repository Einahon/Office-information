package com.eliehome.officeInformation.service;

import com.eliehome.officeInformation.entity.Office;
import com.eliehome.officeInformation.repository.OfficeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class OfficeServiceTest {
    @Autowired
private OfficeService officeService;
//    @MockBean
//    private OfficeRepository officeRepository;
//    @BeforeEach
//    void setUp() {
//        Office office =
//                Office.builder()
//                        .staffName("David Diva")
//                        .staffDepartment("Prod")
//                        .staffPhoneNumber("513-303-0040")
//                        .staffId(1L)
//                        .build();
//
//        Mockito.when(officeRepository.findByStaffNameIgnoreCase("David Diva"))
//                .thenReturn(office);
//    }
//    @Test
//
//    public void whenValidStaffName_thenDepartmentIsCorrect(){
//        String staffName = "David Diva";
//        Office found = officeService.fetchStaffByName(staffName);
//        assertEquals(staffName, found.getStaffName());
//    }
}