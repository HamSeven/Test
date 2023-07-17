/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;


public class TestProgram {
    public static void main(String[] args) {
        // Creating a Savings Account
        SavingsAccount savingsAccount = new SavingsAccount("SA001", "Pang Dixon", 0.05);
        savingsAccount.deposit(1000);
        savingsAccount.displayInfo();
        double interest = savingsAccount.calculateInterest();
        System.out.println("Interest Earned: " + interest);
        savingsAccount.addInterest();
        savingsAccount.displayInfo();

        System.out.println();

        // Creating a Current Account
        CurrentAccount currentAccount = new CurrentAccount("CA001", "Pang Dixon", 500);
        currentAccount.deposit(800);
        currentAccount.displayInfo();
        currentAccount.withdraw(1200);
        currentAccount.displayInfo();
        System.out.println("Overdraft Limit: " + currentAccount.getOverdraftLimit());
    }
}

