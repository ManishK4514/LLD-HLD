package creational_design_patterns.abstract_factory.src.international;

import creational_design_patterns.abstract_factory.src.Payment;

public class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Card.");
    }
}
