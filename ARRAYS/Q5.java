package com.company;
import java.util.*;

public class Q5 {

    public static void main(String[] args) {
        // write your code here
        Random r = new Random();
        int [] myTenInt = new int[1000];

        for (int i=0; i<1000; i++){
            //myTenInt[i] = r.nextInt();
            myTenInt[i] = 10+r.nextInt(90);
        }
        for(int j=0;j<1000;j++){
            System.out.println("Slot "+(j)+" = " + myTenInt[j]);
        }



    }

}
