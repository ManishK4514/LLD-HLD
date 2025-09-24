package factory_pattern.src.abstractfactory.src;

import factory_pattern.src.abstractfactory.src.dark.DarkButton;
import factory_pattern.src.abstractfactory.src.dark.DarkCheckbox;

public class DarkFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}