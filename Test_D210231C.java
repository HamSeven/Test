/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test_d210231c;

/**
 *
 * @author User
 */
public class Test_D210231C {
  public static void main(String[] args) {
    // Create a BankingTest object
    BankingTest bankingTest = new BankingTest();

    // Run the test method
    bankingTest.test();
  }
}

class BankingTest {
  public void test() {
    // Create a SavingsAccount
    SavingsAccount savingsAccount = new SavingsAccount(80001888, 300, "Pang Dixon", 0.05);

    // Deposit 500 into the savings account
    savingsAccount.deposit(500);

    // Calculate interest
    savingsAccount.calculateInterest();

    // Display the account information
    savingsAccount.displayAccountInformation();

    // Create a CurrentAccount
    CurrentAccount currentAccount = new CurrentAccount(777888, 200, "Joen", 1000);

    // Withdraw 600 from the current account
    currentAccount.withdraw(1100);

    // Display the account information
    currentAccount.displayAccountInformation();
  }
}
