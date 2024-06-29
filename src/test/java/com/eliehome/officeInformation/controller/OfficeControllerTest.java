package com.eliehome.officeInformation.controller;

import com.eliehome.officeInformation.entity.Office;
import com.eliehome.officeInformation.service.OfficeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(OfficeController.class)

class OfficeControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private OfficeService officeService;

    private Office office;

    @BeforeEach
    void setUp(){

        office = Office.builder()
                .address("07 driveways")
                .state("Taxes")
                .city("Huston")
                .manager("Sohounde Emmanuel")
                .office_id(1L)
                .build();
//                .staffPhoneNumber("513-303-0040")
//                .staffDepartment("Prod")
//                .staffName("David Diva")
//                .staffId(1L)
//                .build();
    }
//
//
    @Test
    void saveOffice() throws Exception {
       Office inputOffice = Office.builder()
                .address("07 driveways")
                .state("Taxes")
                .city("Huston")
                .manager("Sohounde Emmanuel")
                .build();
//                .staffPhoneNumber("513-700-0990")
//                .staffDepartment("CE")
//                .staffName("Deborah Kpakpo")
//                .build();
//
       Mockito.when(officeService.saveOffice(inputOffice))
               .thenReturn(office);

       mockMvc.perform(post("/offices")
               .contentType(MediaType.APPLICATION_JSON)
               .content("{\n" +
                      "\t\"address\":\"07 driveways\",\n" +
                       "\t \"manager\":\"Sohounde Emmanuel\",\n" +
                       "\t\t\"city\": \"Huston\",\n" +
                       "\t\t\"state\": \"Taxes\"\n" +
                       "\t\n" +
                       "}"))
               .andExpect(status().isOk());
    }
//
    @Test
    void fetchOfficeById() throws Exception {
        Mockito.when(officeService.fetchOfficeById(1L))
                .thenReturn(office);

        mockMvc.perform(get("/offices/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.manager").value(office.getManager()));






    }
}