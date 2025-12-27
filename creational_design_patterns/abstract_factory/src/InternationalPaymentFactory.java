package creational_design_patterns.abstract_factory.src;

import creational_design_patterns.abstract_factory.src.international.CardPayment;
import creational_design_patterns.abstract_factory.src.international.InternationalTaxCalculator;

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