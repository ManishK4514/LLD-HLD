package creational_design_patterns.factory_pattern.src.abstractfactory.src.india;

import creational_design_patterns.factory_pattern.src.abstractfactory.src.TaxCalculator;

public class IndiaTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.18; // 18% GST
    }
}
