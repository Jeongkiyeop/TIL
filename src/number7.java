// 알고리즘 작성 : 음양 더하기
class number7 {
    public int number7(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) {
                answer += absolutes[i];
            } else {
                answer += absolutes[i] * (-1);
            }
        }
        return answer;
    }
// 주어진 예제 , 출력용
    public static void main(String[] args) {
        number7 sol = new number7();
        int[] absolutes  = {4,7,12};
        boolean[] signs = {true,false,true};
        System.out.println(sol.number7(absolutes,signs));
    }
}





