public class H4 {
    public static void main(String[] args) {
        Employee p1 = new Worker("晁大", 200, 25);
        Employee p2 = new Manager("曹宁", 300, 28);
        p1.saysalary();
        p2.saysalary();
    }
}

class Employee {
    private String name;
    private double salary;
    private int day;
    private double income;

    public Employee(String name, double salary, int day) {
        this.name = name;
        this.salary = salary;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome() {
        this.income = salary * day;
    }

    void saysalary() {
    }
}

class Manager extends Employee {

    private double bonus;
    public Manager(String name, double salary, int day) {
        super(name,salary,day);
        bonus=1000;
    }

    void saysalary() {
        System.out.println("经理" + getName() + "工资是：" + (bonus+1.2*getSalary()*getDay()));
    }


}

class Worker extends Employee {

    public Worker(String name, double salary, int day) {
        super(name,salary,day);
    }

    void saysalary() {
        System.out.println("普通员工" + getName() + "工资是" + getSalary()*getDay() );
    }
}
//我与韩老师的代码又不同了，韩老师是在子类构造函数super()，重新初始化父类，我对父类则不同了。最大的不同是，我没有设置公共抽象类为private，子类是可以直接继承属性的。
//我这有点像接口的写法