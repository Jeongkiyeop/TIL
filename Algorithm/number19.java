// n값 만큼 문자열(수박) 추출하기
public class number19 {
    public String number19(int n) {
        String answer = "";
        String subak = "수박";
        for (int i = 0; i < n; i++){
            answer += subak;
        }
        return answer.substring(0,n);
    }

//주어진 예제, 출력용
    public static void main(String[] args) {
        number19 sol = new number19();
        int n = 3;
        System.out.println(sol.number19(n));
    }
}