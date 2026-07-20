public class Main {

    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager(10);

        manager.addEmployee(
                new Employee(101, "Harshitha",
                        "Software Engineer", 60000));

        manager.addEmployee(
                new Employee(102, "Rahul",
                        "Tester", 45000));

        manager.addEmployee(
                new Employee(103, "Sneha",
                        "Manager", 85000));

        System.out.println("\nEmployee Records:");
        manager.displayEmployees();

        System.out.println("\nSearching Employee ID 102:");

        Employee employee =
                manager.searchEmployee(102);

        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee Not Found!");
        }

        manager.deleteEmployee(102);

        System.out.println("\nAfter Deletion:");
        manager.displayEmployees();
    }
}