package labs.labs1_5;//не работает
import java.util.Scanner;
public class Lab1_5_2 {
    public static void main(String[] args) {
        char x;
        String var;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" write a number ");
        x = scanner.next().charAt(0);
        if (x<=9);

        switch (x) {
            case '1':
                var = "One";
                break;
            case '2':
                var = "Two";
                break;
            case '3':
                var = "Three";
                break;
            case '4':
                var = "Four";
                break;
            case '5':
                var = "Five";
                break;
            case '6':
                var = "Six";
                break;
            case '7':
                var = "Seven";
                break;
            case '8':
                var = "Eight";
                break;
            case '9':
                var = "Nine";
                break;
            default:
                var = "Other";
        }
        System.out.println(var);
    }
}