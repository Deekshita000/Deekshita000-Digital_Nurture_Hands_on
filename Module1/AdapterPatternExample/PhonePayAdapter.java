public class PhonePayAdapter implements PaymentProcessor {

    private PhonePayGateway phonePayGateway;

    public PhonePayAdapter(PhonePayGateway phonePayGateway) {
        this.phonePayGateway = phonePayGateway;
    }

    @Override
    public void processPayment(double amount) {
        phonePayGateway.sendPayment(amount);
    }
}