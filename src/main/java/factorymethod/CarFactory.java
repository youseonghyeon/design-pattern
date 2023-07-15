package factorymethod;

public interface CarFactory {

    default Car orderCar(String name, String color) {
        validate(name);
        prepareParts(name);
        return createCar(name, color);
    }

    Car createCar(String name, String color);

    private void prepareParts(String name) {
        System.out.println("부품 준비중 : " + name);
    }

    private void validate(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name must not be null or empty");
        }
    }
}
