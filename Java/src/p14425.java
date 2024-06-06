import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class p14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int N = Integer.parseInt(num[0]);
        int M = Integer.parseInt(num[1]);
        Set<String> data = new HashSet<>();
        for(int i = 0; i < N; i++) {
            data.add(br.readLine());
        }

        int count = 0;
        for(int i = 0; i < M; i++) {
            String input = br.readLine();
            if(data.contains(input)) {
                count+=1;
            }
        }
        System.out.println(count);
    }
}
