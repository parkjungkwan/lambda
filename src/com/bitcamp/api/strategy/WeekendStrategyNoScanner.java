package com.bitcamp.api.strategy;

import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Stream;

public enum WeekendStrategyNoScanner {
    Monday("1", i -> "Monday"),
    Tuesday("2", i -> "Tuesday"),
    Wednesday("3", i -> "Wednesday"),
    Thursday("4", i -> "Thursday"),
    Friday("5", i -> "Friday"),
    Saturday("6", i -> "Saturday"),
    Sunday("7", i -> "Sunday"),
    Wrong("x", i->"Wrong")
    ;

    private final String name;
    private final Function<String, String> function;

    WeekendStrategyNoScanner(String name, Function<String, String> function) {
        this.name = name;
        this.function = function;
    }

    public static String execute(String number) {
        System.out.println("1 입력: ");
        String s = number;
        return Stream.of(values())
                .filter(i -> i.name.equals(s))
                .findAny().orElseGet(()-> WeekendStrategyNoScanner.valueOf("Wrong"))
                .function.apply(s)
                ;
    }
}
