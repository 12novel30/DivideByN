package com.spring.mydiv.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;
import com.spring.mydiv.Service.PersonService;
import com.spring.mydiv.Service.TravelService;

public class PersonController {
	@Autowired
	private PersonService personService;
	
	@Autowired
	private TravelService travelService;
	
	@RequestMapping("/createPerson")
	public ModelAndView personCreate(@ModelAttribute("person") Person person) {
		
		personService.CreatePerson(person);
		travelService.getPerson(person); // travel.get_person 수행
		
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/"); // 메인으로 돌아가기
		mv.addObject("main", "메인 화면를 나타내는데 필요한 모든 데이터"); 
		return mv;
		
	}
	
}
