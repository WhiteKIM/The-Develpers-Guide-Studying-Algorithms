import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class util_B {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String today = br.readLine();
        int N = Integer.parseInt(br.readLine());
        int today_Integer = Integer.parseInt(today.replace("-",""));
        int count = 0;
        for(int i = 0; i < N; i++) {
            int Input_Integer = Integer.parseInt(br.readLine().replace("-",""));
            if(today_Integer <= Input_Integer) {
                count++;
            }
        }
        System.out.println(count);
    }
}
