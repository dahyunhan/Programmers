package Java;
//양꼬치

public class Lv0_120830 {
    public int solution(int n, int k) {
        int discount = n / 10;
        int answer = 0;
        answer = n * 12000 + k * 2000 - discount * 2000;

        return answer;
    }
}
