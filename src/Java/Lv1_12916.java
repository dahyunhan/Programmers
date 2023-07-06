package Java;
//문자열 내 p와 y의 개수

public class Lv1_12916 {
    boolean solution(String s) {

        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                pCount++;
            }
            if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                yCount++;
            }
        }

        return (pCount == yCount) ? true : false;
    }
}
