package composite;

public class App {

    public static void main(String[] args) {
        Product product1 = new Product("sun cream", 2500);
        Product product2 = new Product("sun cream", 3000);
        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        printPrice(product1);
        printPrice(product2);
        printPrice(cart);
    }

    private static void printPrice(Component component) {
        System.out.println("price = " + component.getPrice());
    }


}
