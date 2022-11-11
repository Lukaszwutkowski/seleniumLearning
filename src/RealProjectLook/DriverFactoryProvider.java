package RealProjectLook;

public class DriverFactoryProvider {
    public static DriverFactory getDriverFactory(String browserType){
        switch (browserType){
            case "chrome":
                return new ChromeBrowser();
            case "edge":
                return new EdgeBrowser();
            case "safari":
                return new SafariBrowser();
            default:
                throw new IllegalStateException("Nieznana przegladarka");
        }
    }
}
