package Payment;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    public static class Item {
        private final String _name;
        private final double _price;
        private final int _quantity;

        public Item(String name, double price, int quantity) {
            this._name = name;
            this._price = price;
            this._quantity = quantity;
        }
    }

    private final List<Item> _items;

    public Payment() {
        this._items = new ArrayList<>();
    }

    public void addItem(Item item) {
        _items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : _items) {
            total += item._price * item._quantity;
        }
        return total;
    }

    public void displayReceipt() {
        System.out.println("Receipt:");
        for (Item item : _items) {
            System.out.printf("%s - %d x %.2f$\n", item._name, item._quantity, item._price);
        }
        System.out.printf("Total: %.2f$\n", calculateTotal());
    }
}
