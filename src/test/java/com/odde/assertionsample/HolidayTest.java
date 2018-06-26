package com.odde.assertionsample;

import org.junit.Test;

import java.time.Clock;
import java.time.LocalDate;

import static java.time.ZoneId.systemDefault;
import static org.junit.Assert.*;

public class HolidayTest {

    @Test
    public void today_is_joey_birthday() {
        Clock fixed = Clock.fixed(LocalDate.of(2018, 9, 1).atStartOfDay(systemDefault()).toInstant(), systemDefault());
        Holiday holiday = new Holiday(fixed);

        String actual = holiday.isTodayJoeyBirthday();

        assertEquals("Happy Birthday", actual);
    }

    @Test
    public void today_is_not_joey_birthday() {
        Clock clock = Clock.fixed(LocalDate.of(2018, 9, 10).atStartOfDay(systemDefault()).toInstant(), systemDefault());
        Holiday holiday = new Holiday(clock);

        String actual = holiday.isTodayJoeyBirthday();

        assertEquals("No", actual);
    }

}