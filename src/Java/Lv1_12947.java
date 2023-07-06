package Java;
//하샤드 수

public class Lv1_12947 {
    public boolean solution(int x) {
        int div = 0;
        String str = Integer.toString(x);
        String arr[] = str.split("");

        for (int i = 0; i < arr.length; i++) {
            div += Integer.parseInt(arr[i]);
        }
        if (x % div == 0) {
            return true;
        } else return false;
    }
}
