package Java;
//서울에서 김서방 찾기

import java.util.Arrays;

public class Lv1_12919 {

    public String solution(String[] seoul) {
        int n = Arrays.asList(seoul).indexOf("Kim");

        return "김서방은 " + n + "에 있다";
    }
}
