package observer_pattern.src.subject;

import observer_pattern.src.observer.Observer;
import observer_pattern.src.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String channelName;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update("[" + channelName + "] " + message);
        }
    }

    // Business logic
    public void uploadVideo(String title) {
        System.out.println(channelName + " uploaded: " + title);
        notifyObservers("New Video: " + title);
    }
}
