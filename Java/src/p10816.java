import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p10816 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> data = new HashMap<>();
        N = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            int key = Integer.parseInt(input[i]);

            if(data.containsKey(key)) {
                data.put(key, data.get(key)+1);
            } else {
                data.put(key, 1);
            }
        }

        int M = Integer.parseInt(sc.nextLine());
        input = sc.nextLine().split(" ");
        for(int i = 0; i < M; i++) {
            int key = Integer.parseInt(input[i]);

            if(!data.containsKey(key)) {
                sb.append(0).append(" ");
            } else {
                sb.append(data.get(key)).append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}
