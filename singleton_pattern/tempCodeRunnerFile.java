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

package singleton_pattern;

import singleton_pattern.src.singleton.Singleton;

public class Main {
    public static void main(String[] args) {