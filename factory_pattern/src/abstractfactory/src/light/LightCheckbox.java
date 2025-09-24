package factory_pattern.src.abstractfactory.src.light;

import factory_pattern.src.abstractfactory.src.Checkbox;

public class LightCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Light Checkbox 🌞");
    }
}