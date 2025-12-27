package creational_design_patterns.factory_pattern.src.abstractfactory.src;

import creational_design_patterns.factory_pattern.src.abstractfactory.src.international.CardPayment;
import creational_design_patterns.factory_pattern.src.abstractfactory.src.international.InternationalTaxCalculator;

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