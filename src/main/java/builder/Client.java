package builder;

public class Client {

    public static void main(String[] args) {

        Car car = Car.builder()
                .color("red")
                .battery("100kwh")
                .wheels("20inch")
                .build();

        System.out.println("car = " + car);
    }

}
