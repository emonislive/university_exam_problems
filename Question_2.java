/*
Suppose You create a student class that can store id and name.
Now create 2 objects of that class having the same name and set the id and name for each of them and print.

University - Green University of Bangladesh
*/

package com.question_2;
class Student{ 
    String name;
    int id;
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    void printInfo(){
        System.out.println("The Info of the Student: " + name +" "+ id);     
    }
}
public class Question_2 {
    public static void main(String[] args) {       
        Student object_1 = new Student("Jason Bark", 221002000);
        Student object_2 = new Student("Robart Clock", 221002001);         
        object_1.printInfo();
        object_2.printInfo();
    }
}
