package chainofresponsiblities;

public class LoggingRequestHandler extends RequestHandler {

    public LoggingRequestHandler(RequestHandler next) {
        super(next);
    }

    @Override
    public void handle(Request request) {
        System.out.println("- - - 로깅 - - -");
        super.handle(request);
    }
}
