import java.util.Arrays;
import java.util.Scanner;

/**
 * 결과값을 구할 때 String을 사용해서 구하면 메모리 초과가 발생한다.
 * StringBuffer를 활용해서 매모리 초과를 방지한다.
 */
public class p4779 {
    public static String result;
    public static StringBuffer answer = new StringBuffer();

    /**
     * @param input : 사용할 문자열 N : 초기에 입력받은 데이터값, 0이 되면 결과에 해당됨
     * 문자열의 중간에 해당하는 부분의 값을 변경하기 위해서 start, last로 표시를 한다.
     * start, last를 이용해서 문자열을 3부분으로 나누고, 각자 함수를 재귀호출 한다.
     * N = 0이면 모든 문자열이 연속적이지 않은 '-'를 가지므로, 이를 결과에 저장한다.
     */
    public static void cantoer(char[] input, int N) {
        if (N == 0) {
//            result += String.valueOf(input);
            answer.append(String.valueOf(input));
        }

        else {
            int start = input.length/3;
            int last = input.length- start;

            for(int i = start; i < last; i++) {
                input[i]=' ';
            }

            char[] first = Arrays.copyOfRange(input, 0, start);
            char[] mid = Arrays.copyOfRange(input, start, last);
            char[] end = Arrays.copyOfRange(input, last, input.length);

            cantoer(first, N-1);
            cantoer(mid, N-1);
            cantoer(end, N-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input;
        while (sc.hasNextLine()) {
            int T = Integer.parseInt(sc.nextLine());
            result = "";
            int num = (int) Math.pow(3, T);
            input = new char[num];
            for (int i = 0; i < num; i++) {
                input[i] = '-';
            }
            cantoer(input, T);
            answer.append("\n");
        }
        System.out.println(answer);
    }
}
