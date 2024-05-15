package from_Internet;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Double> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void addItem(String itemName, double price) {
        items.put(itemName, price);
    }

    public void removeItem(String itemName) {
        items.remove(itemName);
    }

    public double calculateTotal() {
        double total = 0;
        for (double price : items.values()) {
            total += price;
        }
        return total;
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
// Adding items to the cart
        cart.addItem("Shirt", 25.99);
        cart.addItem("Jeans", 39.99);
// Calculating the total price
        double total = cart.calculateTotal();
        System.out.println("Total price: $" + total); // Output: Total price: $65.98
// Removing an item
        cart.removeItem("Shirt");
// Recalculating the total price after removing an item
        total = cart.calculateTotal();
        System.out.println("Updated total price: $" + total); // Output: Updated total price: $39.99
    }
}