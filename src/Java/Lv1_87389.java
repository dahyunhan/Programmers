package Java;

public class Lv1_87389 {
    public int solution(int n) {
        int small = 0;

        if (n % 2 == 0) {
            for (int i = 3; i <= n; i += 2) {

                if (n % i == 1) {
                    return i;
                } else small = i;

            }
            return small;
        } else {
            return 2;
        }
    }
}
