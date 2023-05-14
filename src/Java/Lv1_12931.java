package Java;
//자릿수 더하기

public class Lv1_12931 {

    public int solution(int n) {
        int sum = 0;
        String str = Integer.toString(n);

        String arr[] = str.split("");
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.valueOf(arr[i]);
        }

        return sum;
    }
}