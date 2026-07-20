package com.mnt.org.serviceimpl;

import com.mnt.org.serviceinterface.Coach;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class FootBallCoach implements Coach {
    @Override
    public String getDailyWorkOutInfo() {
        return "few practiced kicking and few practiced goal keeping";
    }
}
