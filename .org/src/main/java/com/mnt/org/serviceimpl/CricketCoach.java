package com.mnt.org.serviceimpl;

import com.mnt.org.serviceinterface.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkOutInfo() {
        return "Practcing bowling for 30 mins";
    }
}
