package com.test;

public class T2 {
    public static void main(String[] args) {
        Shape shape = new Rectangle("矩形",3,4);
        Shape shape1 = new Circle("圆形",5);
        System.out.println(shape.getName()+'\t'+shape.getArea());
        System.out.println(shape1.getName()+'\t'+shape1.getArea());
    }
}
class Shape{
     public double getArea() {
        return 0;
    }
    public String  getName(){
        return null;
    }
    int age;
}
class  Circle extends Shape{
    double radius;
    String name;
     Circle(String name,double radius){
        age=10;
         this.radius=radius;
        this.name=name;
    }
    public String  getName(){
         return name;
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape{
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", name='" + name + '\'' +
                '}';
    }

    double length;
    double width;
    String name;
    Rectangle(String name,double length, double width) {
        this.length = length;
        this.width = width;
        this.name=name;
    }
    public double getArea() {
        return length*width;
    }
    public String  getName(){
        name.equals(name);
        return name;

    }
}