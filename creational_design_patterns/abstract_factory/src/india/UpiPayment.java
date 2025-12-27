package creational_design_patterns.abstract_factory.src.india;

import creational_design_patterns.abstract_factory.src.Payment;

public class UpiPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}
