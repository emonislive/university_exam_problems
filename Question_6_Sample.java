/*
Write a constructor in the Car class given below that initializes the brand class field with the string "Ford".
Call the getBrand() method in the main method of the Sample class and store the value of the brand in a variable,
and print the value.

University - Green University of Bangladesh
IDE - Apache NetBeans 18
Date - July 5, 23
*/

package com.question_6_sample;

class Car{
    public String brand;   
    public Car(){
    this.brand = "Ford";
}
    String getBrand(){
        return brand;
    }
}
public class Question_6_Sample {        // Sample Class
    public static void main(String[] args) {
        Car obj = new Car();        
        String brand = obj.getBrand();
        System.out.println(brand);
    }
}
