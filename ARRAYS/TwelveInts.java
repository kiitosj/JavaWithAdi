package com.company;
import java.util.*;

public class TwelveInts {

    public static void main(String[] args) {
        // write your code here

        int[] twelves = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};


        System.out.println("From first to last:");
        for (int i = 0; i < twelves.length; i++) {
            System.out.print(twelves[i] + " ");
        }

        System.out.println("\nFrom last to first:");
        for (int j = twelves.length-1; j >= 0; j--) {
            System.out.print( twelves[j] + " ");
        }
    }
}