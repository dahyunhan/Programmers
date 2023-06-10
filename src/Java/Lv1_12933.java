package Java;

import java.util.*;

public class Lv1_12933 {

    public long solution(long n) {
        String newN = Long.toString(n);
        String[] arr = newN.split("");

        Arrays.sort(arr, Collections.reverseOrder());

        String res = String.join("", arr);
        long anwser = Long.parseLong(res);

        return anwser;
    }
}
