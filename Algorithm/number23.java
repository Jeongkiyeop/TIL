//알고리즘 작성 : 자연수 뒤집어 배열로 만들기
public class number23 {
    public int[] number23(long n) {

        String str = new String(n + "");
        String strArr[] = str.split("");

        int answer[] = new int[strArr.length];

        for (int i=0; i<strArr.length; i++) {
            answer[i] = Integer.parseInt(strArr[strArr.length - 1 - i]);
        }

        return answer;
    }
// 주어진 예제, 출력용
    public static void main(String[] args) {
        number23 sol = new number23();
        int n = 12345;
        System.out.println(sol.number23(n));
    }
}