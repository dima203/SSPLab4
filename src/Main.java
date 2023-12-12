import Payment.Payment;
import Payment.Payment.Item;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Laptop", 1000, 2);
        Item item2 = new Item("Headphones", 50, 1);
        Item item3 = new Item("Mouse", 20, 3);

        // Создаем объект класса Payment
        Payment payment = new Payment();

        // Добавляем товары в покупку
        payment.addItem(item1);
        payment.addItem(item2);
        payment.addItem(item3);

        // Выводим чек
        payment.displayReceipt();
    }
}