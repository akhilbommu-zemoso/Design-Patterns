package FacadePattern;

public class ShopKeeper {
    private Phone iphone;
    private Phone samsung;
    private Phone oneplus;

    public ShopKeeper(){
        iphone = new IPhone();
        samsung = new SamsungPhone();
        oneplus = new OneplusPhone();
    }

    public void iphoneSale(){
        iphone.modelNumber();
        iphone.price();
    }

    public void samsungSale(){
        samsung.modelNumber();
        samsung.price();
    }

    public void oneplusSale(){
        oneplus.modelNumber();
        oneplus.price();
    }
}
