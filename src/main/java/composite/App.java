package composite;

public class App {

    public static void main(String[] args) {
        Product product1 = new Product("sun cream", 2500);
        Product product2 = new Product("potato", 3000);
        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        printPrice(product1);
        printPrice(product2);
        printPrice(cart);
    }


    // Product 클래스와 Cart 클래스는 Component 인터페이스를 구현하고 있기 때문에 동일한 타입처럼 처리가 가능
    // 처리 구현부는 각각의 Class에서 정의되어 있음
    private static void printPrice(Component component) {
        System.out.println("price = " + component.getPrice());
    }


}
