package com.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Howdy Friend, Please type in the the month you choose");
        System.out.println(Month.MARCH.ordinal());
        Scanner scanner = new Scanner(System.in);
//        int userMonthInput = scanner.nextInt();

        for(Month month : Month.values()) {
            System.out.println(month.getEnglishName());
        }

        String monthChoice = scanner.nextLine();
        Month userMonth = Month.valueOf(monthChoice.toUpperCase()); // JANUARY vs "JANUARY"
        List<String> months = new ArrayList<>();
        useOrdinal(userMonth, months);
        System.out.println(months);

    }
    public static void useOrdinal(Month choiceStart, List<String> months ) {
        for (Month month : Month.values()) {
            if(month.ordinal() >= choiceStart.ordinal()) {
                months.add(month.getEnglishName());
            }
        }
    }

//    public String[] printMonths (Month monthChoice) {
//
//
//
//        switch (monthChoice) {
//            case Month.JANUARY;
//
//                break;
//            default:
//                System.out.println("womp womp");
//
//        }
//    }
}
