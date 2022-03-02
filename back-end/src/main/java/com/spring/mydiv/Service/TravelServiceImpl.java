package com.spring.mydiv.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mydiv.Dao.TravelDao;
import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;
import com.spring.mydiv.Dto.Travel;


@Service
public class TravelServiceImpl implements TravelService {
	@Autowired
	private TravelDao travelDao;
	
	@Autowired
	private PersonService personService;
	
	@Override
	public String CreateTravel(Travel travel) {
		travelDao.insert(travel);
		
		return "Service --> DAO : Success";
	}
	
	@Override
	public void getPerson(Person person) {
		Travel travel = travelDao.select(1);
		travel.getPersonALL().add(person);
		travelDao.update(travel);
		
	}
	
	@Override
	public void getEvent(Event event) {
		Travel travel = travelDao.select(1);
		travel.getEventALL().add(event);
		travelDao.update(travel);
		
	}
	
	@Override
	public void setRole() {
		Travel travel = travelDao.select(1);
		double max_difference = 0;
		Person Leader = travel.getLeader();
		Leader = null;
		
		for(Person person : travel.getPersonALL()) {
			if(person.getDifference() < 0) {
				person.setRole("SENDER");
			}
			else {
				person.setRole("GETTER");
				if (max_difference < Math.abs(person.getDifference())) {
					Leader = person;
					max_difference = person.getDifference();
				}
			}
		}
		Leader.setRole("LEADER");
		
		for(Person person : travel.getPersonALL()) {
			personService.UpdatePerson(person);
		}
		
	}
	
}
