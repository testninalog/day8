package com.endava.day8;

public class TestClass {

    public static void main(String[] args) {
//        DigitalRoot digitalRoot = new DigitalRoot();
//        System.out.println(digitalRoot.digitalRoot(0));
//        System.out.println(digitalRoot.digitalRoot(1234));
//        System.out.println(digitalRoot.digitalRoot(100));

//        SportPoints sportPoints = new SportPoints();
//        System.out.println(sportPoints.points(new String[]
//                {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}));
//
//        System.out.println(sportPoints.points(new String[]
//                {"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"}));
//
//        System.out.println(sportPoints.points(new String[]
//                {"0:1","0:2","0:3","0:4","1:2","1:3","1:4","2:3","2:4","3:4"}));
//
//        System.out.println(sportPoints.points(new String[]
//                {"1:0","2:0","3:0","4:0","2:1","1:3","1:4","2:3","2:4","3:4"}));
//
//        System.out.println(sportPoints.points(new String[]
//                {"1:0","2:0","3:0","4:4","2:2","3:3","1:4","2:3","2:4","3:4"}));

        OddNumber oddNumber = new OddNumber();
        System.out.println(oddNumber.findOddNumber((new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5})));//5
        System.out.println(oddNumber.findOddNumber((new int[]{1,1,2,-2,5,2,4,4,-1,-2,5})));//-1
        System.out.println(oddNumber.findOddNumber((new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5})));//5
        System.out.println(oddNumber.findOddNumber((new int[]{10})));//10
        System.out.println(oddNumber.findOddNumber((new int[]{1,1,1,1,1,1,10,1,1,1,1})));//10
        System.out.println(oddNumber.findOddNumber((new int[]{5,4,3,2,1,5,4,3,2,10,10})));//1

    }

}
