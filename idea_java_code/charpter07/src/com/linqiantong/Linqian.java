package com.linqiantong;

import com.sun.source.tree.WhileLoopTree;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 1.打印怎么排列整齐
   2.时间获取与格式调整
   3.
  */
public class Linqian {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String str1 = "----------------------零钱通明细-----------------";
        String note = null;
        String exit = null;
        double income = 0;
        double pay = 0;
        double balance = 0;
        Date date = null; // date 是 java.util.Date 类型，表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        do {
            System.out.println("----------------------零钱通菜单-----------------");
            System.out.println("1  零钱通明细");
            System.out.println("2  收益入账");
            System.out.println("3  消费");
            System.out.println("4  退   出");
            System.out.print("请选择(1-4)  ");
            String s = scanner.next();
            switch (s) {
                case "1":
                    System.out.println(str1);
                    break;
                case "2"://输入校验
                    System.out.println("收入金额:");
                    while (true){
                        income = scanner.nextDouble();
                        if(income>0)
                            break;
                    }
                    balance += income;
                    date = new Date();
                    str1 += "\n收益入账\t+" + income + "\t" + sdf.format(date) + "\t余额：" + balance;
                    break;
                case "3":
                    System.out.println("支出项目");
                    note = scanner.next();
                    System.out.println("消费金额");
                    while (true){
                        pay = scanner.nextDouble();
                        if(balance-pay>=0) break;
                    }
                    balance -= pay;
                    str1 += "\n" + note + "\t-" + pay + "\t" + sdf.format(date) + "\t余额：" + balance;
                    break;
                case "4":
                    System.out.println("确定退出吗？y or n");
                    System.out.println("y or n");
                    while (true) {
                        exit = scanner.next();
                        if (exit.equals("y") || exit.equals("n"))
                            break;
                        System.out.println("输入错误，请继续输入");
                    }
                    if (exit.equals("y")) loop = false;
                    break;
            }
        } while (loop);
        System.out.println("程序已退出");
    }
}
