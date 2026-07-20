public class MVCPatternTest {

    public static void main(String[] args) {

        Student model = new Student(
                "Harshitha",
                "101",
                "A");

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(model, view);

        System.out.println("Initial Student Details:");
        controller.updateView();

        System.out.println();

        controller.setStudentName("Aripaka Harshitha");
        controller.setStudentGrade("A+");

        System.out.println("Updated Student Details:");
        controller.updateView();
    }
}