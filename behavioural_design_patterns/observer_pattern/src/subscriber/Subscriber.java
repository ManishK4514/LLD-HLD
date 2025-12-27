package behavioural_design_patterns.observer_pattern.src.subscriber;

import behavioural_design_patterns.observer_pattern.src.observer.Observer;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}

