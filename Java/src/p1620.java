import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class p1620 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N, M;
        StringBuilder sb= new StringBuilder();
        String input = br.readLine();
        String[] temp = input.split(" ");
        N = Integer.parseInt(temp[0]);
        M = Integer.parseInt(temp[1]);
        HashMap<Integer, String> String_dict = new HashMap<>();
        HashMap<String, Integer> Integer_dict = new HashMap<>();
        for(int i = 1; i <= N; i++) {
            String pocketmon = br.readLine();
            String_dict.put(i, pocketmon);
            Integer_dict.put(pocketmon, i);
        }

        for(int i = 0; i < M; i++) {
            char[] problem = br.readLine().toCharArray();
            if(problem[0] >= 'A' && problem[0] <= 'Z') {
                sb.append(Integer_dict.get(new String(problem))).append("\n");
            } else {
                sb.append(String_dict.get(Integer.parseInt(new String(problem)))).append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}
