import java.math.BigDecimal;
import java.util.Scanner;

public class p1676 {

    public static BigDecimal factorial(int N) {
        BigDecimal bigDecimal = new BigDecimal(1);

        if(N == 1 || N == 0) {
            return bigDecimal;
        }

        for(int i = 2; i <= N; i++) {
            bigDecimal = bigDecimal.multiply(BigDecimal.valueOf(i));
        }

        return bigDecimal;
    }

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        BigDecimal factorial = factorial(N);
        String string = factorial.toString();
        int length = string.length()-1;
        int count = 0;
        for(int i = length; i >= 0; i--) {
            if(string.charAt(i)=='0')
                count++;
            else if(string.charAt(i)!='0')
                break;
        }

        System.out.println(count);
    }
}
