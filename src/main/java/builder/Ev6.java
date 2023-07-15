package builder;

public class Ev6 {

    private String color;
    private String battery;
    private String wheels;

    private Ev6() {}

    public static Ev6Builder builder() {
        return new Ev6Builder();
    }

    @Override
    public String toString() {
        return "Ev6{" +
                "color='" + color + '\'' +
                ", battery='" + battery + '\'' +
                ", wheels='" + wheels + '\'' +
                '}';
    }

    public static class Ev6Builder {

        private String color;
        private String battery;
        private String wheels;

        public Ev6Builder color(String color) {
            this.color = color;
            return this;
        }

        public Ev6Builder battery(String battery) {
            this.battery = battery;
            return this;
        }

        public Ev6Builder wheels(String wheels) {
            this.wheels = wheels;
            return this;
        }

        public Ev6 build() {
            Ev6 ev6 = new Ev6();
            ev6.color = this.color;
            ev6.battery = this.battery;
            ev6.wheels = this.wheels;
            return ev6;
        }


    }
}
