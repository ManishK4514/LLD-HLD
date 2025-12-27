package creational_design_patterns.factory_pattern.src.abstractfactory.src.international;

import creational_design_patterns.factory_pattern.src.abstractfactory.src.TaxCalculator;

public class InternationalTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.2; // 20% GST
    }
}
