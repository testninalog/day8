package com.endava.day8;

public class DigitalRoot {

    public int digitalRoot(Integer number) {

        Integer sum = 0;
        while (number > 9) {
            while ( number > 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
            sum = 0;
        }
        return number;
    }

//    public int digitalRootR(Integer number) {
//
////        Integer sum = 0;
////        while (number > 9) {
////            while ( number > 0) {
////                sum += number % 10;
////                number /= 10;
////            }
////            number = sum;
////            sum = 0;
////        }
////        return number;
//    }
}
