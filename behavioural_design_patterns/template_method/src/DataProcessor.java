package behavioural_design_patterns.template_method.src;

public abstract class DataProcessor {
    // Template method
    public final void process() {
        readData();
        validateData();
        transformData();
        saveData();
    }

    protected void readData() {
        System.out.println("Reading data...");
    }

    protected void validateData() {
        System.out.println("Validating data...");
    }

    protected abstract void transformData();

    protected void saveData() {
        System.out.println("Saving data...");
    }    
}
