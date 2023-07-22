package chainofresponsiblities;

public class AuthHandler extends RequestHandler{
    public AuthHandler(RequestHandler next) {
        super(next);
    }

    @Override
    public void handle(Request request) {
        System.out.println("- - - 인증 - - -");
        super.handle(request);
    }
}
