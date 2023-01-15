package com.Debitaccount;

public class Debit_Acc {
public static void main(String[]args){

}
    private static double balance;    // instance variable that stores the balance

    double initialBalance = 0.0; {
        // validate that initialBalance is greater than 0.0;
        // if it is not, balance is initialized to the default value 0.0
        if (initialBalance > 0.0)
            balance = initialBalance;
    } // end Account constructor

    // credit (add) an amount to the account
    public void credit(double amount) {
        balance = balance + amount;    // add amount to balance
    } // end method credit

    // debit (deduct) an amount to the account
    public void debit(double debitAmount) {


        if (debitAmount > balance) {
            debitAmount = 0.0;
            System.out.println("Debit amount exceeded account balance.");
        }
        balance = balance - debitAmount;
    } // end method debit

    // return the account balance
    public double getBalance() {
        return balance; // gives the value of balance to the calling method
    } // end method getBalance;
}