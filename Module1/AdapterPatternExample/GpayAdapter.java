public class GpayAdapter implements PaymentProcessor {

    private GpayGateway gpayGateway;

    public GpayAdapter(GpayGateway gpayGateway) {
        this.gpayGateway = gpayGateway;
    }

    @Override
    public void processPayment(double amount) {
        gpayGateway.makeCharge(amount);
    }
}