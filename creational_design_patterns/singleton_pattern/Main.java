/**
 * The real problem the Singleton pattern solves:
 *
 * Some components must have exactly ONE instance across the entire application
 * because multiple instances would cause incorrect behavior or wasted resources.
 *
 * Examples:
 * - Configuration manager (global read-only config)
 * - Connection pool manager
 * - Thread-safe cache
 * - Feature flag / environment registry
 *
 * Without a Singleton, multiple objects can be created accidentally:
 *
 *   Config c1 = new Config();
 *   Config c2 = new Config();   // ❌ two independent configs
 *
 * Why that's bad:
 * - State becomes inconsistent across instances.
 * - Resources are duplicated unnecessarily.
 * - No single source of truth exists.
 *
 * The deeper issue: object lifecycle and instance ownership are not controlled.
 *
 * Singleton pattern — core idea:
 * - Ensure exactly one instance of a class exists in the JVM.
 * - Provide a global, controlled access point to that instance.
 * - Prevent external instantiation using a private constructor.
 *
 * Example usage:
 *   Config config = Config.getInstance();
 *
 * Important notes:
 * - Singleton is about enforcing a constraint, not convenience.
 * - Thread safety must be explicitly handled.
 * - Overusing Singleton leads to hidden dependencies and poor testability.
 *
 * NOTE: In modern applications, dependency-injection containers often manage
 * singleton lifecycles more safely. Use this pattern only when global uniqueness
 * is a true requirement.
 */

package creational_design_patterns.singleton_pattern;

import creational_design_patterns.singleton_pattern.src.singleton.Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
    }
}
