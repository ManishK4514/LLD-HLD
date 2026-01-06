/**
 * The real problem the Proxy pattern solves:
 *
 * Without Proxy, client code directly accesses a real object even when
 * that access should be controlled, delayed, secured, or optimized:
 *
 *   Image image = new HighResolutionImage("photo.jpg");
 *   image.display();   // expensive object created immediately
 *
 * Why that's bad:
 * - Expensive objects may be created unnecessarily.
 * - No control over access, security, or usage.
 * - No place to insert caching, logging, or validation.
 * - Client code is tightly coupled to concrete implementations.
 *
 * The deeper issue: access to important objects is not regulated.
 *
 * Proxy pattern — core idea:
 * - Provide a surrogate or placeholder object that controls access
 *   to the real object.
 * - The Proxy implements the same interface as the real object.
 * - Clients interact with the Proxy exactly as they would with the real object.
 *
 * Clients depend on the Subject abstraction, not on concrete implementations.
 *
 * Example usage:
 *   Image image = new ImageProxy("photo.jpg");
 *   image.display();   // real image is created lazily and cached
 *
 * Important notes:
 * - Proxy can enforce access control, lazy loading, logging, and caching.
 * - The real object remains unchanged and unaware of the Proxy.
 * - Different proxy types solve different access problems.
 * - Follows Single Responsibility and Open/Closed Principles.
 *
 * NOTE: Use Proxy when you need to control access to an object without
 * changing its implementation or the client’s usage of it.
 */

package structural_design_patterns.proxy;

import structural_design_patterns.proxy.src.ImageProxy;

public class Main {
    public static void main(String[] args) {
        ImageProxy image = new ImageProxy("photo_high_res.jpg");
        image.display(); 
        image.display(); 
    }
}
