package factorymethod;

public class ElectricCar extends Car {

    private int batteryCapacity;

    public ElectricCar(String name, String color) {
        setName(name);
        setColor(color);
        setBatteryCapacity(100);
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "name=" + getName() +
                ", color=" + getColor() +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}
