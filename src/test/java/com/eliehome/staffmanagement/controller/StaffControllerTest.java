package com.eliehome.staffmanagement.controller;

import com.eliehome.staffmanagement.entity.Staff;
import com.eliehome.staffmanagement.error.StaffNotFoundException;
import com.eliehome.staffmanagement.service.StaffService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(StaffController.class)

class StaffControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StaffService staffService;

    private Staff staff;

    @BeforeEach
    void setUp(){

        staff = Staff.builder()
                .staffPhoneNumber("513-303-0040")
                .staffDepartment("Prod")
                .staffName("David Diva")
                .staffId(1L)
                .build();
    }


    @Test
    void saveStaff() throws Exception {
       Staff inputStaff = Staff.builder()
                .staffPhoneNumber("513-700-0990")
                .staffDepartment("CE")
                .staffName("Deborah Kpakpo")
                .build();

       Mockito.when(staffService.saveStaff(inputStaff))
               .thenReturn(staff);

       mockMvc.perform(post("/staffs")
               .contentType(MediaType.APPLICATION_JSON)
               .content("{\n" +
                       "\t \"staffName\":\"Deborah Kpakpo\",\n" +
                       "\t\t\"staffDepartment\": \"CE\",\n" +
                       "\t\t\"staffPhoneNumber\": \"513-700-0990\"\n" +
                       "\t\n" +
                       "}"))
               .andExpect(status().isOk());
    }

    @Test
    void fetchStaffById() throws Exception {
        Mockito.when(staffService.fetchStaffById(1L))
                .thenReturn(staff);

        mockMvc.perform(get("/staffs/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.staffName").value(staff.getStaffName()));






    }
}