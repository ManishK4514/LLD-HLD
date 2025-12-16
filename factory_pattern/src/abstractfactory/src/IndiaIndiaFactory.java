package factory_pattern.src.abstractfactory.src;

import factory_pattern.src.abstractfactory.src.india.IndiaTaxCalculator;
import factory_pattern.src.abstractfactory.src.india.UpiPayment;

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
