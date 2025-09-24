package factory_pattern.src.abstractfactory;

import factory_pattern.src.abstractfactory.src.DarkFactory;
import factory_pattern.src.abstractfactory.src.LightFactory;
import factory_pattern.src.abstractfactory.src.UIFactory;

public class Main {
    public static void main(String[] args) {
        // Choose Dark Theme
        UIFactory factory = new DarkFactory();
        factory.createButton().render();
        factory.createCheckbox().render();

        // Choose Light Theme
        factory = new LightFactory();
        factory.createButton().render();
        factory.createCheckbox().render();
    }
}