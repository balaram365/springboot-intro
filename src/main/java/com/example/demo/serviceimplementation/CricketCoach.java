package com.example.demo.serviceimplementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.demo.serviceinterface.Coach;

@Component
@Primary
public class CricketCoach implements Coach{

	@Override
	public String getDailyWorkOutInfo() {
		// TODO Auto-generated method stub
		return "practicing fielding drills";
	}

}