package com.notype.boilerplate;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.notype.boilerplate.controller.PersonController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoilerPlateApplicationTests {

	@Autowired
    private PersonController controller;
	    
    @Test
    public void contextLoad() {
    	 assertThat(controller).isNotNull();
    }
}
