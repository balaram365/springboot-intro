package com.example.demo.serviceimplementation;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import com.example.demo.serviceinterface.Coach;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@RequestScope
public class TennisCoach implements Coach{
	public TennisCoach() {
		System.out.println("In constructor : "+getClass().getSimpleName());
	}
	@PostConstruct
	public void breakForFiveMin() {
		System.out.println("taking 5 min break in after "+getClass().getSimpleName());
	}
	
	@PreDestroy
	public void breakMin() {
		System.out.println("taking 5 min break in after "+getClass().getSimpleName());
	}
	
	@Override
	public String getDailyWorkOutInfo() {
		// TODO Auto-generated method stub
		return "practicing daily service for 1 hr";
	}

}
