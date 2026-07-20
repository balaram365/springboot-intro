package com.mnt.org.controller;

import com.mnt.org.serviceimpl.FootBallCoach;
import com.mnt.org.serviceimpl.TennisCoach;
import com.mnt.org.serviceinterface.Coach;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestEndpoint {

 //private FootBallCoach footBallCoach;
 @Qualifier("tennisCoach")
 @Autowired
 private Coach myCoach;

 //private TennisCoach tennisCoach;

/* @Autowired
    public TestRestEndpoint (@Qualifier("tennisCoach") Coach theCoach) {
        this.myCoach =theCoach ;
    }*/



    private static final Logger log = LoggerFactory.getLogger(TestRestEndpoint.class);

    @GetMapping("/hello")
    public String testApp(){
        log.info("object instance of mycoah is " + myCoach.getClass());
        String test =myCoach.getDailyWorkOutInfo();
        //String output=footBallCoach.getDailyWorkOutInfo();
       // String tenisOutPut=tennisCoach.getDailyWorkOutInfo();
        return test;//+"/n"+tenisOutPut;
    }
}
