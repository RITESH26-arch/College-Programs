import java.util.*;
public class ItemDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] items = new Item[5];

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("\nEnter details for item " + (i + 1) + ":");

                System.out.print("Item code   : ");
                int code = sc.nextInt();
                sc.nextLine();

                System.out.print("Description : ");
                String desc = sc.nextLine();

                System.out.print("Quantity    : ");
                int qty = sc.nextInt();

                System.out.print("Rate        : ");
                double rate = sc.nextDouble();

                items[i] = new Item(code, desc, qty, rate);
            }

            System.out.println("\n--- Item Details ---");
            System.out.printf("%-10s %-20s %-10s %-10s%n", "Code", "Description", "Quantity", "Rate");
            for (Item item : items) {
                item.display();
            }

        } catch (QuantityException e) {
            System.out.println("QuantityException: " + e.getMessage());
        } catch (PriceException e) {
            System.out.println("PriceException: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input type entered.");
        } finally {
            sc.close();
        }
    }
}