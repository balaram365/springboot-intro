package com.mnt.org.serviceimpl;

import com.mnt.org.serviceinterface.Coach;
import org.springframework.stereotype.Service;

@Service
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkOutInfo() {
        return "Practing daily service for 1 hour";
    }
}
