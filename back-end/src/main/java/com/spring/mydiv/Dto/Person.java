package com.spring.mydiv.Dto;

import java.util.ArrayList;

public class Person {
	
	private String PersonName;
	private String Account;
	private ArrayList<Person> getterALL = new ArrayList<>();
	private ArrayList<Event> willSend = new ArrayList<>();
	private ArrayList<Event> willGet = new ArrayList<>();
	private String Role;
	private double sumSend;
	private double sumGet;
	private int Difference;
	
	public Person(String PersonName, String Account){
		this.setPersonName(PersonName);
		this.setAccount(Account);
	}

	public String getPersonName() {
		return PersonName;
	}

	public void setPersonName(String personName) {
		PersonName = personName;
	}

	public String getAccount() {
		return Account;
	}

	public void setAccount(String account) {
		Account = account;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public ArrayList<Person> getGetterALL() {
		return getterALL;
	}

	public void setGetterALL(ArrayList<Person> getterALL) {
		this.getterALL = getterALL;
	}

	public ArrayList<Event> getWillSend() {
		return willSend;
	}

	public void setWillSend(ArrayList<Event> willSend) {
		this.willSend = willSend;
	}

	public ArrayList<Event> getWillGet() {
		return willGet;
	}

	public void setWillGet(ArrayList<Event> willGet) {
		this.willGet = willGet;
	}

	public double getSumSend() {
		return sumSend;
	}

	public void setSumSend(double sumSend) {
		this.sumSend = sumSend;
	}

	public double getSumGet() {
		return sumGet;
	}

	public void setSumGet(double sumGet) {
		this.sumGet = sumGet;
	}

	public int getDifference() {
		return Difference;
	}

	public void setDifference(int difference) {
		Difference = difference;
	}
	
}
	