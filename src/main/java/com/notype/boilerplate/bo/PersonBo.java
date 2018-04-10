package com.notype.boilerplate.bo;

import com.notype.boilerplate.view.Person;

public class PersonBo {

	public static Person givePersonName(String firstName, String lastName) {
		Person person = new Person();
		person.setName(firstName.toUpperCase());
		person.setLastName(lastName.toUpperCase());
		return person;
	}
	
}
