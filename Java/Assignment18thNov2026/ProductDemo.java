import java.util.*;

public class ProductDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter product code: ");
            int code = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter product name: ");
            String name = sc.nextLine();

            System.out.print("Enter weight: ");
            double weight = sc.nextDouble();

            Product p = new Product(code, name, weight);
            p.display();

        } catch (InvalidProductException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input type entered.");
        } finally {
            sc.close();
        }
    }
}
