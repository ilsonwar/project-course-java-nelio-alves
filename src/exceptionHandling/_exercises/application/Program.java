package exceptionHandling._exercises.application;

import exceptionHandling._exercises.model.entities.Account;
import exceptionHandling._exercises.model.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number:");
        int number = scan.nextInt();
        System.out.print("Holder:");
        scan.nextLine();
        String holder = scan.nextLine();
        System.out.print("Initial balance: ");
        double balance = scan.nextDouble();
        System.out.print("Withdraw Limit:");
        double whithdrawLimit = scan.nextDouble();

        Account acc = new Account(number, holder, balance, whithdrawLimit);

        System.out.print("Enter amount for withdraw: ");
        double amount = scan.nextDouble();

        try {
            acc.whithdraw(amount);
            System.out.printf("New balance %.2f%n", acc.getBalance());
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }

    }
}
