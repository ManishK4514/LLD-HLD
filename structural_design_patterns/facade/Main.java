/**
 * The real problem the Facade pattern solves:
 *
 * Without Facade, client code must coordinate multiple subsystem
 * components and know the correct order in which to call them:
 *
 *   OrderValidator.validate(order);
 *   PaymentService.pay(order);
 *   InventoryService.reserve(order);
 *   ShippingService.ship(order);
 *   NotificationService.notify(order);
 *
 * Why that's bad:
 * - Client code is tightly coupled to internal subsystem classes.
 * - Business workflows are duplicated across the application.
 * - Changes in subsystem interactions break existing clients.
 * - Hard to understand, test, and maintain.
 *
 * The deeper issue: system complexity leaks into client code.
 *
 * Facade pattern — core idea:
 * - Provide a single, unified interface to a set of complex subsystems.
 * - Encapsulate subsystem coordination and workflow inside the facade.
 * - Hide internal details from the client.
 *
 * Clients depend only on the Facade, not on concrete subsystem classes.
 *
 * Example usage:
 *   OrderFacade facade = new OrderFacade();
 *   facade.placeOrder();
 *
 * Important notes:
 * - Facade does not replace subsystem functionality; it simplifies access.
 * - Subsystems remain unaware of the Facade.
 * - Multiple facades can exist for different use cases.
 * - Follows Single Responsibility and Dependency Inversion Principles.
 *
 * NOTE: Use Facade when you want to simplify interaction with a complex
 * system and provide a clean, stable entry point for clients.
 */

package structural_design_patterns.facade;

import structural_design_patterns.facade.src.OrderFacade;

public class Main {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder();
    }
}
