package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WitcherCalendar {
    private static final String INPUT_DATE_FORMAT = "dd.MM";
    private final String pattern;

    private WitcherCalendar(String pattern) {
        this.pattern = pattern;
    }

    public WitcherCalendar() {
        this(INPUT_DATE_FORMAT);
    }

    public Date string2date(String date) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.pattern);

        return simpleDateFormat.parse(date);
    }

    /**
     * @param input follows {@code £pattern}.
     */
    public Zodiac get(String input) throws ParseException {
        Date date = string2date(input);
        for (Zodiac zodiac : Zodiac.values()) {
            if (date.compareTo(zodiac.getStartDate()) >= 0
                    && date.compareTo(zodiac.getEndDate()) <= 0) {
                return zodiac;
            }
        }
        return null;
    }

    public String getPattern() {
        return pattern;
    }


}
