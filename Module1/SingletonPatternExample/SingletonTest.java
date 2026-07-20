
public class SingletonTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application Started");
        logger2.log("User Logged in");
        System.err.println("logger1 Hashcode: " + logger1.hashCode());
        System.err.println("logger2 Hashcode: " + logger2.hashCode());

        if (logger1 == logger2) {
            System.out.println("Only one Logger instance exits");
        }
        else{
            System.out.println("Multiple Logger instances exits");
        }
    }
}
