package org.com.studies.patternsII.adapter;

import java.util.Calendar;

public class RelogioDoSistema implements Relogio{
    @Override
    public Calendar hoje() {
        return Calendar.getInstance();
    }
}
