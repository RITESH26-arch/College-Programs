class Item {
    int itemCode;
    String description;
    int quantity;
    double rate;

    Item(int itemCode, String description, int quantity, double rate)
            throws QuantityException, PriceException {
        if (quantity <= 0) {
            throw new QuantityException("Quantity must be greater than zero. Entered: " + quantity);
        }
        if (rate <= 0) {
            throw new PriceException("Rate must be greater than zero. Entered: " + rate);
        }
        this.itemCode = itemCode;
        this.description = description;
        this.quantity = quantity;
        this.rate = rate;
    }

    void display() {
        System.out.printf("%-10d %-20s %-10d %-10.2f%n", itemCode, description, quantity, rate);
    }
}
