package com.spring.mydiv.Dao;

import org.springframework.stereotype.Repository;

import com.spring.mydiv.Dto.Travel;

@Repository
public class TravelDao {
	
	public String insert(Travel travel) {
		return "finish";
	}
	
	public String update(Travel travel) {
		return "update";
	}
	
	public Travel select(int num) {
		Travel Traveltest = new Travel("불러오기");
		return Traveltest;
	}
}
