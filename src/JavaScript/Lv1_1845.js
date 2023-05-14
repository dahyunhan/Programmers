//폰켓몬

function solution(nums) {
    //n/2>=(요소 종류 갯수)
    var answer = 0;
    var arr = new Set(nums)
    var newarr = [...arr]
    if (nums.length / 2 < newarr.length) {
        answer = nums.length / 2;
    } else {
        answer = newarr.length
    }

    return answer;
}