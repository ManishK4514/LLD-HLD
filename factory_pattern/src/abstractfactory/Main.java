package factory_pattern.src.abstractfactory;

import factory_pattern.src.abstractfactory.src.IndiaIndiaFactory;
import factory_pattern.src.abstractfactory.src.InternationalPaymentFactory;
import factory_pattern.src.abstractfactory.src.Payment;
import factory_pattern.src.abstractfactory.src.PaymentFactory;
import factory_pattern.src.abstractfactory.src.TaxCalculator;

public class Main {
    public static void main(String[] args) {
        PaymentFactory factory = new IndiaIndiaFactory();
        Payment payment = factory.createPaymentMethod();
        TaxCalculator taxCalculator = factory.createTaxCalculator();

        payment.pay(1000);
        double tax = taxCalculator.calculateTax(1000);
        System.out.println("Tax calculated: " + tax);

        PaymentFactory factory2 = new InternationalPaymentFactory();
        Payment payment2 = factory2.createPaymentMethod();
        TaxCalculator taxCalculator2 = factory2.createTaxCalculator();

        payment2.pay(2000);
        double tax2 = taxCalculator2.calculateTax(2000);
        System.out.println("Tax calculated: " + tax2);
    }
}