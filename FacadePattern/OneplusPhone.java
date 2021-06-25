package FacadePattern;

public class OneplusPhone implements Phone{

    @Override
    public void modelNumber() {
        System.out.println("OnePlus Nord");
    }

    @Override
    public void price() {
        System.out.println("28000 INR");
    }
}
