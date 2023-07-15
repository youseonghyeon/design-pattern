package factorymethod;

public class App {

    public static void main(String[] args) {
        Car car = new SportCarFactory().orderCar("Ferrari roma", "red");
        System.out.println("car = " + car);

        car = new ElectricCarFactory().orderCar("Tesla model 3", "white");
        System.out.println("car = " + car);
    }
}
