package labs.Labs1_6;

import java.util.Arrays;

public class Lab1_6_3 {
    public static void main(String[] args) {
        String[][] a = {
                {"1", "5", "9", "13"},
                {"2", "6", "10", "14"},
                {"3", "7", "11", "15"},
                {"4", "8", "12", "16"},
        };
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[ i ] [ 0 ] + " ");
            for (int j = 1; j < a[ i ].length; j++)
            {
                System.out.print(a[ i ][ j ] + " ");
            }
            System.out.println( );
        }
    }
}

