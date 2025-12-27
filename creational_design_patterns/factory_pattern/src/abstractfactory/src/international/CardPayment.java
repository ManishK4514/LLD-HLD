package creational_design_patterns.factory_pattern.src.abstractfactory.src.international;

import creational_design_patterns.factory_pattern.src.abstractfactory.src.Payment;

public class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Card.");
    }
}
