package creational_design_patterns.factory_pattern.src.abstractfactory.src;

import creational_design_patterns.factory_pattern.src.abstractfactory.src.india.IndiaTaxCalculator;
import creational_design_patterns.factory_pattern.src.abstractfactory.src.india.UpiPayment;

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
