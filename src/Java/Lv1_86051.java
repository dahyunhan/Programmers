package Java;

//없는 숫자 더하기
public class Lv1_86051 {
    public int solution(int[] numbers) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < numbers.length; j++) {

                if ((arr[i] == numbers[j])) {
                    arr[i] = 0;

                }
            }
            sum += arr[i];
        }
        return sum;
    }
}
