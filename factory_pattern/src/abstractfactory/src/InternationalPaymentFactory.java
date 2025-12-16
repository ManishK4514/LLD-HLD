package factory_pattern.src.abstractfactory.src;

import factory_pattern.src.abstractfactory.src.international.CardPayment;
import factory_pattern.src.abstractfactory.src.international.InternationalTaxCalculator;

public class InternationalPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPaymentMethod() {
        return new CardPayment();
    }
    
    @Override
    public TaxCalculator createTaxCalculator() {
        return new InternationalTaxCalculator();
    }

}