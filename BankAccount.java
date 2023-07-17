/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_d210231c;

public class BankAccount {
  private int accountNumber;
  public double balance;
  private String accountHolderName;

  public BankAccount(int accountNumber, double balance, String accountHolderName) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.accountHolderName = accountHolderName;
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

  public void withdraw(double amount) {
    if (amount > this.balance) {
      throw new IllegalArgumentException("Insufficient funds");
    }

    this.balance -= amount;
  }

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public double getBalance() {
    return this.balance;
  }

  public String getAccountHolderName() {
    return this.accountHolderName;
  }

  public void displayAccountInformation() {
    System.out.println("Account number: " + this.accountNumber);
    System.out.println("Balance: " + this.balance);
    System.out.println("Account holder name: " + this.accountHolderName);
  }
}
