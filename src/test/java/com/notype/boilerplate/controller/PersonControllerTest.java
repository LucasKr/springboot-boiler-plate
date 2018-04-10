package com.notype.boilerplate.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.notype.boilerplate.view.Person;

@RunWith(SpringRunner.class)
@WebMvcTest(PersonController.class)
public class PersonControllerTest {

	@Autowired
    private MockMvc mockMvc;


    @Test
    public void testSayHelloWorld() throws Exception {
    	Person expected = new Person();
    	expected.setName("LUCAS");
    	expected.setLastName("KRUGER");
    	
    	MvcResult response = this.mockMvc.perform(get("/api/person?firstName=lucas&lastName=kruger").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(content().json("{\"name\":\"LUCAS\",\"lastName\":\"KRUGER\"}"))
                .andReturn();
    }
}
