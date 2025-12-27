package creational_design_patterns.abstract_factory.src;

import creational_design_patterns.abstract_factory.src.india.IndiaTaxCalculator;
import creational_design_patterns.abstract_factory.src.india.UpiPayment;

public class IndiaIndiaFactory implements PaymentFactory {
    @Override
    public Payment createPaymentMethod() {
        return new UpiPayment();
    }

    @Override
    public TaxCalculator createTaxCalculator() {
        return new IndiaTaxCalculator();
    }

}
