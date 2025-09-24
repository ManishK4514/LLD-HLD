package factory_pattern.src.abstractfactory.src;

import factory_pattern.src.abstractfactory.src.light.LightButton;
import factory_pattern.src.abstractfactory.src.light.LightCheckbox;

public class LightFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
