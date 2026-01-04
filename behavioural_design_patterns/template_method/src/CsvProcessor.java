package behavioural_design_patterns.template_method.src;

public class CsvProcessor extends DataProcessor {
    @Override
    protected void transformData() {
        System.out.println("Transforming CSV data...");
    }
}
