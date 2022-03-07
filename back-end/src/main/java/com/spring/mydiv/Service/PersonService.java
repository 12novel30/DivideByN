package com.spring.mydiv.Service;

import com.spring.mydiv.Dto.Person;

public interface PersonService {
	public String CreatePerson(Person person);
	void UpdatePerson(Person person);
	void get_difference(Person person);
}
