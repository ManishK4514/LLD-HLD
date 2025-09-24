package factory_pattern.src.abstractfactory.src.dark;

import factory_pattern.src.abstractfactory.src.Button;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Dark Button 🌑");
    }
}