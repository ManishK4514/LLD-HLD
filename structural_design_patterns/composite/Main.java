/**
 * The real problem the Composite pattern solves:
 *
 * Without Composite, client code must distinguish between individual objects
 * and groups of objects when working with hierarchical structures:
 *
 *   if (item is File) {
 *       item.print();
 *   } else if (item is Folder) {
 *       for (each child in folder) {
 *           child.print();
 *       }
 *   }
 *
 * Why that's bad:
 * - Client code becomes full of type checks and conditional logic.
 * - Adding new component types requires modifying existing code.
 * - Traversal logic is scattered across the application.
 * - Violates Open/Closed Principle.
 *
 * The deeper issue: clients are forced to know the difference between
 * single objects and compositions of objects.
 *
 * Composite pattern — core idea:
 * - Compose objects into tree structures to represent part-whole hierarchies.
 * - Let clients treat individual objects and compositions uniformly.
 * - Hide the complexity of hierarchical structures behind a common interface.
 *
 * Clients depend only on the Component abstraction, not on concrete leaf
 * or composite implementations.
 *
 * Example usage:
 *   FileSystemItem root = new Folder("Root");
 *   root.add(new File("Resume.pdf"));
 *
 *   Folder docs = new Folder("Documents");
 *   docs.add(new File("Notes.txt"));
 *   root.add(docs);
 *
 *   root.showDetails();
 *
 * Important notes:
 * - Composite simplifies client code by removing type checks.
 * - New component types can be added without modifying existing logic.
 * - Recursive structures become easy to traverse and manage.
 * - Follows Single Responsibility and Open/Closed Principles.
 *
 * NOTE: Use Composite when modeling hierarchical structures where
 * individual and grouped objects should be treated uniformly.
 */

package structural_design_patterns.composite;

import structural_design_patterns.composite.src.FileSystemItem;
import structural_design_patterns.composite.src.Folder;
import structural_design_patterns.composite.src.File;

public class Main {
    public static void main(String[] args) {
        // Creating files
        FileSystemItem file1 = new File("file1.txt");
        FileSystemItem file2 = new File("file2.txt");
        FileSystemItem file3 = new File("file3.txt");

        // Creating folders
        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");

        // Building the file system structure
        folder1.addItem(file1);
        folder1.addItem(file2);
        folder2.addItem(file3);
        folder1.addItem(folder2);

        // Displaying details
        folder1.showDetails();
        folder2.showDetails();
    }
}
