
public class AdapterPatternTest {
    public static void main(String[] args) {
        PaymentProcessor phonePayProcessor = new PhonePayAdapter(new PhonePayGateway());

        PaymentProcessor gpayProcessor = new GpayAdapter(new GpayGateway());
        phonePayProcessor.processPayment(4500.00);
        gpayProcessor.processPayment(10000.00);
    }
}
