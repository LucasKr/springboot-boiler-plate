package com.notype.boilerplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.notype.boilerplate.bo.PersonBo;
import com.notype.boilerplate.view.Person;

@Controller
@RequestMapping("/api")
public class PersonController {

	@GetMapping(value = {"/person"})
	@ResponseBody
    public Person getPerson(@RequestParam(value="firstName", required=true) String firstName, @RequestParam(value="lastName", required=true) String lastName) {
		return PersonBo.givePersonName(firstName, lastName);
    }
}
