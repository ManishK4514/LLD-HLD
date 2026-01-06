package structural_design_patterns.bridge.src;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle as vector of radius " + radius);
    }    
}
