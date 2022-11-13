package com.hillel.polezhaiev.homework6;

public class HomeWorkApp {
    public static void main(String[] args) {

        System.out.println();
        printThreeWords();
        System.out.println("-------------------\n");
        checkSumSign();
        System.out.println("-------------------\n");
        printColor();
        System.out.println("-------------------\n");
        compareNumbers();
        System.out.println("-------------------\n");
        System.out.println(range(3, 2));
        System.out.println("-------------------\n");
        vSign(12);
        System.out.println("-------------------\n");
        System.out.println(bSign(-1));
        System.out.println("-------------------\n");
        printString(5, "Homework 6");
        System.out.println("-------------------\n");
        System.out.println(leapYear(204));
        System.out.println("-------------------\n");

    }

    private static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
    }

    private static void checkSumSign(){
        int a = 0;
        int b = 0;

        int sum = a + b;

        if(sum >= 0){
            System.out.println("Sum is positive");

        } else{
            System.out.println("Sum is negative");

        }
    }

    private static void printColor(){
        int value = 0;

        if(value <= 0){
            System.out.println("Red");

        } else if(value > 0 && value <= 100){
            System.out.println("Yellow");

        } else if (value > 100) {
            System.out.println("Green");

        }
    }

    private static void compareNumbers(){
        int a = 0;
        int b = 0;

        if(a >= b){
            System.out.println("a >= b");

        } else {
            System.out.println("a < b");

        }
    }

    private static boolean range(int a, int b){
        int sum = a + b;

        return sum >= 10 && sum <= 20;
    }

    private static void vSign(int a){
        if(a >= 0){
            System.out.println("Positive");

        }else{
            System.out.println("Negative");

        }
    }

    private static boolean bSign(int a){
        return a <= 0;
    }

    private static void printString(int a, String string){
        for (int i = 0; i < a; i++) {
            System.out.println(string);

        }
    }

    private static boolean leapYear(int year){

        if (year % 4 == 0 || year % 400 == 0){
            if(year % 100 == 0 && year % 400 != 0){
                return false;

            }
            return true;

        }
        return false;

    }
}

