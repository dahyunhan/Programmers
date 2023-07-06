package Java;
//콜라츠 추측

public class Lv1_12943 {
    public int solution(int num) {

        long value = num;
        int count = 0;


        while (value != 1) {

            if (value % 2 == 0) {
                value = value / 2;
                count++;
                continue;
            } else if (value % 2 != 0) {
                value = (value * 3) + 1;
                count++;
                continue;
            }

            break;
        }

        return (count > 500) ? -1 : count;
    }
}
