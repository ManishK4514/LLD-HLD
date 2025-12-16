package factory_pattern.src.abstractfactory.src.international;

import factory_pattern.src.abstractfactory.src.Payment;

public class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Card.");
    }
}
