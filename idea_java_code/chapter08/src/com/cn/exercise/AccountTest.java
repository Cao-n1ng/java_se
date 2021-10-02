package com.cn.exercise;

public class AccountTest {
    public static void main(String[] args) {
    Account a1=new Account();
    a1.setAccount("曹操",2000,"123456");
    }
}
class Account{
    private String name;
    private double balance;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccount(String name, double balance, String password) {
        if((name.length()==2||name.length()==3||name.length()==4)&&balance>20&&password.length()==6){
            this.name = name;
            this.balance = balance;
            this.password = password;
            //成功
        }
        else{

        }


    }
}
