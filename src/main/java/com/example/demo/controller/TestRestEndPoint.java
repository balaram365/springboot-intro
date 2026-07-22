package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.serviceimplementation.FootBallCoach;
import com.example.demo.serviceimplementation.TennisCoach;
import com.example.demo.serviceinterface.Coach;

@RestController
//@Component
public class TestRestEndPoint {

	@Autowired
//	@Qualifier("foot")
//	private FootBallCoach footBallCoach;
	@Qualifier("tennisCoach")
	private Coach myCoach;
//	private Coach myCoachCopy;
//	
//	@Autowired
//	@Qualifier("footBallSpain")
//	private FootBallCoach footBallCoachSpain;
	
//	private TennisCoach tennisCoach;
//	@Autowired  //constructor injection
	//@Qualifer will have higher priority
//	public TestRestEndPoint(@Qualifier("tennisCoach") Coach theCoach,
//							@Qualifier("tennisCoach") Coach myCoachCopy) {
//		this.myCoach=theCoach;
//		this.myCoachCopy=myCoachCopy;
//	}
	

	private static final Logger log = LoggerFactory.getLogger(TestRestEndPoint.class);
//	@Value("${system.username}")
//	private String username;
	@GetMapping("/hello")
	public String testApp() {
		log.info("my coach"+myCoach.getClass().getSimpleName());
		//log.info("my coach"+myCoachCopy.getClass().getSimpleName());
		String test=myCoach.getDailyWorkOutInfo();
//		String output=footBallCoach.getDailyWorkOutInfo();
//		String tennisOutput = tennisCoach.getDailyWorkOutInfo();
		return test;//+"\n"+tennisOutput;
	}
	
//	@GetMapping("/check")
//	public String check() {
//		return "comparing beans : myCoach==myCoachCopy "+(myCoach==myCoachCopy);
//	}
}