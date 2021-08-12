package AdapterPattern;

public class AdapterDemo {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.getElement();
        chromeDriver.selectElement();

        IEDriver ieDriver = new IEDriver();
        ieDriver.findElement();
        ieDriver.clickElement();

        WebDriverAdapter adaptor = new WebDriverAdapter(ieDriver);
        adaptor.getElement();
        adaptor.selectElement();
    }
}
