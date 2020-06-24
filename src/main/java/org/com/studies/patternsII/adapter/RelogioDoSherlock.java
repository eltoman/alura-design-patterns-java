package org.com.studies.patternsII.adapter;

import java.util.Calendar;
import java.util.TimeZone;

public class RelogioDoSherlock implements Relogio {

    @Override
    public Calendar hoje() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        calendar.add(Calendar.HOUR, 4);
        return calendar;
    }
}
