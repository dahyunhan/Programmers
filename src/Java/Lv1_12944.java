package Java;
//평균 구하기

public class Lv1_12944 {
    public double solution(int[] arr) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        double res = sum / arr.length;
        return res;
    }
}
