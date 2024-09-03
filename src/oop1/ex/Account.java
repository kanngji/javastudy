package oop1.ex;

public class Account {
    int balance; // 잔액

    void deposit(int amount) {
        balance = amount + balance;
    }

    void withdraw(int amount) {

        if (balance >= amount){
            balance =  balance - amount;

        }
        else {
            System.out.println("계좌에 돈이 부족하빈다");
        }

    }
}
