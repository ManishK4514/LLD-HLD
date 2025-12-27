package behavioural_design_patterns.observer_pattern.src.observer;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String message);
}