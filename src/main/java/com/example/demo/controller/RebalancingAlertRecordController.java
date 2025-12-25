package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class RebalancingAlertControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void resolveAlert() throws Exception {
        mockMvc.perform(put("/api/alerts/resolve/1"))
                .andExpect(status().isOk());
    }
}
