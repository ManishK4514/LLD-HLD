package factory_pattern.src.abstractfactory.src.international;

import factory_pattern.src.abstractfactory.src.TaxCalculator;

public class InternationalTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.2; // 20% GST
    }
}
