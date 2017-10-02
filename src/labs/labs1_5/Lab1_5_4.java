package labs.labs1_5;

public class Lab1_5_4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 300; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " ");
            } else {
                if (i % 4 == 0) {
                    System.out.println(i + " ");
                }
                if (i >= 20)
                {break;}
            }
        }
    }
}




