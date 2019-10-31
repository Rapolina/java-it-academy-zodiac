package com.company;

import java.text.ParseException;
import java.util.Date;

public enum Zodiac {
        Aries("Овен", "21.03", "20.04", " Один Овен — хорошо, два Овна — много!"),
        Taurus("Телец","21.04", "21.05", "Вы не верите в гороскоп" ),
        Gemini("Близницы","22.05","21.06", " Один ум хорошо, а два лучше, особенно если оба принадлежат одному и тому же человеку!"),
        Cancer("Рак", "22.06", "22.07", "Тяжело жить там, где негде спрятаться!"),
        Leo("Лев", "23.07", "21.08", "Не смотря на свой приветливый вид, я в душе диктатор!"),
        Virgo("Дева", "22.08", "23.09", "Скромность украшает не только девушку, но и Деву!"),
        Libra("Весы","24.09","23.10", "Самое противное- спорить!" ),
        Scorpio("Скорпион", "24.10", "22.11","Мои страсти редко выходят наружу, подобно акуле, которая редко выплывает на поверхность!"),
        Sagittarius("Стрелец","23.11", "22.12","На меня невозможно сердится!"),
        Capricorn("Козерог", "23.12", "20.01", "Настоящий Козерог, подобно коньяку, отличается выдержкой!"),
        Aquarius("Водолей","21.01", "19.02", "Как скучно быть похожими на других!"),
        Pisces("Рыбы", "20.02","20.03", "Посочувствовать важнее, чем помочь!");

        private String name;
        private String horoscope;
        private Date startDate;
        private Date endDate;

    Zodiac(String name, String startDate, String endDate, String horoscope) {
            this.name = name;
            this.horoscope = horoscope;

            WitcherCalendar calendar = new WitcherCalendar();
            try {
                this.startDate = calendar.string2date(startDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            try {
                this.endDate = calendar.string2date(endDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        public Date getStartDate() {
            return startDate;
        }

        public Date getEndDate() {
            return endDate;
        }

        public String getName() {
            return name;
        }
        public String getHoroscope(){
        return horoscope;
        }

    }
