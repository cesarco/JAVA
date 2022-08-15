package com.example.arrays;

public class Main {
    public static void main(String[] args) {
        String[] students = new String[5];
        students[0] = "Cesar";
        students[1] = "Sarah";
        students[2] = "Tom";
        students[3] = "Brad";
        students[4] = "Madeline";

        System.out.println(students[2]);

        String[] employees = {
                "Cesar", "Meisan", "Sarah"
        };
        int[] number = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
    }
}
