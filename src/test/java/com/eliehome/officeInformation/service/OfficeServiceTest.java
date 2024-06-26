package com.eliehome.officeInformation.service;

import com.eliehome.officeInformation.entity.Office;
import com.eliehome.officeInformation.error.OfficeNotFoundException;
import com.eliehome.officeInformation.repository.OfficeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class OfficeServiceTest {
    @Autowired
private OfficeService officeService;
    @MockBean
    private OfficeRepository officeRepository;
    @BeforeEach
    void setUp() {
        Office office =
                Office.builder()
                        .address("03 Reinke Trail")
                        .state("OH")
                        .city("Cincinnati")
                        .manager("Dossou Joseph")
                        .office_id(1L)
                        .build();

        Mockito.when(officeRepository.findByManagerIgnoreCase("Dossou Joseph"))
                .thenReturn(office);
    }
    @Test

    public void whenValidManager_thenOfficeIsCorrect() throws OfficeNotFoundException {
        String manager = "Dossou Joseph";
        Office found = officeService.fetchOfficeByManager(manager);
        assertEquals(manager, found.getManager());
    }
}