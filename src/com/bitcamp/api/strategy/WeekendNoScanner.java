package com.bitcamp.api.strategy;

import java.util.Scanner;

public class WeekendNoScanner {

        public String main() {
            String number = "1";
            // String day = execute(number);
            return WeekendStrategyNoScanner.execute(number);
        }

        public String execute(String number) {
            System.out.println("1~7 입력: ");
            String day = number;
            String res = "";
            switch (day) {
                case "1":
                    res="Monday";
                    break;
                case "2":
                    res="Tuesday";
                    break;
                case "3":
                    res="Wednesday";
                    break;
                case "4":
                    res="Thursday";
                    break;
                case "5":
                    res="Friday";
                    break;
                case "6":
                    res="Saturday";
                    break;
                case "7":
                    res="Sunday";
                    break;
            }
            return res;
        }


}
