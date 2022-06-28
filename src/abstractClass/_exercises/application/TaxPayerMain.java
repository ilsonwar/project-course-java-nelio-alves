package abstractClass._exercises.application;

import abstractClass._exercises.entities.Company;
import abstractClass._exercises.entities.Individual;
import abstractClass._exercises.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TaxPayerMain {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int payers = scan.nextInt();

        for (int i = 1; i <= payers; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)?");
            char choice = scan.next().charAt(0);
            scan.nextLine();

            if (choice == 'i') {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = scan.nextDouble();
                System.out.print("Health expenditures: ");
                double healthExpenditures = scan.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));

            } else if (choice == 'c') {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = scan.nextDouble();
                System.out.print("Number of employees: ");
                int numberOfEmployees = scan.nextInt();

                list.add(new Company(name, anualIncome, numberOfEmployees));

            }
        }
        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

    }
}
