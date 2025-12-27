package structural_design_patterns.decorator_pattern.src.pizza;

public class PlainPizza implements Pizza {

  @Override
  public String getDescription() {
    return "Plain Pizza";
  }

  @Override
  public double getCost() {
    return 264.00;
  }
}
