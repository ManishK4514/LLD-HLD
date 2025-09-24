package factory_pattern.src.abstractfactory.src.dark;

import factory_pattern.src.abstractfactory.src.Checkbox;

public class DarkCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Dark Checkbox 🌑");
    }
}