/**
 * The real problem the Prototype pattern solves:
 *
 * Some objects are expensive or complex to create because they require
 * heavy initialization, deep configuration, database access, or
 * large object graphs to be built.
 *
 * Examples:
 * - Preconfigured game characters or enemies
 * - Document / report templates
 * - Configured network / system resources
 * - Complex UI components
 *
 * Without Prototype, new objects are created from scratch every time:
 *
 *   GameCharacter c1 = new GameCharacter();   // heavy setup
 *   GameCharacter c2 = new GameCharacter();   // heavy setup again
 *
 * Why that's bad:
 * - Object creation is slow and resource-intensive.
 * - Initialization logic is duplicated.
 * - Performance degrades when many similar objects are needed.
 *
 * The deeper issue: object creation cost is paid repeatedly even when
 * most of the configuration remains the same.
 *
 * Prototype pattern — core idea:
 * - Create new objects by copying an existing object (the prototype).
 * - Avoid repeating expensive construction logic.
 * - Allow new objects to be customized after cloning.
 *
 * Example usage:
 *   GameCharacter prototype = registry.get("WARRIOR");
 *   GameCharacter copy = prototype.clone();
 *
 * Important notes:
 * - Prototypes must implement a safe clone operation.
 * - Deep copying is essential when the object contains mutable state.
 * - Shallow copies can introduce shared-state bugs.
 *
 * NOTE: Use Prototype when object creation is expensive and many
 * similar instances are required. Avoid it when construction is cheap
 * or object graphs are simple.
 */

package creational_design_patterns.prototype;

import creational_design_patterns.prototype.src.CharacterRegistry;
import creational_design_patterns.prototype.src.GameCharacter;

public class Main {
    public static void main(String[] args) {
        GameCharacter c1 = CharacterRegistry.getCharacter("WARRIOR");
        GameCharacter c2 = CharacterRegistry.getCharacter("WARRIOR");

        c1.addWeapon("Axe");

        c1.show();
        c2.show();
    }
}
