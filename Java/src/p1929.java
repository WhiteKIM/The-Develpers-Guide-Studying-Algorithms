import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Do it 알고리즘 - Java
public class p1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] data = new int[M+1];
        for(int i = 1; i <= M; i++) {
            data[i] = i;
        }

        for(int i = 2; i <= Math.sqrt(M); i++) {
            if(data[i] == 0)
                continue;

            for(int j = i+i; j <= M; j = j + i) {
                data[j] = 0;
            }
        }

        for(int i = N; i <= M; i++) {
            if(i == 1 || i == 0)
                continue;
            if(data[i] != 0)
                System.out.println(data[i]);
        }
    }
}
