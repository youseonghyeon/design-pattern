package builder;

public class Car {

    private String color;
    private String battery;
    private String wheels;

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder {

        private String color;
        private String battery;
        private String wheels;

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder battery(String battery) {
            this.battery = battery;
            return this;
        }

        public CarBuilder wheels(String wheels) {
            this.wheels = wheels;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.color = this.color;
            car.battery = this.battery;
            car.wheels = this.wheels;
            return car;
        }
    }
}
