import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class p17219 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N, M;
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        Map<String, String> data = new HashMap<>();


        for(int i = 0; i < N;  i++) {
            input = br.readLine().split(" ");
            data.put(input[0], input[1]);
        }

        for(int i = 0; i < M; i++) {
            String key = br.readLine();
            sb.append(data.get(key)).append("\n");
        }
        System.out.println(sb.toString());
    }
}
