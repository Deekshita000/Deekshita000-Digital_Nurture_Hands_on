public class BuilderPatternTest {

    public static void main(String[] args) {

        // Gaming Computer
        Computer gamingPC = new Computer.Builder()
                .setCpu("Intel Core i9")
                .setRam(32)
                .setStorage(1000)
                .setGraphicsCard("NVIDIA RTX 4080")
                .setOperatingSystem("Windows 11")
                .build();

        // Office Computer
        Computer officePC = new Computer.Builder()
                .setCpu("Intel Core i5")
                .setRam(16)
                .setStorage(512)
                .setOperatingSystem("Windows 10")
                .build();

        System.out.println("Gaming PC:");
        gamingPC.showConfiguration();

        System.out.println("Office PC:");
        officePC.showConfiguration();
    }
}