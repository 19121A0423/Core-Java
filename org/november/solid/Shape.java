package org.november.solid;

//Shape class as a base for different shapes
public abstract class Shape {
 abstract double area();
}

//Extension: Adding a new shape (Rectangle) without modifying existing code
class Rectangle extends Shape {
 private double width;
 private double height;

 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 public double area() {
     return width * height;
 }
}

//Extension: Adding a new shape (Circle) without modifying existing code
class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 public double area() {
     return Math.PI * radius * radius;
 }
}
