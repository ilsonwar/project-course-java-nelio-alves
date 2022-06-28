package InheritanceAndPolymorphism._exercises.application;

import InheritanceAndPolymorphism._exercises.entities.ImportedProduct;
import InheritanceAndPolymorphism._exercises.entities.Product;
import InheritanceAndPolymorphism._exercises.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Price: ");
            double price = scan.nextDouble();

            Product product = new Product(name, price);
            if (ch == 'c') {
                list.add(product);
            }

            if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = scan.nextDouble();
                Product importedProduct = new ImportedProduct(name, price, customsFee);
                list.add(importedProduct);

            } else if (ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(scan.next());
                Product UsedProduct = new UsedProduct(name, price, manufactureDate);
                list.add(UsedProduct);

            }
        }
        System.out.println();
        System.out.println("PRICE TAGS: ");

        for (Product product : list) {
            System.out.println(product.priceTag());
        }
        scan.close();
    }
}
