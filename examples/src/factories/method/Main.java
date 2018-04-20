package factories.method;

public class Main {
    public static void main(String[] args) {
        HiringManager devManager = new DevelopmentManager();
        devManager.takeInterview();

        HiringManager marketingManager = new MarketingManager();
        marketingManager.takeInterview();
    }
}
