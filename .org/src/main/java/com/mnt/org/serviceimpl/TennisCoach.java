package com.mnt.org.serviceimpl;

import com.mnt.org.serviceinterface.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@Service
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@RequestScope
public class TennisCoach implements Coach {

    public TennisCoach(){
        System.out.println("In construtor : "+getClass().getSimpleName());
    }
    @PostConstruct
    public  void breakForFiveMins(){
        System.out.println("taking breank for 5 mins after 1 hour :"+ getClass().getSimpleName());
    }

    @PreDestroy
    public  void breakMins(){
        System.out.println("taking breank for 5 mins after 1 hour :"+ getClass().getSimpleName());
    }

    public  void NoForFiveMins(){
        System.out.println("taking breank for 5 mins after 1 hour :"+ getClass().getSimpleName());
    }



    @Override
    public String getDailyWorkOutInfo() {
        return "Practing daily service for 1 hour";
    }
}
