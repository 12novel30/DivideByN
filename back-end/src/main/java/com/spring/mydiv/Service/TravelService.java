package com.spring.mydiv.Service;

import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;
import com.spring.mydiv.Dto.Travel;

public interface TravelService {
	public String CreateTravel(Travel travel);
	public void getPerson(Person person);
	public void getEvent(Event event);
	public void setRole();
}
