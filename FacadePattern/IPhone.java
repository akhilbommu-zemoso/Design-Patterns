package FacadePattern;

public class IPhone implements Phone{
    @Override
    public void modelNumber() {
        System.out.println("Iphone 12");
    }

    @Override
    public void price() {
        System.out.println("80,000 INR");
    }
}
