package Payment;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    public static class Item {
        String name;
        double price;
        int quantity;

        public Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }

    List<Item> items;

    public Payment() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.price * item.quantity;
        }
        return total;
    }

    public void displayReceipt() {
        System.out.println("Receipt:");
        for (Item item : items) {
            System.out.printf("%s - %d x %.2f$\n", item.name, item.quantity, item.price);
        }
        System.out.printf("Total: %.2f$\n", calculateTotal());
    }
}
