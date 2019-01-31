public abstract class  Message {
    private String to;
    private String from;
    private String message;

    public Message(String to, String from, String message) {
        this.to = to;
        this.from = from;
        this.message = message;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getMessage() {
        return message;
    }

    public static String getSOmeString() {
        return "message";
    }

    public abstract String getDeliveryMethod();

    @Override
    public String toString() {
        return String.format("From:%s, To:%s,Message:%s", from, to, message);
    }

}
