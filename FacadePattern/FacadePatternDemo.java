package FacadePattern;

public class FacadePatternDemo {
    public static void main(String[] args){
        ShopKeeper shopKeeper = new ShopKeeper();
        shopKeeper.iphoneSale();
        shopKeeper.samsungSale();
        shopKeeper.oneplusSale();
    }
}
