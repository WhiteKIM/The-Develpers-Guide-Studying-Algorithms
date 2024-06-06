import java.util.Scanner;

// AAAA, BB로 보드를 덮을 수 있을까
// 입력된 데이터를 기준으로 길이가 두 값을 이용해서 나눌 수 있다면 true, 없다면 false
// AAAA의 길이를 나눌 수 있는 경우와 BB로 나눌 수 있는 경우를 counting하면 될 것 같다.
public class p1343 {

    private static String aaaa = "AAAA";
    private static String bb = "BB";

    public static int a_count = 0;
    private static int b_count = 0;

    private static boolean check = true;

    public static void solved(String data) {
        int length = data.length();

        while (true) {
            if(length == 0)
                return;

            if(length > 0 && length < (bb.length())) {
                check = false;
                return;
            }

            if(length >= aaaa.length()) {
                a_count += length / aaaa.length();
                length = length % aaaa.length();
            }

            if(length >= bb.length()) {
                b_count += length / bb.length();
                length = length % bb.length();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        data = data+".E";//끝내기 문자
        String[] input = data.split("\\.");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < input.length; i++) {
            if(input[i].length() != 0) {
                if(input[i].charAt(0)=='E')
                    break;
            }
            a_count = 0;
            b_count = 0;
            solved(input[i]);
            for(int a = 0; a < a_count; a++) {
                sb.append(aaaa);
            }
            for(int b = 0; b < b_count; b++) {
                sb.append(bb);
            }
            sb.append(".");
        }
        if(data.length() != 0 && input.length == 0) {//X가 없이 ....만 입력된 경우
            System.out.println(data);
        } else {
            if(data.charAt(data.length()-1)!='.')
                sb.deleteCharAt(sb.length()-1);
            if(check) {
                System.out.println(sb.toString());
            } else {
                System.out.println(-1);
            }
        }
    }
}
