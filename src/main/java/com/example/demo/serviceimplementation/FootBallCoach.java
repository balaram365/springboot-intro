package com.example.demo.serviceimplementation;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.serviceinterface.Coach;

@Service
public class FootBallCoach implements Coach{

	@Override
	public String getDailyWorkOutInfo() {
		// TODO Auto-generated method stub
		return "few practiced kicking";
	}
	
}
