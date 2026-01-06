/**
 * The real problem the Bridge pattern solves:
 *
 * Without Bridge, systems that have multiple independent dimensions of variation
 * quickly suffer from class explosion due to rigid inheritance hierarchies:
 *
 *   CircleVector
 *   CircleRaster
 *   SquareVector
 *   SquareRaster
 *
 * Why that's bad:
 * - The number of classes grows combinatorially as new dimensions are added.
 * - Adding a new abstraction or implementation requires modifying many classes.
 * - Abstraction and implementation become tightly coupled.
 * - The design becomes rigid and difficult to maintain.
 *
 * The deeper issue: multiple orthogonal concerns are mixed into a single
 * inheritance hierarchy.
 *
 * Bridge pattern — core idea:
 * - Decouple an abstraction from its implementation.
 * - Allow both the abstraction and the implementation to vary independently.
 * - Replace inheritance-based coupling with composition-based delegation.
 *
 * Clients depend on the Abstraction interface, not on concrete implementations.
 *
 * Example usage:
 *   Shape vectorCircle = new Circle(new VectorRenderer(), 5);
 *   Shape rasterCircle = new Circle(new RasterRenderer(), 10);
 *
 *   vectorCircle.draw();
 *   rasterCircle.draw();
 *
 * Important notes:
 * - Abstraction maintains a reference to the Implementor.
 * - Refined abstractions delegate work to the Implementor.
 * - New abstractions or implementations can be added without modifying existing code.
 * - Follows Open/Closed Principle and promotes composition over inheritance.
 *
 * NOTE: Use Bridge when you detect multiple independent axes of change
 * in your design that would otherwise cause inheritance hierarchies to explode.
 */

package structural_design_patterns.bridge;

import structural_design_patterns.bridge.src.Circle;
import structural_design_patterns.bridge.src.RasterRenderer;
import structural_design_patterns.bridge.src.Shape;
import structural_design_patterns.bridge.src.VectorRenderer;

public class Main {
    public static void main(String[] args) {
        Shape circle1 = new Circle(new VectorRenderer(), 5);
        circle1.draw();

        Shape circle2 = new Circle(new RasterRenderer(), 10);
        circle2.draw();
    }
}
