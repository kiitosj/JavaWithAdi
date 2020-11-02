package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean connected=true;
        int choice;
        int pincheck;
        bankAccount myAccount = new bankAccount();

        System.out.println("Welcome to Jbank");
        System.out.println("Enter your account number");
        Scanner input = new Scanner(System.in);
        myAccount.accountNumber = input.nextInt();
        System.out.println("account number is set to = "+myAccount.accountNumber);
        //System.out.println("login Ok");
        System.out.println("Enter your initial balance");
        myAccount.balance = input.nextDouble();
        System.out.println("balance for account ("+myAccount.accountNumber+") is set to = "+myAccount.balance);
        System.out.println("Enter your pin");
        myAccount.pin=input.nextInt();
        System.out.println("account pin is set to = "+myAccount.pin);






        while (connected==true){

            System.out.println("select an option:");
            System.out.println("(1) make a deposit");
            System.out.println("(2) make a withdraw");
            System.out.println("(3) quit");
            choice = input.nextInt();


            switch (choice){

                case 1:
                    System.out.println("enter your pin");
                    pincheck =input.nextInt();
                    if(pincheck==myAccount.pin){
                        System.out.println("enter ammount to deposit");
                        myAccount.balance=myAccount.balance+input.nextInt();
                        System.out.println("your new balance is ="+myAccount.balance);
                    }else{System.out.println("wrong pin"); }
                    break;

                case 2:
                    System.out.println("enter your pin");
                    pincheck =input.nextInt();
                    if(pincheck==myAccount.pin){
                        System.out.println("enter ammount to withdraw");
                        myAccount.balance=myAccount.balance+input.nextInt();
                        System.out.println("your new balance is ="+myAccount.balance);
                    }else{System.out.println("wrong pin"); }
                    break;

                case 3:
                    System.out.println("log off");
                    connected=false;
                    break;


            }






            //connected=false;
        }






    }
}
