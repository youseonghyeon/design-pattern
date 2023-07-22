package chainofresponsiblities;

public class Client {

    private final RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("request body");
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        RequestHandler requestHandler = new AuthHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(requestHandler);
        client.doWork();
    }
}
