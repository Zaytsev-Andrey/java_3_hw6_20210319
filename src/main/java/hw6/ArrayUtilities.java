package hw6;

import java.util.Arrays;

public class ArrayUtilities implements ArrayUtils {
    @Override
    public int[] subArrAfterLastFour(int[] arr) {
        int[] subArr = new int[0];
        int index = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            throw new RuntimeException("Число 4 не найдено");
        }

        if (index < arr.length - 1) {
            subArr = Arrays.copyOfRange(arr, index + 1, arr.length);
        }

        return subArr;
    }

    @Override
    public boolean containsOnlyOneOrFour(int[] arr) {
        long countOne = Arrays.stream(arr)
                .filter(i -> i == 1)
                .count();

        long countFour = Arrays.stream(arr)
                .filter(i -> i == 4)
                .count();

        if (countOne == 0 || countFour == 0) {
            return false;
        }

        return (countOne + countFour) == arr.length;
    }
}
