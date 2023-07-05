/*
Assume you are developing a financial management application in Java that handles transactions.
One of the features is to manage cases where a user tries to withdraw an amount greater than their actual balance.
Write a code that demonstrates how you would handle this scenario utilizing exception handling in Java.

University - Green University of Bangladesh
IDE - Apache NetBeans 18
Date - July 5, 23
*/

package com.question_3;
import java.util.Scanner;

class CustomException extends Exception{  
    public CustomException(String message){
        super(message);
    }
}
class Withdraw{
    double savings;
    public Withdraw(double savings){
        this.savings = savings;
    }   
    void checkBalance(){       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Money to Withdrawal");
        double money = sc.nextDouble();
        sc.close();
        try{
            if(money > savings){
                throw new CustomException("Insufficient Balance to Withdrawal");
            }
            else{
               System.out.println("Your Transiction of " +"$" + money + " Has been Completed");
            }
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
}
public class Question_3 {
    public static void main(String[] args) {       
        Withdraw obj_1 = new Withdraw(500.00);        
        obj_1.checkBalance();
    }
}
