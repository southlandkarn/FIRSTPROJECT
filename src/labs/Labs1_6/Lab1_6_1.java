package labs.Labs1_6;

public class Lab1_6_1 {
    public static void main(String[] args) {
        int[] a = new int[15];
        int i = 0;
        int b = 2;
        while (i < 15) {
            a[i] = b;
            b += 2;
            i++;
        }
        //вывод в строку
        for (i = 0; i < 15; i++)
            System.out.print(a[i] + " ");
    }
}
