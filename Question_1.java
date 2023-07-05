/*
Write a Java program to create a class called Shape with methods called getPerimeter() and getArea().
Make a Circle subclass that overrides the getPerimeter() and getArea() methods to determine a circle's area and perimeter.
[Make the proper utilization of the word "override"]

university - Green University of Bangladesh
*/
package com.question_1;

class Shape {
    double radius = 10;
    void getPerimeter() {
        System.out.println("Nothing there");
    }
    void getArea() {
        System.out.println("Nothing there");
    }
}
class Circle extends Shape {
    @Override
    void getPerimeter() {
        double pm = 2 * 3.1416 * super.radius;
        System.out.println(pm);
    }
    @Override
    void getArea() {
        double ar = 3.1416 * super.radius * super.radius;
        System.out.println(ar);
    }
}
public class Question_1 {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.getPerimeter();
        obj.getArea();
    }

}
