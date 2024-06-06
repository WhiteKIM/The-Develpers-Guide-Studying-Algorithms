import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1654 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static long solved(int[] data, int N) {
        long max = 0L;
        long count;
        long min = 1L;

        for(int i = 0; i < data.length; i++) {
            max = Math.max(max, data[i]);
        }

        while (min <= max) {
            long half = (min+max) /2;
            count = 0;
            for(int i = 0; i < data.length; i++) {
                count += data[i]/half;
            }

            if(count < N) {
                max = half -1;
            } else {
                min = half+1;
            }
        }
        return (min+max)/2;
    }

    public static void main(String[] args) throws IOException {
        int K, N;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int[] data = new int[K];
        for(int i = 0; i < K; i++) {
            data[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(solved(data, N));
    }
}
