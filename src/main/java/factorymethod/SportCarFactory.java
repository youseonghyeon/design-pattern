package factorymethod;

public class SportCarFactory implements CarFactory{

    @Override
    public Car createCar(String name, String color) {
        return new SportCar(name, color);
    }
}
