/*
Write a Java program that reads an integer from the user and throws a custom exception if the number is negative.
Define a class NegativeNumberException that extends Exception and uses it to handle negative numbers.

University - Green University of Bangladesh
IDE - Apache NetBeans 18
Date - July 5, 23
*/

package com.question_4;
import java.util.Scanner;

class NegativeNumberException extends Exception{
    public NegativeNumberException(String message){
        super(message);
    }
}
public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        try{
            if(number < 0){
                throw new NegativeNumberException("The number is Negative.\nInsert a Positive Number");
            }
          else
              System.out.println("Number Inserted Successfully");
        }catch(NegativeNumberException e){
            System.out.println(e.getMessage());
        }
    }
}
