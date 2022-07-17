//알고리즘 작성 : 가운데 글자 가져오기
public class number3 {
    public String number3(String s) {
        String a = "";

        if(s.length()%2==1) {
            a = s.substring(s.length()/2,s.length()/2+1);
        } else {

            a = s.substring(s.length()/2-1, s.length()/2+1);
        }

        return a;
    }

    //주어진 예제, 출력용
    public static void main(String[] args) {
        number3 sol = new number3();
        String s = "abcde";
        System.out.println(sol.number3(s));
    }
}

