package structural_design_patterns.proxy.src;

public class HighResolutionImage implements Image{
    private String filename;

    public HighResolutionImage(String fileName) {
        this.filename = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading high resolution image: " + filename + " from disk.");
    }

    @Override
    public void display() {
        System.out.println("Displaying high resolution image: " + filename);
    }
}
