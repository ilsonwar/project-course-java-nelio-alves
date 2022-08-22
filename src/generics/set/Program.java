package generics.set;

import java.awt.font.FontRenderContext;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("id: ");
            int number = scan.nextInt();
            a.add(number);
        }

        System.out.print("How many students for course B? ");
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("id: ");
            int number = scan.nextInt();
            b.add(number);
        }

        System.out.print("How many students for course C? ");
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("id: ");
            int number = scan.nextInt();
            c.add(number);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total sudents: " + total.size());

        scan.close();
    }
}
