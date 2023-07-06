package Java;

import java.util.*;

//나누어 떨어지는 숫자 배열
public class Lv1_12910 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> newArr = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0)

                newArr.add(arr[i]);

        }

        int[] arr2 = new int[newArr.size()];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = newArr.get(i);

            Arrays.sort(arr2);

            if (arr2.length < 1) {
                arr2 = new int[]{-1};

            }
        }
        return arr2;

    }
}
