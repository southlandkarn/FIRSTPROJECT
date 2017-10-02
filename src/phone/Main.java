package phone;

/**
 * Created by User on 9/21/2017.
 */
public class Main {
    public static void main (String[] args) {
        Phone iphone = new Phone();
        iphone.setColor("Black");
        iphone.setModel("new");


        System.out.println(iphone.getModel());
        System.out.println(iphone.getColor());
    }
}
