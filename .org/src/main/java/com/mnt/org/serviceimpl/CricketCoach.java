package com.mnt.org.serviceimpl;

import com.mnt.org.serviceinterface.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkOutInfo() {
        return "Practcing bowling for 30 mins";
    }
}
