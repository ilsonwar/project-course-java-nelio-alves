package enumerations._exercicios2.application;

import enumerations._exercicios2.entities.Client;
import enumerations._exercicios2.entities.Order;
import enumerations._exercicios2.entities.OrderItem;
import enumerations._exercicios2.entities.Product;
import enumerations._exercicios2.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scan = new Scanner(System.in);

        System.out.println("Name: ");
        String name = scan.nextLine();
        System.out.println("Email: ");
        String email = scan.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        Date bithDate = sdf.parse(scan.next());

        Client client = new Client(name, email, bithDate);

        System.out.println("Enter order status: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(scan.next());

        Order order = new Order(new Date(), status, client);

        System.out.println("How many items to this ordem? ");
        int items = scan.nextInt();
        for (int i = 1; i <= items; i++) {
            System.out.println("Enter #" + i + " item data: ");
            System.out.println("Product name: ");
            scan.nextLine();
            String productName = scan.nextLine();
            System.out.println("Product Price: ");
            double procutPrice = scan.nextDouble();

            Product product = new Product(productName, procutPrice);

            System.out.println("Quantity: ");
            int quantity = scan.nextInt();

            OrderItem orderItem = new OrderItem(quantity, procutPrice, product);

            order.addItem(orderItem);
        }
        System.out.println();
        System.out.println("ORDER SUMMARY");
        System.out.println(order);

        scan.close();
    }

}
