public class Product {
    
    int productCode;
    String productName;
    double weight;

    Product(int productCode, String productName, double weight) throws InvalidProductException {
        if (weight > 100) {
            throw new InvalidProductException(
                "Invalid Product: weight " + weight + " exceeds the maximum allowed limit of 100.");
        }
        this.productCode = productCode;
        this.productName = productName;
        this.weight = weight;
    }


    void display() {
        System.out.println("\n--- Product Details ---");
        System.out.println("Product Code : " + productCode);
        System.out.println("Product Name : " + productName);
        System.out.println("Weight       : " + weight);
    }

}
