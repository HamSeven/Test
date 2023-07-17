    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;


public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolder, double overdraftLimit) {
        super(accountNumber, accountHolder);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        double availableFunds = getBalance() + overdraftLimit;

        if (amount <= availableFunds) {
            if (amount <= getBalance()) {
                super.withdraw(amount);
            } else {
                double excessWithdrawal = amount - getBalance();
                double charge = excessWithdrawal * 0.03;
                overdraftLimit -= (excessWithdrawal + charge);
                super.withdraw(getBalance());
                System.out.println("Overdraft amount: " + excessWithdrawal);
                System.out.println("Charge: " + charge);
            }
        } else {
            System.out.println("Exceeds overdraft limit!");
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}

