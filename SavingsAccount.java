/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_d210231c;

public class SavingsAccount extends BankAccount {
  private double interestRate;

  public SavingsAccount(int accountNumber, double balance, String accountHolderName, double interestRate) {
    super(accountNumber, balance, accountHolderName);
    this.interestRate = interestRate;
  }

  public void calculateInterest() {
    this.balance += this.balance * this.interestRate;
  }
}
