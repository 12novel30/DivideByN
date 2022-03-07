package com.spring.mydiv.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mydiv.Dao.PersonDao;
import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDao personDao;
		
	@Override
	public String CreatePerson(Person person) {
		personDao.insert(person);
		
		return "Service --> DAO : Success";
	}
	
	@Override
	public void UpdatePerson(Person person) {
		personDao.update(person);
	}
	
	@Override
	public void get_difference(Person person) {
		get_sumSend(person);
		get_sumGet(person);
		person.setDifference((int)(person.getSumGet() - person.getSumSend()));
		UpdatePerson(person);
	}

	public void get_sumSend(Person person) {
		person.setSumSend(0);
		for(Event event : person.getWillSend()) {
			person.setSumSend( person.getSumSend() + event.getDividePrice() );
		}
		UpdatePerson(person);
	}
	
	public void get_sumGet(Person person) {
		person.setSumGet(0);
		for(Event event : person.getWillGet()) {
			person.setSumGet(person.getSumGet() + event.getPrice());
		}
		UpdatePerson(person);
	}
	
	// not yet print
}
