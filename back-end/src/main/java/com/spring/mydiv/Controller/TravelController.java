package com.spring.mydiv.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.spring.mydiv.Dto.Travel;
import com.spring.mydiv.Service.TravelService;

@Controller
public class TravelController {
	@Autowired
	private TravelService travelService;
	
	public String Create(Model model) {
		Travel travel = new Travel("여수 여행");
		travelService.CreateTravel(travel);
		
		return "Controller --> Service : Success";
		
	}
}
