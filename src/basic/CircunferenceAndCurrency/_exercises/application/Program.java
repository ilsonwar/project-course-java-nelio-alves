package basic.CircunferenceAndCurrency._exercises.application;

import basic.CircunferenceAndCurrency._exercises.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dollarPrice = scan.nextDouble();

        System.out.println("How many dollars will be bought");
        double amoutDollar = scan.nextDouble();

        double result = CurrencyConverter.dollarToReal(amoutDollar, dollarPrice);

        System.out.printf("Amount to be paid in reais= %.2f%n", result);

    }
}
