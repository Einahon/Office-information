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

//@WebMvcTest(StaffController.class)
//
//class OfficeControllerTest {
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private OfficeService officeService;
//
//    private Office office;
//
//    @BeforeEach
//    void setUp(){
//
//        office = Office.builder()
//                .staffPhoneNumber("513-303-0040")
//                .staffDepartment("Prod")
//                .staffName("David Diva")
//                .staffId(1L)
//                .build();
//    }
//
//
//    @Test
//    void saveStaff() throws Exception {
//       Office inputOffice = Office.builder()
//                .staffPhoneNumber("513-700-0990")
//                .staffDepartment("CE")
//                .staffName("Deborah Kpakpo")
//                .build();
//
//       Mockito.when(officeService.saveStaff(inputOffice))
//               .thenReturn(office);
//
//       mockMvc.perform(post("/staffs")
//               .contentType(MediaType.APPLICATION_JSON)
//               .content("{\n" +
//                       "\t \"staffName\":\"Deborah Kpakpo\",\n" +
//                       "\t\t\"staffDepartment\": \"CE\",\n" +
//                       "\t\t\"staffPhoneNumber\": \"513-700-0990\"\n" +
//                       "\t\n" +
//                       "}"))
//               .andExpect(status().isOk());
//    }
//
//    @Test
//    void fetchStaffById() throws Exception {
//        Mockito.when(officeService.fetchStaffById(1L))
//                .thenReturn(office);
//
//        mockMvc.perform(get("/staffs/1")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.staffName").value(office.getStaffName()));
//
//
//
//
//
//
//    }
//}