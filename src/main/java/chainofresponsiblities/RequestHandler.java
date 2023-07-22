package chainofresponsiblities;

public abstract class RequestHandler {

    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handle(Request request) {
        if (next != null) {
            next.handle(request);
        }
    }
}
