public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        if (id == 101) {
            return "Harshitha";
        } else if (id == 102) {
            return "Cherry";
        } else {
            return "Customer Not Found";
        }
    }
}