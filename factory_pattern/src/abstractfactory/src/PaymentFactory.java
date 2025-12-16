package factory_pattern.src.abstractfactory.src;

public interface PaymentFactory {
    Payment createPaymentMethod();
    TaxCalculator createTaxCalculator();
}