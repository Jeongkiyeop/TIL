public class number19 {
    public String number19(int n) {
        String answer = "";
        String subak = "수박";
        for (int i = 0; i < n; i++){
            answer += subak;
        }
        return answer.substring(0,n);
    }

    public static void main(String[] args) {
        number19 sol = new number19();
        int n = 3;
        System.out.println(sol.number19(n));
    }
}