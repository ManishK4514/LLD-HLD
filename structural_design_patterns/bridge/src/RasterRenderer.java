package structural_design_patterns.bridge.src;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Rasterizing a circle as raster of radius " + radius);
    }
    
}
