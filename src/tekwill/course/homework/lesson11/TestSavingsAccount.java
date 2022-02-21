package tekwill.course.homework.lesson11;

import tekwill.course.homework.lesson11.SavingsAccount;

public class TestSavingsAccount {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00, 4);
        SavingsAccount saver2 = new SavingsAccount(3000.00, 4);

        saver1.calculateMonthlyInterest();
        System.out.println(saver1.getSavingsBalance());
        saver2.calculateMonthlyInterest();
        System.out.println(saver2.getSavingsBalance());

        SavingsAccount.setAnnualInterestRate(5);

        saver1.calculateMonthlyInterest();
        System.out.println(saver1.getSavingsBalance());
        saver2.calculateMonthlyInterest();
        System.out.println(saver2.getSavingsBalance());

    }

}
