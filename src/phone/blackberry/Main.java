package phone.blackberry;

/**
 * Created by User on 9/21/2017.
 */
public class Main {
    public static void main(String[] args) {
        PhoneBlackberr iphone = new PhoneBlackberr();
        iphone.setColor("Black");
        iphone.setModel("new");
        iphone.call("bi-bi");


        System.out.println(iphone.getModel());
        System.out.println(iphone.getColor());
        System.out.println(iphone.getPrice());

    }
}