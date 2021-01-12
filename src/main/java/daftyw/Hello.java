package daftyw;

public class Hello {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static Hello of(String name) {
        Hello h = new Hello();
        h.message = name;
        return h;
    }
}
