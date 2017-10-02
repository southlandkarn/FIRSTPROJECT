package labs.Labs1_6;

public class Lab1_6_2 {
    public static void main(String[] Args) {
        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int max = m[0], min = m[0];
        int avg;
        int sum = 0;
        int n = m.length;
        for (int i = 0; i < n; i++) {
            sum += m[i];
            if (max < m[i])
                max = m[i];
            if (min > m[i])
                min = m[i];
        }
        avg = sum / n;
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Avg = "+avg);
    }
}