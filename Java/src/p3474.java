import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p3474 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N;
        N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            int five = 5;
            int count = 0;
            while (five <= num) {
                count += num / five;
                five *= 5;
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb.toString());
    }
}
