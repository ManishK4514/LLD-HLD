package factory_pattern.src.abstractfactory.src.india;

import factory_pattern.src.abstractfactory.src.Payment;

public class UpiPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}
