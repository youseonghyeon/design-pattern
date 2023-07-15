package flyweight;

public class Client {


    public static void main(String[] args) {
//        Character a = new Character('a', "white", "Arial", 12);
//        Character b = new Character('b', "white", "Arial", 12);
//        Character c = new Character('c', "white", "Arial", 12);
//        Character d = new Character('d', "white", "Arial", 12);

        FontFactory fontFactory = new FontFactory();
        Character a = new Character('a', "white", fontFactory.getFont("Arial:12"));
        Character b = new Character('b', "white", fontFactory.getFont("Arial:12"));
        Character c = new Character('c', "white", fontFactory.getFont("Arial:12"));
        Character d = new Character('d', "white", fontFactory.getFont("Arial:12"));

    }
}
