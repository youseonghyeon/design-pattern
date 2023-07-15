package factorymethod;

public class ElectricCarFactory implements CarFactory {

    @Override
    public Car createCar(String name, String color) {
        return new ElectricCar(name, color);
    }
}
