package transerwise.core;

public class ExchangeResponse {
    public enum Status {
        SUCCESS,
        FAIL,
    }

    private Status status;
    private String message;
}
