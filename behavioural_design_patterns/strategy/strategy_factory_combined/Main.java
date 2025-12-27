/**
 * The real problem the Observer pattern solves:
 *
 * Some objects change state, and multiple independent components
 * must react to those changes without tightly coupling to the source.
 *
 * Without Observer, the subject directly calls each dependent:
 *
 *   class YouTubeChannel {
 *       void uploadVideo(String title) {
 *           sendEmail();
 *           sendNotification();
 *           updateAnalytics();
 *       }
 *   }
 *
 * Why that's bad:
 * - Subject knows all concrete dependents.
 * - Adding or removing reactions requires modifying subject code.
 * - Business logic is mixed with side effects.
 * - Violates Open/Closed Principle.
 *
 * The deeper issue:
 * - State change logic and reaction logic are tightly coupled.
 *
 * Observer pattern — core idea:
 * - Define a one-to-many dependency between a Subject and Observers.
 * - Observers subscribe to the Subject to receive updates.
 * - When the Subject changes state, all subscribed Observers are notified.
 *
 * Subject does NOT know what concrete actions observers perform.
 *
 * Flow:
 *   1. Observers (Subscribers) register themselves with the Subject.
 *   2. Subject changes state (video upload / community post).
 *   3. Subject notifies all registered Observers.
 *   4. Observers react independently.
 *
 * Example usage:
 *   YouTubeChannel channel = new YouTubeChannel("ManishTech");
 *
 *   Observer s1 = new Subscriber("Ajay");
 *   Observer s2 = new Subscriber("Akash");
 *
 *   channel.addObserver(s1);
 *   channel.addObserver(s2);
 *
 *   channel.uploadVideo("Observer Design Pattern Explained!");
 *
 * Benefits:
 * - Subject and observers are loosely coupled.
 * - New observers can be added without changing subject code.
 * - Observers can be added or removed at runtime.
 * - Enables event-driven and extensible designs.
 *
 * Important notes:
 * - Observer handles "who reacts to a change".
 * - Subject handles "when a change happens".
 * - Order of notification should not be relied upon unless explicitly managed.
 *
 * NOTE:
 * - Classic Observer is synchronous and in-process.
 * - In large systems, this pattern is often replaced by async
 *   event systems (Kafka, message queues, Spring Events),
 *   but the conceptual model remains the same.
 */


package behavioural_design_patterns.strategy.strategy_factory_combined;

import behavioural_design_patterns.strategy.strategy_factory_combined.src.BillingService;
import behavioural_design_patterns.strategy.strategy_factory_combined.src.DiscountFactory;
import behavioural_design_patterns.strategy.strategy_factory_combined.src.DiscountStrategy;


public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = DiscountFactory.getDiscountType("STUDENT_DISCOUNT");

        BillingService billing = new BillingService(strategy);
        double finalBill = billing.calculateFinalAmount(1000);
        System.out.println("Final Bill: " + finalBill);
    }
}
