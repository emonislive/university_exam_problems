/*
Write a Java program to convert all characters in a string to lowercase.

University - Green University of Bangladesh
IDE - Apache NetBeans 18
Date - July 5, 23
*/
package com.mainn;

class Convert{
    public String msg;
    public Convert(String msg){
        this.msg = msg;
    }
    
    String convertt(){
    msg = msg.toLowerCase();
    return msg;
}
}

public class Mainn {

    public static void main(String[] args) {
       
        Convert ob = new Convert("EMON");
        String msg = ob.convertt();
        System.out.println(msg);
    }
}
