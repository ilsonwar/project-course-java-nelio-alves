package constructors._exercises.application;

import constructors._exercises.entities.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        ContaBancaria conta;

        System.out.println("Enter account number: ");
        int number = scan.nextInt();

        System.out.println("Enter account holder: ");
        scan.nextLine();
        String holder = scan.nextLine();

        System.out.println("Is there na initial deposit (y/n)? ");
        char choice = scan.next().charAt(0);

        if (choice == 'y') {
            System.out.println("Enter initial value: ");
            double initialDeposit = scan.nextDouble();
            conta = new ContaBancaria(number, holder, initialDeposit);
        } else {
            conta = new ContaBancaria(number, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(conta);
        System.out.println();

        System.out.println("Enter a deposit value: ");
        double deposit = scan.nextDouble();
        conta.deposit(deposit);
        System.out.println();
        System.out.println("Update account data: ");
        System.out.println(conta);

        System.out.println("Enter a wichdraw value: ");
        double wichdraw = scan.nextDouble();
        conta.withdraw(wichdraw);
        System.out.println();
        System.out.println("Update account data: ");
        System.out.println(conta);

        scan.close();
    }
}
