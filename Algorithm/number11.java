// 알고리즘 작성 : x만큼 간격이 있는 n개의 숫자
class number11 {
    public long[] number11(int x, int n) {
        long[] answer = new long[n];
        long num = x;

        for(int i=0; i < answer.length; i++){
            answer[i] = num;
            num += x;
        }
        return answer;
    }
// 주어진 예제, 출력용
    public static void main(String[] args) {
        number11 sol = new number11();
        int x = 4;
        int n = 3;
        System.out.println(sol.number11(x, n));
    }
}