public class DependencyInjectionTest {

    public static void main(String[] args) {

        // Inject dependency through constructor
        CustomerRepository repository =
                new CustomerRepositoryImpl();

        CustomerService service =
                new CustomerService(repository);

        int customerId = 101;

        String customer =
                service.getCustomerById(customerId);

        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customer);
    }
}