package creational_design_patterns.factory_pattern.src.abstractfactory.src;

public interface PaymentFactory {
    Payment createPaymentMethod();
    TaxCalculator createTaxCalculator();
}