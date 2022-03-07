package com.spring.mydiv.Dao;

import org.springframework.stereotype.Repository;

import com.spring.mydiv.Dto.Person;

@Repository
public class PersonDao {
	
	public String insert(Person person) {
		return "finish";
	}
	
	public String update(Person person) {
		return "update";
	}
	
	public Person select(int num) {
		Person Persontest = new Person("불러오기", "테스트");
		return Persontest;
	}
}
