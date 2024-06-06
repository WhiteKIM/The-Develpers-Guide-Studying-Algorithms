import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> data = new HashMap<>();
        for(int i = 0; i < N; i++) {
            String input = br.readLine();
            if(data.containsKey(input)) {
                data.put(input, data.get(input)+1);
            } else {
                data.put(input, 1);
            }
        }
        int max = 0;
        for(Map.Entry<String, Integer> entry : data.entrySet()) {
            max = Math.max(entry.getValue(), max);
        }

        List<String> result = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : data.entrySet()) {
            if(max == entry.getValue()) {
                result.add(entry.getKey());
            }
        }

        result.sort(Comparator.naturalOrder());
        System.out.println(result.get(0));
    }
}
