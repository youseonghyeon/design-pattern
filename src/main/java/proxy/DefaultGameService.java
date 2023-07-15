package proxy;

public class DefaultGameService implements GameService {

    public void login(String id, String password) {
        System.out.println("login : " + id + ", " + password);
    }
}
