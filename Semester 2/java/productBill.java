import java.util.*;

interface Bill{

    double calculate();

}

class Product implements Bill{

    String id;

    String name;

    int quantity;

    double unitPrice;

    double total;

    public Product(String id, String name, int quantity, double unitPrice) {

        this.id = id;

        this.name = name;

        this.quantity = quantity;

        this.unitPrice = unitPrice;

        this.total = quantity * unitPrice;

    }

    public double calculate() {

        return total;

    }

    public String toString() {

        return String.format("%-10s %-20s %-10d  %.2f   %.2f",

                id, name, quantity, unitPrice, total);

    }

}

public class productBill {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Order Number: ");

        int orderNumber = sc.nextInt();

        System.out.print("Enter Order Date: ");

        String orderDate = sc.next();

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");

        int numProducts = sc.nextInt();

        for (int i = 1; i <= numProducts; i++) {

            System.out.println("Product " + i + ":");

            System.out.print("Enter Product ID: ");

            String id = sc.next();

            System.out.print("Enter Product Name: ");

            String name = sc.next();

            System.out.print("Enter Quantity: ");

            int quantity = sc.nextInt();

            System.out.print("Enter Unit Price: ");

            double unitPrice = sc.nextDouble();

            Product product = new Product(id, name, quantity, unitPrice);

            products.add(product);

        }

        System.out.println("Order Number: " + orderNumber);

        System.out.println("Order Date: " + orderDate);

        System.out.println("-----------------------------------------------------------");

        System.out.println("Product ID  Product Name       Quantity  Unit Price  Total");

        System.out.println("-----------------------------------------------------------");

        double Total = 0;

        for (Product product : products) {

            System.out.println(product);

            Total += product.calculate();

        }

        System.out.println("-----------------------------------------------------------");

        System.out.printf("\t\t\t\tNet Amount:"+Total+"\n");

    }

}
