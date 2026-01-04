package behavioural_design_patterns.template_method.src;

public class JsonProcessor extends DataProcessor {
    @Override
    protected void transformData() {
        System.out.println("Transforming JSON data...");
    }    
}
