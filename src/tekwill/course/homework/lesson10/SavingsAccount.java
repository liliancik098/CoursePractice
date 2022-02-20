package tekwill.course.homework.lesson10;

public class SavingsAccount {
    int months = 12;
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance, double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate / 100;
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void calculateMonthlyInterest() {
        savingsBalance += (savingsBalance * annualInterestRate / months);
        months--;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate / 100;
    }
}
