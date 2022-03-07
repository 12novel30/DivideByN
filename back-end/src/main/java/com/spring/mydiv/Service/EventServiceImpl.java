package com.spring.mydiv.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.mydiv.Dao.EventDao;
import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;

public class EventServiceImpl implements EventService {
	@Autowired
	private EventDao eventDao;
	
	@Autowired
	private PersonService personService;
		
	@Override
	public String CreateEvent(Event event){
		eventDao.insert(event);
		
		for(Person parti : event.getParticipant()) {
			parti.getWillSend().add(event);
			personService.get_difference(parti);
		}
		
		event.getPayer().getWillGet().add(event);
		personService.get_difference(event.getPayer());
		
		return "Service --> DAO : Success";
	}
	
	@Override
	public String Print(Event event) {
		String message = event.getEventName() + " / " + event.getPayer() + " / " + Integer.toString(event.getPrice()).replaceAll("\\B(?=(\\d{3})+(?!\\d))", ",");
		return message;
	}
	

	
	
	
}
