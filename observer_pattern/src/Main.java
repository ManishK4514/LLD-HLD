package observer_pattern.src;

import observer_pattern.src.observer.Observer;
import observer_pattern.src.subject.YouTubeChannel;
import observer_pattern.src.subscriber.Subscriber;

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

        // Bob unsubscribes
        channel.removeObserver(s2);

        channel.uploadVideo("Spring Boot Basics");
    }
}
