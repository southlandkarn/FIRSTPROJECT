package labs;

public class Ternaroper {
    public static void main(String[] args ){
        double x = 1.113;
        String result;

        result = ( x > 1.11 ) ? "more": "less";
        System.out.println(x +" is "+ result);
    }
}