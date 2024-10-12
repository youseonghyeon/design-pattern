package bridge;

// Implementor
interface Device {
    void on();

    void off();
}

// Concrete Implementor 1
class TV implements Device {
    public void on() {
        System.out.println("TV is ON");
    }

    public void off() {
        System.out.println("TV is OFF");
    }
}

// Concrete Implementor 2
class Radio implements Device {
    public void on() {
        System.out.println("Radio is ON");
    }

    public void off() {
        System.out.println("Radio is OFF");
    }
}

// Abstraction
abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    abstract void togglePower();
}

// Refined Abstraction
class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    @Override
    void togglePower() {
        System.out.println("Toggling power");
        device.on();
        device.off();
    }
}

// Usage
public class BridgePatternExample {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl tvRemote = new AdvancedRemoteControl(tv);
        tvRemote.togglePower(); // TV is ON, TV is OFF

        Device radio = new Radio();
        RemoteControl radioRemote = new AdvancedRemoteControl(radio);
        radioRemote.togglePower(); // Radio is ON, Radio is OFF
    }
}
