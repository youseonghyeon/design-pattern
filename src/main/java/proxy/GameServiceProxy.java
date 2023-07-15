package proxy;

public class GameServiceProxy implements GameService {

    private final GameService gameService;

    public GameServiceProxy(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void login(String id, String password) {
        long start = System.currentTimeMillis();
        gameService.login(id, password);
        long end = System.currentTimeMillis();
        System.out.println("login time : " + (end - start) + "ms");
    }
}
