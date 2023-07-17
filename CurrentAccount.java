/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_d210231c;

/**
 *
 * @author User
 */

 public class CurrentAccount extends BankAccount {
  private double overdraftLimit;

  public CurrentAccount(int accountNumber, double balance, String accountHolderName, double overdraftLimit) {
    super(accountNumber, balance, accountHolderName);
    this.overdraftLimit = overdraftLimit;
  }

  public void withdraw(double amount) {
    if (amount > this.balance + this.overdraftLimit) {
      throw new IllegalArgumentException("Insufficient funds");
    }

    if (amount > this.balance) {
      double charge = amount * 0.03;
      this.balance -= amount - charge;
      this.overdraftLimit -= charge;
    } else {
      this.balance -= amount;
    }
  }
}   

