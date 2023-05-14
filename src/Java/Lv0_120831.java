package Java;
//짝수의 합

public class Lv0_120831 {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;

        if (n < 2) {
            return 0;
        }
        //5번
        for (int i = 1; i < n / 2 + 1; i++) {

            sum += 2 * i;
            //1. 2*1
            //2. 2*2
            //3. 2*3
            answer = sum;
        }

        return answer;
    }
}