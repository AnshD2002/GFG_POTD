/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author ansh
 */
/*Write a Java program to create a class called "Bank" with a collection of 
accounts and methods to add and remove accounts, and to deposit and withdraw 
money. Also define a class called "Account" to maintain account details of a 
particular customer.*/
class Account extends Bank {
    Bank b = new Bank();
    long balance = b.balance;
    void deposit(int money){
        this.balance = this.balance+money;
    }
    void withdraw (int money){
        this.balance = this.balance-money;
    }
    void checkbalance(){
        System.out.println("balance is : "+this.balance);
    }
}
public class Bank {
    long accountno;
    String name;
    long balance;
    void addaccount(String name,long accountno, long deposit){
        this.accountno = accountno;
        this.balance = balance;
        this.name = name;
    }
    void removeaccount(){
        this.accountno = 0;
        this.balance = 0;
        this.name = null;
    }
    long getbalance(){
        return this.balance;
    }
    void accountdis(){
        System.out.println("Name : "+ name);
        System.out.println("Account no. : "+ accountno);
        System.out.println("Balance : "+ balance);
    }
    public static void main(String[] args) {
        Account c1 = new Account();
        c1.accountno = 1001546;
        c1.name ="Ansh Dabral";
        c1.balance = 9999999;
        c1.deposit(111);
        c1.checkbalance();
        c1.accountdis();
        
    }
   
}
