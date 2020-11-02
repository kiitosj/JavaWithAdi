package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Reactangle myRec = new Reactangle();
        Box myBox=new Box();
        boolean connect=true;
        int choice;

        while(connect){
            System.out.println("square area calculator choose (1)");
            System.out.println("cubic volume  calculator choose (2)");
            System.out.println("quit (3)");
            choice= input.nextInt();

            if(choice==1 || choice==2 || choice==3){

                switch (choice){

                    case 1:
                        System.out.println("enter w");
                        myRec.w =input.nextDouble();
                        System.out.println("enter h");
                        myRec.h =input.nextDouble();
                        System.out.println("the area = "+myRec.area());
                        break;

                    case 2:
                        System.out.println("enter w");
                        myBox.w =input.nextDouble();
                        System.out.println("enter h");
                        myBox.h =input.nextDouble();
                        System.out.println("enter b");
                        myBox.b =input.nextDouble();
                        System.out.println("the volume = "+myBox.volume());
                        break;

                    case 3:
                        System.out.println("quit");
                        connect=false;

                }

            }else{
                System.out.println("wrong!");

            }





        }







    }
}
