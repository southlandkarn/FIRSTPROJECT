package labs.labs1_5;// не работает

public class Lab1_5_1 {

    public static void main(String[] args) {
        int j = 1;
        for (int i = 1; i <= 8; i++) {
            for (int k = 8; k >= i; k--) ;
            {
                System.out.print(" ");
            }
            do {
                for(int v = 1; v <= i; v++);
                System.out.println(i + " " + j);
                i++;
            } while (i <= 8);
        }
    }
}