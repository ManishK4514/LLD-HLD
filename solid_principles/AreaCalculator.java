// BAD - Violates OCP
public class AreaCalculator {
    public double area(Shape shape) {
        double areaOfShape;
        if(shape instanceof Square) {
            // calculate area of Square
        } else if(shape instanceof Circle) {
            // calculate area of Circle
        }
        // Need to modify this class for every new shape!
        return areaOfShape;
    }
}

// ---------------------------------separator---------------------------------------------------------

// GOOD - Follows OCP
interface IAreaCalculator {
    double area();
}

class Square implements IAreaCalculator {
    @Override
    public double area() {
        System.out.println("Calculating area for Square");
        return 0.0;
    }
}

class Circle implements IAreaCalculator {
    @Override
    public double area() {
        System.out.println("Calculating area for Circle");
        return 0.0;
    }
}

// Can add new shapes without modifying existing code
class Triangle implements IAreaCalculator {
    @Override
    public double area() {
        System.out.println("Calculating area for Triangle");
        return 0.0;
    }
}
