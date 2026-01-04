/**
 * The real problem the State pattern solves:
 *
 * Without State, an object’s behavior is controlled by large
 * conditional blocks based on its internal state:
 *
 *   if (status.equals("CREATED")) {
 *       // do A
 *   } else if (status.equals("PAID")) {
 *       // do B
 *   } else if (status.equals("SHIPPED")) {
 *       // do C
 *   }
 *
 * Why that's bad:
 * - Conditional logic grows as new states are added.
 * - State-specific behavior becomes tangled in one class.
 * - Adding new states requires modifying existing code.
 * - Hard to understand, test, and maintain.
 *
 * The deeper issue: behavior that depends on state is tightly coupled
 * to the object that owns the state.
 *
 * State pattern — core idea:
 * - Encapsulate state-specific behavior into separate classes.
 * - Allow an object to change its behavior when its internal state changes.
 * - Replace complex conditionals with polymorphism.
 *
 * Clients depend on the State abstraction, not on concrete state classes.
 *
 * Example usage:
 *   Order order = new Order();
 *   order.next();    // transitions based on current state
 *   order.cancel();  // behavior varies by state
 *
 * Important notes:
 * - Each state class represents one valid state of the object.
 * - Transitions between states are explicit and controlled.
 * - New states can be added without modifying existing context logic.
 * - Follows Single Responsibility and Open/Closed Principles.
 *
 * NOTE: Use State when an object’s behavior must change dynamically
 * based on its internal state and conditional logic becomes unmanageable.
 */

package behavioural_design_patterns.state;

import behavioural_design_patterns.state.src.Order;

class Main {
    public static void main(String[] args) {
        Order order = new Order();

        System.out.println("Current Order Status: " + order.getCurrentStatus());
        order.proceedToNext(); // From Placed to Shipped
        System.out.println("Current Order Status: " + order.getCurrentStatus());
        order.proceedToNext(); // From Shipped to Delivered
        System.out.println("Current Order Status: " + order.getCurrentStatus());
        order.cancelOrder(); // Attempt to cancel after delivery
        System.out.println("Current Order Status: " + order.getCurrentStatus());
        order.proceedToNext();
        System.out.println("Current Order Status: " + order.getCurrentStatus());
        order.proceedToNext(); // No further state
    }
}