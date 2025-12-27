package behavioural_design_patterns.observer;

import behavioural_design_patterns.observer.src.observer.Observer;
import behavioural_design_patterns.observer.src.subject.YouTubeChannel;
import behavioural_design_patterns.observer.src.subscriber.Subscriber;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel("ManishTech");

        Observer s1 = new Subscriber("Ajay");
        Observer s2 = new Subscriber("Akash");
        Observer s3 = new Subscriber("Nihal");

        channel.addObserver(s1);
        channel.addObserver(s2);
        channel.addObserver(s3);

        channel.uploadVideo("Observer Design Pattern Explained!");
        channel.uploadVideo("Java Multithreading Tutorial");
        channel.uploadCommunityPost("What should I update next, Kindly comment!");

        // Bob unsubscribes
        channel.removeObserver(s2);

        channel.uploadVideo("Spring Boot Basics");
    }
}
