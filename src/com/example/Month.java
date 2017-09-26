package com.example;

public enum Month {
    JANUARY ("January"),
    FEBRUARY ("February"),
    MARCH ("March"),
    APRIL ("April"),
    MAY ("May"),
    JUNE ("June"),
    JULY ("July"),
    AUGUST ("August"),
    SEPTEMBER ("September"),
    OCTOBER ("October"),
    NOVEMBER ("November"),
    DECEMBER ("December");

    private String englishName;

    public String getEnglishName() {
        return englishName;
    }

    Month (String englishName) {
        this.englishName = englishName;
    }

//    String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
//
//
//    int month = userMonthInput;
//
//    String monthString;
//        switch (int month) {
//                case 1:
//                    (monthString = "January, February, March, April, May, June, July, August, September, October, November, December");
//
//                    break;
//                case 2:
//                    (monthString = "February, March, April, May, June, July, August, September, October, November, December");
//
//                    break;
//                case 3:
//                     (monthString = "March, April, May, June, July, August, September, October, November, December");
//
//                    break;
//                case 4:
//                    (monthString = "April, May, June, July, August, September, October, November, December");
//
//                    break;
//                case 5:
//                     (monthString = "May, June, July, August, September, October, November, December");
//
//                     break;
//                case 6:
//                   (monthString = "June, July, August, September, October, November, December");
//
//        break;
//        case 7:
//            (monthString = "July, August, September, October, November, December");
//
//        break;
//        case 8:
//            (monthString = "August, September, October, November, December");
//
//        break;
//        case 9:
//            (monthString = "September, October, November, December");
//
//        break;
//        case 10:
//            (monthString = "October, November, December");
//
//        break;
//        case 11:
//            (monthString = "November, December");
//
//        break;
//        case 12:
//            switch (monthString = "December");
//            break;
//    }

//        System.out.println(monthString);
//}
}




