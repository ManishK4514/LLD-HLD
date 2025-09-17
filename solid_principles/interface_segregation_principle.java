// BAD - Violates ISP
interface IShapeAreaCalculator {
    double calculateArea();
    double calculateVolume(); // 2D shapes don't need this!
}

class Square implements IShapeAreaCalculator {
    @Override
    public double calculateArea() {
        // Calculate square area
        return 0.0;
    }
    
    @Override
    public double calculateVolume() {
        // Forced to implement but doesn't make sense!
        return 0.0;
    }
}

// ----------------------------------separator---------------------------------------------------------

// GOOD - Follows ISP
interface IAreaCalculator {
    double calculateArea();
}

interface IVolumeCalculator {
    double calculateVolume();
}

class Square implements IAreaCalculator {
    @Override
    public double calculateArea() {
        return 0.0;
    }
}

class Cube implements IAreaCalculator, IVolumeCalculator {
    @Override
    public double calculateArea() {
        return 0.0;
    }
    
    @Override
    public double calculateVolume() {
        return 0.0;
    }
}
