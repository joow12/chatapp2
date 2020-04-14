package com.example.stdjavaprograms;

class BankAccount {
    private double balance;
    private int accountNumber;
   private static int lastAssignedNumber = 1000;

   public  BankAccount() {
       lastAssignedNumber++;
       accountNumber= lastAssignedNumber;
   }

    public BankAccount(int objects) {

    }

    public double getBalance() {
      this.balance = balance;
       return balance;

   }



}
