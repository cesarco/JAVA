package com.example.operators;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;

      /*  boolean answer = a != b;
        System.out.println(answer);*/

      /*  boolean answer = a ==5 && b==2;
        System.out.println(answer);*/

/*
        if (a > 3){
            System.out.println("A is greater than 3");
        }else{
            System.out.println("A is less than 3");
        }
*/

/*        if (a > 0){
            System.out.println("A is positive");
        } else if (a < 0){
            System.out.println("A is negative");
        } else {
            System.out.println(" A is Zero");
        }*/

        switch(a) {
            case 1:
                System.out.println("A is one");
                break;

            case 2 :
                System.out.println(" A is two");
                break;
            case 3:
                System.out.println("A is three");
                break;
            default:
                System.out.println("A is not One, Two or Three");
        }
    }
}
