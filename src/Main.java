import AirSystem.AirSystem;
import AirSystem.Administrator;
import AirSystem.Airplane;
import AirSystem.Flight;
import AirSystem.Brigade;
import AirSystem.Airport;
import Payment.Payment;
import Payment.Payment.Item;
import StarSystem.Application;
import StarSystem.Planet;
import StarSystem.Star;
import StarSystem.StartSystem;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // №1
//        Item item1 = new Item("Laptop", 1000, 2);
//        Item item2 = new Item("Headphones", 50, 1);
//        Item item3 = new Item("Mouse", 20, 3);
//
//        // Создаем объект класса Payment
//        Payment payment = new Payment();
//
//        // Добавляем товары в покупку
//        payment.addItem(item1);
//        payment.addItem(item2);
//        payment.addItem(item3);
//
//        // Выводим чек
//        payment.displayReceipt();

        // №2
//        Star star = new Star("Solar", 50);
//        StartSystem startSystem = new StartSystem(star);
//        startSystem.AddOrbit(200);
//        startSystem.AddPlanet(new Planet("Earth", 10, 0, 0.05), 0);
//        startSystem.AddPlanet(new Planet("Earth2", 10, 120, 0.05), 0);
//        startSystem.AddPlanet(new Planet("Earth3", 10, 240, 0.05), 0);
//        Application application = new Application(startSystem);
//        application.Run();

        // №3
//        Administrator administrator = new Administrator("Katchan Dmitry");
//        AirSystem system = new AirSystem(administrator);
//
//        Airplane airplane = new Airplane(100);
//        Brigade brigade = system.CreateBrigade(
//                "Ivan", "Danil", "Nikita",
//                "Timofei", new String[]{"Alina", "Vika"}
//        );
//        Airport airport1 = new Airport("Minsk");
//        Airport airport2 = new Airport("Tokio");
//        Airport airport3 = new Airport("Moskva");
//
//        int flightNumber = system.AddFlight(new Flight(airplane, brigade, airport1, airport3));
//        system.CancelFlight(flightNumber);
//        flightNumber = system.AddFlight(new Flight(airplane, brigade, airport1, airport2));
//        system.StartFlight(flightNumber);
//        flightNumber = system.AddFlight(new Flight(airplane, brigade, airport2, airport1));
//        system.PrintInfo();
    }
}