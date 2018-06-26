package com.odde.assertionsample;

import java.time.Clock;
import java.time.LocalDate;

public class Holiday {

    private final LocalDate now;

    public Holiday() {
        now = LocalDate.now(Clock.systemDefaultZone());
    }

    public Holiday(Clock clock) {
        this.now = LocalDate.now(clock);
    }

    public String isTodayJoeyBirthday() {
        if (now.getMonthValue() == 9 && now.getDayOfMonth() == 1)
            return "Happy Birthday";
        else
            return "No";
    }

}
