public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Harshitha");
        Observer webUser = new WebApp("Admin");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        stockMarket.setStock("TCS", 3500.50);

        stockMarket.setStock("Infosys", 1450.75);
    }
}