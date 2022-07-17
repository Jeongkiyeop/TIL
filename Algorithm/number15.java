//알고리즘 작성 : 내적 구하기
public class number15 {
    public int number15(int[] a, int[] b) {
        int answer = 0;
        int mul = 0;
        for(int i = 0; i < a.length; i++){
            mul = a[i] * b[i];
            answer += mul;
        }
        return answer;
    }

// 주어진 예제, 출력용
    public static void main(String[] args) {
        number15 sol = new number15();
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        System.out.println(sol.number15(a,b));

    }
}

