public class SmsMessage extends Message {

    boolean deliveryStatus = false;

    public SmsMessage(String to, String from, String message) {
        super(to, from, message);
    }

    public boolean isDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(boolean deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    @Override
    public String getDeliveryMethod() {
        return "Через телефон";
    }


    public static String getSOmeString() {
        return "sms";
    }

    public static void main(String[] args) {
        SmsMessage message = new SmsMessage(null, null, null);
        Message another = null;

        System.out.println(SmsMessage.getSOmeString());
        System.out.println(Message.getSOmeString());
    }
}
