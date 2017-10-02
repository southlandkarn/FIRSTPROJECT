package labs.labs1_5;//не работает

public class Lab1_5_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int j = 1;
        for ( i= 1; i <= 9; i++) {
            for (int k = 9; k >= i; k--) ;
            {
                sum = sum + 1;
            }
            {
                System.out.print(i + "|");
            }
            for(j=1;j<=9; j++){
                System.out.print(j+" ");
            }
        }
    }
}
