import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class p25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> data = new HashSet<>();
        int enter = 0;
        for(int i = 0; i < N; i++) {
            String input = br.readLine();
            if(input.equals("ENTER")) {
                enter+=1;
            } else {
                data.add(input);
            }
        }

        int result = enter + data.size();
        System.out.println(result);
    }
}
