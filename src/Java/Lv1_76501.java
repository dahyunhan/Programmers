package Java;

//음양 더하기
public class Lv1_76501 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {

            if (signs[i] == false) {
                absolutes[i] = absolutes[i] * (-1);
            }
            answer += absolutes[i];
        }

        return answer;
    }
}
