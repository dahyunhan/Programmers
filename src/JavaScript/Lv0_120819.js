function solution(money) {
    //money - 5500*n = rem

    var n;
    var answer = [];
    for (n = 0; (5500 * n) <= money; n++) {

        if (5500 * n <= money) {
            var rem = money - 5500 * n
            answer = [n, rem]
        }

    }
    return answer;
}