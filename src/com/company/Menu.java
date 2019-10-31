package com.company;

import java.text.ParseException;
import java.util.Scanner;

class Menu {
    WitcherCalendar calendar;

    Menu() {
        calendar = new WitcherCalendar();
    }

    void show() {
        showMessage("Enter day and month (e.g " + calendar.getPattern() + " to get sign of zodiac or enter 0 to exit:");
        String input = getUserInput();
        handleUserInput(input);
    }

    private void handleUserInput(String input) {
        int userInputAsInt = input2Int(input);
        switch (userInputAsInt) {
            case 0:
                System.exit(0);
                break;
            default:
                try {
                    Zodiac zodiac = calendar.get(input);
                    if (zodiac != null) {
                        showMessage(zodiac.getName());
                        showMessage("Do u wanna to know your horo? 1-да, 2-нет");
                        input = getUserInput();
                        int code = input2Int(input);
                        if (code == 1)
                        {
                            showMessage(zodiac.getHoroscope());
                        }
                    } else {
                        showMessage("Not found");
                    }
                    show();
                } catch (ParseException e) {
                    showMessage("Enter again:");
                    input = getUserInput();
                    handleUserInput(input);
                }
        }
    }

    private String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private void showMessage(String message)
    {
        System.out.println(message);
    }

    private int input2Int(String input){
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
