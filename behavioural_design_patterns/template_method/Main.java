/**
 * The real problem the Template Method pattern solves:
 *
 * Without Template Method, similar algorithms are duplicated across classes
 * with only small variations in certain steps:
 *
 *   class CsvProcessor {
 *       void process() {
 *           read();
 *           validate();
 *           parseCsv();
 *           save();
 *       }
 *   }
 *
 *   class JsonProcessor {
 *       void process() {
 *           read();
 *           validate();
 *           parseJson();
 *           save();
 *       }
 *   }
 *
 * Why that's bad:
 * - Core algorithm structure is duplicated.
 * - Changes to the workflow must be made in multiple places.
 * - Inconsistent behavior may appear over time.
 * - Hard to maintain and extend.
 *
 * The deeper issue: the overall workflow is repeated while only
 * specific steps of the algorithm actually vary.
 *
 * Template Method pattern — core idea:
 * - Define the skeleton of an algorithm in a base class.
 * - Allow subclasses to override specific steps without changing
 *   the algorithm’s structure.
 * - Preserve the fixed workflow while enabling controlled customization.
 *
 * Clients depend on the template abstraction, not on concrete implementations.
 *
 * Example usage:
 *   DataProcessor processor = new CsvProcessor();
 *   processor.process();   // follows fixed workflow with custom steps
 *
 * Important notes:
 * - The template method is usually declared final to prevent alteration.
 * - Hook methods can provide optional extension points.
 * - New variants can be added without modifying the core algorithm.
 * - Follows Single Responsibility and Open/Closed Principles.
 *
 * NOTE: Use Template Method when an algorithm’s structure is fixed
 * but certain steps need to vary between implementations.
 */

package behavioural_design_patterns.template_method;

import behavioural_design_patterns.template_method.src.CsvProcessor;
import behavioural_design_patterns.template_method.src.DataProcessor;
import behavioural_design_patterns.template_method.src.JsonProcessor;


public class Main {
    public static void main(String[] args) {
        DataProcessor jsonProcessor = new JsonProcessor();
        jsonProcessor.process();

        DataProcessor csvProcessor = new CsvProcessor();
        csvProcessor.process();
    }
}
