package com.spring.mydiv.Dto;

import java.util.ArrayList;

public class Travel {

	private String TravelName;
	private ArrayList<Event> EventALL = new ArrayList<>();
	private ArrayList<Person> PersonALL = new ArrayList<>();
	private Person Leader;
	
	public Travel(String travelName) {
		this.setTravelName(travelName);
	}

	public String getTravelName() {
		return TravelName;
	}

	public void setTravelName(String travelName) {
		this.TravelName = travelName;
	}

	public ArrayList<Event> getEventALL() {
		return EventALL;
	}

	public void setEventALL(ArrayList<Event> eventALL) {
		this.EventALL = eventALL;
	}

	public ArrayList<Person> getPersonALL() {
		return PersonALL;
	}

	public void setPersonALL(ArrayList<Person> personALL) {
		this.PersonALL = personALL;
	}

	public Person getLeader() {
		return Leader;
	}

	public void setLeader(Person leader) {
		Leader = leader;
	}
	
}