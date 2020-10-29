package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();


        if (number > 0) {
            System.out.println("The number is positive.");
        }else{System.out.println("The number is not positive.");}

    }
}
