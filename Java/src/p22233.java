import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p22233 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int T, N;
        String input = br.readLine();
        String[] temp = input.split(" ");
        T = Integer.parseInt(temp[0]);
        N = Integer.parseInt(temp[1]);
        HashSet<String> memo = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < T; i++) {
            memo.add(br.readLine());
        }

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ",");
            while (st.hasMoreElements()) {
                String key = st.nextToken();
                memo.remove(key);
            }
            result.add(memo.size());
        }

        for(int remainSize : result) {
            System.out.println(remainSize);
        }
    }
}
