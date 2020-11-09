package com.company;
import java.util.*;

/*Q.4.Create an array that can hold ten integers. Fill up each slot of the array with a random number from 1 to 100.
Then display the contents of the array on the screen. You must use a loop.
 */


public class TenIntQ4 {

    public static void main(String[] args) {
        // write your code here
        Random r = new Random();
        int [] myTenInt = new int[10];

        for (int i=0; i<10; i++){
            //myTenInt[i] = r.nextInt();
            myTenInt[i] = (int) (Math.floor(Math.random() * (100 - 1) ) + 1);
        }
        for(int j=0;j<10;j++){
            System.out.println("Slot "+(j)+" = " + myTenInt[j]);
        }



    }
}
