package com.company;

/*Q.2.Create an array that can hold ten integers. Fill up each slot of the array with the number -113.
Then display the contents of the array on the screen.
(Hint: create an array with 10 integer and put the value -113 and for each line use System.out.println(“Slot 0 contains a “ +a[0]);)*/


public class TenIntQ2Q3 {


    public static void main(String[] args) {
        // write your code here

int [] myTenInt = new int[10];

        for (int i=0; i<10; i++){
        myTenInt[i] = (-113);
        }
        for(int j=0;j<10;j++){
            System.out.println("Slot "+(j)+" = " + myTenInt[j]);
        }



    }

}
