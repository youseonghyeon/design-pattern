package decorator;

public class App {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new Decorator(component);
        component = new ConcreteDecoratorB(component);
        component = new ConcreteDecoratorA(component);

        component.operation();

    }
}
