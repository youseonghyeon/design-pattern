package builder;

public class Client {

    public static void main(String[] args) {

        Ev6 ev6 = Ev6.builder()
                .color("red")
                .battery("100kwh")
                .wheels("20inch")
                .build();

        System.out.println("ev6 = " + ev6);

    }

}
