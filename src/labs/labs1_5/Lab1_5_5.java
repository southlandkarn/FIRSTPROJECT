import java.util.Scanner; // Обратить внимание на новый импорт.

public class Lab1_5_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите k: ");
        double k=in.nextInt();
        double n=k;
        double sum = n*(n+1)/2;
        {
            System.out.println("The Sum is:"+ sum);
        }
        System.out.println("The Avg is:"+ sum/n);
    }
}
