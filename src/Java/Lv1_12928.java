package Java;
//약수의 합

public class Lv1_12928 {
    public int solution(int n) {

        int sum = 0;

        for (int i = 1; i < n + 1; i++) {

            if (n % i == 0) {

                sum += i;
            }
        }
        return sum;
    }
}
