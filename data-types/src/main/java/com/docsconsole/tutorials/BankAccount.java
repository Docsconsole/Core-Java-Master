package com.docsconsole.tutorials;


public class BankAccount {

        private int accountNumber;
        private int balance;
        public BankAccount(int accountNumber,int balance){
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        void withdraw(int amount) {
            this.balance =  this.balance - amount;
            System.out.println("Withdrawing money: "+amount+" in account of : "+this.accountNumber);
            System.out.println("Balance amount: "+this.balance);
        }
        void deposit(int amount) {
            this.balance =  this.balance + amount;
            System.out.println("depositing money"+ amount +" in account of : "+this.accountNumber);
            System.out.println("Balance amount: "+this.balance);
        }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000110002, 20022500);
        acc.withdraw(1000);
        acc.deposit(1000);

    }

}