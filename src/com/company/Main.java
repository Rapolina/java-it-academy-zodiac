package com.company;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WitcherCalendar calendar = new WitcherCalendar();
        System.out.println("Enter day and month (e.g " + calendar.getPattern() + " to get sign of zodiac or enter 0 to exit:");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            try {
                if (Integer.parseInt(input) == 0) {
                    System.exit(0);
                }
            } catch (NumberFormatException e)
            {
            }
            try {
                Zodiac zodiac = new WitcherCalendar().get(input);
                System.out.println(zodiac != null ? zodiac.getName() : "Not found");
            } catch (ParseException e) {
                System.out.println("Enter again:");
            }
            System.out.println("Do u wanna to know your horo? 1-да, 2-нет");
            int a = scanner.nextInt();

            switch (a) {
                case 1:
                    System.out.println(());
                    break;
                case 2:
                    System.out.println(" ");
            }
        }
    }
}
