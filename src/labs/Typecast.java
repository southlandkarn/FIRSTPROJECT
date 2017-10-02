package labs;

public class Typecast {
    public static void main(String[] args){
        byte i = 0000101;
        long a = i;
        double b = a;

        double c = 101.9;
        long d = (long)c;
        int f = (int)d;


        System.out.println(" int value " + i);
        System.out.println(" long value " + a);
        System.out.println(" double value " + b);

        System.out.println(" double value "+ c);
        System.out.println(" long value "+ d);
        System.out.println(" int value "+ f);
    }
}
