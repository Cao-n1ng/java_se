package houserent.test;

import houserent.utility.Utility;

public class test {
    public static void main(String[] args) {
        System.out.print("你的输入是：");
        String s=Utility.readString(10);
        System.out.println("你的输出结果");
        System.out.println(s);
        System.out.println("你的输出结束");
    }
}
