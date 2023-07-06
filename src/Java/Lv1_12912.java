package Java;
//두 정수 사이의 합

public class Lv1_12912 {
    public long solution(int a, int b) {
        long sum = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else if (a > b) {
            for (int j = b; j <= a; j++) {
                sum += j;
            }
        } else sum = a;

        return sum;
    }
}
