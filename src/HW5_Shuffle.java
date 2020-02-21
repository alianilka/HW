
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HW5_Shuffle {

        public static void main(String[] args) {

            Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,15, 16, 17, 18, 19,20 };

            List<Integer> intList = Arrays.asList(intArray);

            Collections.shuffle(intList);

            intList.toArray(intArray);

            System.out.println("20 integers with random values: " + Arrays.toString(intArray));
        }
    }