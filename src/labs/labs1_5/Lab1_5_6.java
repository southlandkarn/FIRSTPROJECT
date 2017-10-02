package labs.labs1_5;
import java.util.Scanner;
public class Lab1_5_6 {
    public static void main(String[] Args) {
        Scanner dig = new Scanner(System.in);
        System.out.println("Write a digit");
        int a = dig.nextInt();
        int sum = a * a;
        int sumsq = sum + sum;
        System.out.print(sumsq);
    }
}
