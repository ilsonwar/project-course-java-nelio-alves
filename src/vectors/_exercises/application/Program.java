package vectors._exercises.application;

import vectors._exercises.entities.Pension;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Pension[] vect = new Pension[10];

        System.out.println("How many rooms will be rented? ");
        int amountRoons = scan.nextInt();


        for (int i=1; i<=amountRoons; i++){

            scan.nextLine();
            System.out.println("Rent #"+i+":");
            System.out.println("Name: ");
            String name = scan.nextLine();

            System.out.println("Email: ");
            String email = scan.nextLine();

            System.out.println("Room: ");
            int room = scan.nextInt();
            System.out.println();
            vect[room] = new Pension(name, email);

        }

        System.out.println();
        System.out.println("Busy rooms:");

        for (int i=0; i< vect.length; i++){
            if (vect[i] != null){
                System.out.println(i+ ": "+vect[i]);
            }
        }
        scan.close();
    }
}
