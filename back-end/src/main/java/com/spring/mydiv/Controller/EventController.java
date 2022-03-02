package com.spring.mydiv.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;
import com.spring.mydiv.Service.EventService;
import com.spring.mydiv.Service.TravelService;

@Controller
public class EventController {
	@Autowired
	private EventService eventService;
	
	@Autowired
	private TravelService travelService;
	
	@RequestMapping("/createEvent")
	public ModelAndView eventCreate(@ModelAttribute("event") Event event) {
		
		eventService.CreateEvent(event);
		travelService.getEvent(event); // travel.get_event 수행
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/"); // 메인으로 돌아가기
		mv.addObject("main", "메인 화면를 나타내는데 필요한 모든 데이터");
		return mv;
		
	}
	
}