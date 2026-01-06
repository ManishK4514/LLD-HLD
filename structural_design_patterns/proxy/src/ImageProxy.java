package structural_design_patterns.proxy.src;

public class ImageProxy implements Image{
    private HighResolutionImage highResolutionImage;
    private String filename;

    public ImageProxy(String fileName) {
        this.filename = fileName;
    }

    @Override
    public void display() {
        if (highResolutionImage == null) {
            highResolutionImage = new HighResolutionImage(filename);
        }
        highResolutionImage.display();
    }
    
}
