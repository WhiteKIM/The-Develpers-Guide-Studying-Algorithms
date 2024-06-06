import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class p9375 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int mixCount(HashMap<String, Integer> data) {
        int count = 1; // 조합가능한 개수
        for(int value : data.values())
            count *= (value+1);

        return count - 1;
    }

    public static void main(String[] args) throws IOException {
        int T;
        T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            HashMap<String, Integer> data = new HashMap<>();
            for(int j = 0; j < N; j++) {
                String[] input = br.readLine().split(" ");
                if(data.containsKey(input[1]))
                    data.put(input[1], data.get(input[1])+1);
                else
                    data.put(input[1], 1);
            }
            sb.append(mixCount(data)).append("\n");
        }
        System.out.println(sb.toString());
    }
}
