public class Main {

    public static void main(String[] args) {

        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(
                new Task(101, "Design Database", "Pending"));

        taskList.addTask(
                new Task(102, "Develop API", "In Progress"));

        taskList.addTask(
                new Task(103, "Testing", "Pending"));

        System.out.println("All Tasks:");
        taskList.displayTasks();

        System.out.println("\nSearching Task ID 102:");

        Task task = taskList.searchTask(102);

        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("Task Not Found!");
        }

        System.out.println("\nDeleting Task ID 102:");
        taskList.deleteTask(102);

        System.out.println("\nRemaining Tasks:");
        taskList.displayTasks();
    }
}