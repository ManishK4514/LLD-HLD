package factory_pattern.src.abstractfactory.src.light;

import factory_pattern.src.abstractfactory.src.Button;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Light Button 🌞");
    }
}