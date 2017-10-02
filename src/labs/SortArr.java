package labs;

import java.util.Arrays;

/**
 * Created by User on 9/14/2017.
 */
    public class SortArr{
        public static void main(String []arg) {
            int[] numbers = new int[]{1, 23, 3, 8, 2, 7, 4};
            int max = numbers[0];
            for(int i = 0; i < numbers.length; i++){
            //Arrays.sort(numbers);
                if (numbers[i]>max){
                    max = numbers[i];

                }

                System.out.println(max);
            }

        }
}
