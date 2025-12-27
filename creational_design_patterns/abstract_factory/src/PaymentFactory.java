package creational_design_patterns.abstract_factory.src;

public interface PaymentFactory {
    Payment createPaymentMethod();
    TaxCalculator createTaxCalculator();
}