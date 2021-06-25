package FacadePattern;

public class SamsungPhone implements Phone{
    @Override
    public void modelNumber() {
        System.out.println("Samsung S9+");
    }

    @Override
    public void price() {
        System.out.println("50000 INR");
    }
}
