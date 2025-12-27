package creational_design_patterns.abstract_factory.src.india;

import creational_design_patterns.abstract_factory.src.TaxCalculator;

public class IndiaTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.18; // 18% GST
    }
}
