// BAD - Violates DIP
class LightBulb {
    public void turnOn() {
        System.out.println("LightBulb is turned on");
    }
    
    public void turnOff() {
        System.out.println("LightBulb is turned off");
    }
}

class Switch {
    private LightBulb lightBulb; // Depends on concrete class!
    
    public Switch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }
    
    public void flip(boolean on) {
        if (on) {
            lightBulb.turnOn();
        } else {
            lightBulb.turnOff();
        }
    }
}

// ----------------------------------separator---------------------------------------------------------

// GOOD - Follows DIP
interface Switchable {
    void turnOn();
    void turnOff();
}

class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb is turned on");
    }
    
    @Override
    public void turnOff() {
        System.out.println("LightBulb is turned off");
    }
}

class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan is turned on");
    }
    
    @Override
    public void turnOff() {
        System.out.println("Fan is turned off");
    }
}

class Switch {
    private Switchable device; // Depends on abstraction!
    
    public Switch(Switchable device) {
        this.device = device;
    }
    
    public void flip(boolean on) {
        if (on) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }
}

// Usage
public class dependency_inversion_principle {
    public static void main(String[] args) {
        Switchable lightBulb = new LightBulb();
        Switch lightSwitch = new Switch(lightBulb);
        lightSwitch.flip(true); // Works with any Switchable device
        
        Switchable fan = new Fan();
        Switch fanSwitch = new Switch(fan);
        fanSwitch.flip(true); // Same switch works with fan too!
    }
}
