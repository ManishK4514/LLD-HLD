package behavioural_design_patterns.observer.src.subject;

import behavioural_design_patterns.observer.src.observer.Observer;
import behavioural_design_patterns.observer.src.observer.Subject;
import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private final String channelName;

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

    public void uploadCommunityPost(String title) {
        System.out.println(channelName + " community post: " + title);
        notifyObservers("New Community Post: " + title);
    }
}
