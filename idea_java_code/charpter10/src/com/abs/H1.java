package com.abs;

import java.time.Period;

public class H1 {

    public static void main(String[] args) {
        Employee[] person={new CommonEmployee("曹",12,9100),new Manager("李",123,19100)};
        person[0].work();
        person[1].work();
    }
}
abstract class Employee{
    protected String name;
    protected int id;
    protected double salary;
    abstract void work();

}
class CommonEmployee extends Employee{
    public CommonEmployee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void work(){
        System.out.println("普通员工"+name+"工作中");
    }
}
class Manager extends Employee{
    private double bonus;
    public Manager(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void work(){
        System.out.println("经理"+name+"工作中");
    }
}