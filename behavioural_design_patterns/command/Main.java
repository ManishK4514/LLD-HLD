/**
 * The real problem the Command pattern solves:
 *
 * Without Command, the object that triggers an action must know
 * exactly how the action is performed and who performs it:
 *
 *   if (buttonType.equals("LIGHT_ON")) {
 *       light.turnOn();
 *   } else if (buttonType.equals("LIGHT_OFF")) {
 *       light.turnOff();
 *   }
 *
 * Why that's bad:
 * - The invoker is tightly coupled to concrete receivers.
 * - Adding new actions requires modifying existing code.
 * - Requests cannot be stored, queued, logged, or undone.
 * - Business logic and control logic become entangled.
 *
 * The deeper issue: requests are bound directly to their execution logic.
 *
 * Command pattern — core idea:
 * - Encapsulate a request as an object.
 * - Decouple the object that issues the request from the object that executes it.
 * - Enable flexible handling of requests (queueing, logging, undo/redo).
 *
 * Clients depend only on the Command abstraction, not on concrete receivers.
 *
 * Example usage:
 *   Command turnOn = new LightOnCommand(light);
 *   Command turnOff = new LightOffCommand(light);
 *
 *   RemoteControl remote = new RemoteControl();
 *   remote.setCommand(turnOn);
 *   remote.pressButton();
 *
 * Important notes:
 * - Command centralizes action logic into standalone objects.
 * - New commands can be added without modifying existing invokers.
 * - Commands can be composed, stored, queued, or undone.
 * - Follows Single Responsibility and Open/Closed Principles.
 *
 * NOTE: Use Command when you need to parameterize objects with actions,
 * support undo/redo, or decouple request senders from receivers.
 */


package behavioural_design_patterns.command;

import behavioural_design_patterns.command.src.Command;
import behavioural_design_patterns.command.src.Light;
import behavioural_design_patterns.command.src.LightOffCommand;
import behavioural_design_patterns.command.src.LightOnCommand;
import behavioural_design_patterns.command.src.RemoteControl;

class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();
        remote.pressUndo();
    }
}