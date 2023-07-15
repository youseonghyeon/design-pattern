package proxy;

public class APP {

    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy(new DefaultGameService());
        gameService.login("id", "password");
    }
}
